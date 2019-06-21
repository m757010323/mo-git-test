package cn.mo.anno;

import org.springframework.stereotype.Component;

@Component("TargetStrong")
public class TestStrong {

    public String returnString(){
        String s = "hello world";
        return s;
    }
}
