package com.itheima.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/user")
public class UserController {

    // 请求地址  http://localhost:8080/user/quick
    @RequestMapping(value="/quick",method = RequestMethod.GET,params = {"username"})
    public String save(){
        System.out.println("Controller save running....");
        return "success";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET,params = {"username","age"})
    @ResponseBody
    public void test(User user){
        System.out.println(user);

    }

    @RequestMapping("/model")
    public ModelAndView modelltest(){
        /**
         * model:用来封装数据
         * view:用来展示数据
         */

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","zhangsan");
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping(value = "/testdemo3")
    public ModelAndView testdemo3(ModelAndView modelAndView) throws UnsupportedEncodingException {
        modelAndView.addObject("username","zhangsan");
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping("/quick4")
    public String test4(Model model) throws UnsupportedEncodingException {


        model.addAttribute("username","张三");
        return "index";
    }
    @RequestMapping("/quick5")
    public String test5(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        request.setAttribute("username","张三");
        return "index";
    }
    @RequestMapping("/test6")
    @ResponseBody
    public String test6(){

        return "hello world";
    }

    @RequestMapping("/test7")
    @ResponseBody
    public String test7() throws IOException {
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(22);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(user);
        return s;
    }
    @RequestMapping("/test8")
    @ResponseBody
    public User test8(){
        User user = new User();
        user.setUsername("zhangsanfeng");
        user.setAge(101);
        return user;
    }





}
