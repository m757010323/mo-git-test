package cn.mo.anno;

import org.springframework.stereotype.Component;

@Component("target1")
public class Testdemo2 {
    public void test1(){
        System.out.println("我没有实现接口,我被增强");
    }

    public String test2(){
        return "hello world";
    }
}
