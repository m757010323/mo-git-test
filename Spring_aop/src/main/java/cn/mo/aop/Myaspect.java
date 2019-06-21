package cn.mo.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Myaspect {
    public void before(){
        System.out.println("前置增强");
    }
    /**
     * ①导入 AOP 相关坐标
     * 使用第三方aop框架aspectjweaver来进行配置比较好
     *
     * ②创建目标接口和目标类（内部有切点）
     *
     * ③创建切面类（内部有增强方法）
     *
     * ④将目标类和切面类的对象创建权交给 spring
     *
     * ⑤在 applicationContext.xml 中配置织入关系
     *
     * ⑥测试代码
     */


    public Object around(ProceedingJoinPoint pdj) throws Throwable {
        System.out.println("前置环绕");
        Object proceed = pdj.proceed();
        System.out.println("后置环绕");
        return proceed;
    }

    public void afterruntning(String string){
        System.out.println("我是一个后置增强");

    }
}
