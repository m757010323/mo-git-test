package cn.mo.aop;

import cn.mo.anno.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContex-anno.xml")
public class testanno {
    @Autowired
    private Target1interface target1interface;

    @Autowired
    private Testdemo2 testdemo2;

    @Test
    public void test2(){
        testdemo2.test1();
    }

    @Test
    public void test(){
        target1interface.test();
    }
    @Autowired
    private TestStrong testStrong;
    @Test
    public void testdemo3(){
        String s = testStrong.returnString();
        System.out.println(s);
    }

    @Test
    public void testdemo003(){
        String s = testdemo2.test2();

    }

}