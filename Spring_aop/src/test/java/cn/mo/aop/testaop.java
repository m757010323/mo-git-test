package cn.mo.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContex.xml")
public class testaop {
    @Autowired
    private TargetInterface targetInterface;
    @Autowired
    private Testdemo testdemo;

    @Test
    public void test01(){
        targetInterface.test();
    }

    @Test
    public void testdemo02(){
        testdemo.test();
    }
    @Autowired
    private Stringdemo stringdemo;

    @Test
    public void testdemo2(){
        String string = stringdemo.getString();
        System.out.println(string);
    }

}
