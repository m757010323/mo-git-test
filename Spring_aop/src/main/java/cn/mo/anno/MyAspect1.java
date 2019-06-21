package cn.mo.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("Myaspect")
@Aspect
public class MyAspect1 {

    @Before("pointcut()")
    public void before(){
        System.out.println("前置");
    }

    @Around("MyAspect1.pointcut()")
    public Object around(ProceedingJoinPoint pdj) throws Throwable {
        System.out.println("前置环绕");
        Object proceed = pdj.proceed();
        System.out.println("后置环绕");
        return proceed;
    }


    @AfterReturning(returning = "string",pointcut = "pointcut()")
    public void returning(String string){
        System.out.println("我是个后置增强");
        System.out.println(string);
    }
    @After("execution(* cn.mo.anno.*.*(..))")
    public void after(){
        System.out.println("你总得让老子执行");
    }
    @Pointcut("execution(* cn.mo.anno.*.*(..))")
    public void pointcut(){}
}
