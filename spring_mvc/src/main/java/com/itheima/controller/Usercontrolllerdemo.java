package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.domain.VO;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/userdemo")

public class Usercontrolllerdemo {

    @RequestMapping("/test1")
    @ResponseBody
    public void test1(String username,int age){
        System.out.println(username);
        System.out.println(age);
    }
    @RequestMapping("/test2")
    @ResponseBody
    public void test2(User user){
        System.out.println(user);
    }
    @RequestMapping("/test3")
    @ResponseBody
    public void test3(String[] strs){
        System.out.println(Arrays.toString(strs));
        System.out.println(strs);
    }
    @RequestMapping("/test4")
    @ResponseBody
    public void test4(VO vo){
        System.out.println(vo);
    }


    @RequestMapping("/test5")
    @ResponseBody
    public void test5(@RequestBody List<User> userList){
        System.out.println(userList);

    }

    /**
     * 将浏览器请求的name参数映射到username上
     * 并且浏览器只能请求name
     * required:默认为ture,指的是提交如果没有此参数则报错,
     * defaultValue:当没有指定请求参数时,则使用指定的默认值赋值
     * @param username
     */
    @RequestMapping("/test6")
    @ResponseBody
    public void test6(@RequestParam(value = "name",required = false) String username){
        System.out.println(username );
    }


    @RequestMapping("/test7/{name}")
    @ResponseBody
    public void test7(@PathVariable(value = "name",required = true) String username){
        System.out.println(username);

    }

    @RequestMapping("/test8")
    @ResponseBody
    public void tsst8(Date date){
        System.out.println(date);
    }
    @RequestMapping("/test9")
    @ResponseBody
    public void test9(@RequestHeader(value = "User-Agent",required = false) String user_agent){
        System.out.println(user_agent);

    }

    @RequestMapping("/test10")
    @ResponseBody
    public void test10(@CookieValue(value = "JSESSIONID") String cookie){
        System.out.println(cookie);
    }

    @RequestMapping("/test11")
    @ResponseBody
    public void test11(String username, MultipartFile uploadfile) throws IOException {

        System.out.println(username);

        System.out.println(uploadfile);
        CommonsMultipartFile commonsMultipartFile = (CommonsMultipartFile) uploadfile;

        DiskFileItem fileItem = (DiskFileItem) commonsMultipartFile.getFileItem();
        InputStream inputStream = fileItem.getInputStream();
        byte[] b = new byte[1024];
        int a;

        while((a = inputStream.read(b))!=-1){
            System.out.println(new String(b));


        }
        String originalFilename = uploadfile.getOriginalFilename();
        uploadfile.transferTo(new File("D:\\upload\\"+originalFilename));

    }
}
