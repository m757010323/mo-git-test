package cn.mo.proxy.cglib;

import cn.mo.proxy.jdk.TargetInterface;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxy_test {

    public static void main(final String[] args) {

        final Targetimpl targetimpl = new Targetimpl();
        //1.创建增强器
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(Targetimpl.class);
        //3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("前置增强");
                Object invoke = method.invoke(targetimpl, args);
                System.out.println("后置增强");
                return invoke;
            }
        });
        //4.创建代理对象
        Targetimpl pro = (Targetimpl) enhancer.create();

        pro.test();
    }
}
