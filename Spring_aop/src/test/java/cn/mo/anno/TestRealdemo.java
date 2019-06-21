package cn.mo.anno;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataSourcetest.class)
public class TestRealdemo {

    @Autowired
    private Testdemo2 testdemo2;

    @Test
    public void test(){
     testdemo2.test1();
        String s = testdemo2.test2();
        System.out.println(s);
    }
}
