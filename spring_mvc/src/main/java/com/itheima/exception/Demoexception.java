package com.itheima.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/exception")
public class Demoexception {

    @RequestMapping("/show2")
    @ResponseBody
    public void show2(){
        int a =1;
        int i = a / 0;
    }



    @RequestMapping("/show1")
    @ResponseBody
    public void show1(){
        String s = "sjhid";
        Integer.parseInt(s);
    }

}
