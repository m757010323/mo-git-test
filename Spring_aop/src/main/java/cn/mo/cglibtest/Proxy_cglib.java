package cn.mo.cglibtest;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Proxy_cglib {
    public static void main(final String[] args) {
        final Advice advice = new Advice();
        final Waiter waiter = new Waiter();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Waiter.class);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.before();
                Object invoke = method.invoke(waiter, args);
                advice.after();
                return invoke;
            }
        });
        Waiter waiter1 = (Waiter) enhancer.create();
        waiter1.service();
    }

}
