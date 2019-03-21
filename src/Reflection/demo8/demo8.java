package Reflection.demo8;

/**
 * 通过反射调用类的方法
 * Class.getMethod()方法获取要调用的方法，再通过Method.invoke执行
 */

import java.lang.reflect.Method;

interface China {
    public static final String name = "Rollen";
    public static int age = 20;

    public void sayChina();

    public void sayHello(String name, int age);
}

class Person implements China {
    public Person() {

    }

    public String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void sayChina() {
        System.out.println("hello，china");
    }

    @Override
    public void sayHello(String name, int age) {
        System.out.println(name + "     " + age);
    }
}

public class demo8 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflection.demo8.Person");
        } catch (Exception e)   {
            e.printStackTrace();
        }
        try {
            //调用Person类中的sayChina方法
            Method method = demo.getMethod("sayChina");
            method.invoke(demo.newInstance());
            //调用Person类的sayHello方法
            method = demo.getMethod("sayHello",String.class,int.class);
            method.invoke(demo.newInstance(),"Rollen",20);
        } catch (Exception e)   {
            e.printStackTrace();
        }
    }
}
