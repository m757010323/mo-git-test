package cn.mo.anno;

import org.springframework.stereotype.Component;

@Component("Target")
public class Test1impl implements Target1interface {
    public void test() {
        System.out.println("我被增强");
    }
}
