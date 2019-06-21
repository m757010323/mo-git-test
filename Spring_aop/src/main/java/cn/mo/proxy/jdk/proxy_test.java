package cn.mo.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxy_test {

    public static void main(String[] args) {

        final Targetimpl targetimpl = new Targetimpl();
        TargetInterface pro = (TargetInterface) Proxy.newProxyInstance(targetimpl.getClass().getClassLoader(), targetimpl.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = method.invoke(targetimpl, args);
                return invoke;
            }
        });
        pro.test();
    }
}
