package Reflection.demo12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 演示动态代理
 * 1.公用接口
 * 2.真实对象
 * 3.代理对象，通过实现InvocationHandler接口
 *
 *
 * Result:
 * 进入代理方法
 * 真实方法执行完毕
 * Rollen  20
 *
 * Doubt：为何真实方法执行滞后
 *
 */

//定义公用接口
interface Subject {
    public String say(String name, int age);
}

//定义真实对象
class RealSubject implements Subject {
    @Override
    public String say(String name, int age) {
        return name + "  " + age;
    }
}

//代理对象，通过实现InvocationHandler接口
class MyInvocationHandler implements InvocationHandler {
    private Object obj = null;

    public Object bind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理方法");
        Object temp  = method.invoke(this.obj, args);
        System.out.println("真实方法执行完毕");
        return temp;
    }
}

public class demo12 {
    public static void main(String[] args) {
        MyInvocationHandler demo = new MyInvocationHandler();
        Subject sub = (Subject) demo.bind(new RealSubject());
        String info = sub.say("Rollen", 20);
        System.out.println(info);
    }

}
