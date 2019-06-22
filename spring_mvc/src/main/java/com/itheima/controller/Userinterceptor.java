package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/filter")
public class Userinterceptor {

    @RequestMapping("/filter")
    public ModelAndView test1(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("name","zhangsan");
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping("/string")
    @ResponseBody
    public void returnuser(List<String> lists){
        System.out.println(lists.size());
    }

    @RequestMapping("/test")
    @ResponseBody
    public void test32(@RequestBody User user){
        System.out.println("hello world");
        System.out.println(user.getUsername());
        System.out.println(user.getAge());
    }
}
