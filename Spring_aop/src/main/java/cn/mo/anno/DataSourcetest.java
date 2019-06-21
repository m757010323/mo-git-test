package cn.mo.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.mo.anno")
@EnableAspectJAutoProxy
public class DataSourcetest {
    @Autowired
    private MyAspect1 myAspect1;




}
