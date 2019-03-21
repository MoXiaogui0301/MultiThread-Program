package Reflection.demo9;
/**
 * 调用反射类的get和set方法
 *
 * Method method = obj.getClass().getMethod("get" + att);
 * Method method = obj.getClass().getMethod("set" + att,type);
 *
 * Result:
 * male
 *
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

public class demo9 {
    public static void main(String[] args) {
        Class<?> demo = null;
        Object obj = null;
        try {
            demo = Class.forName("Reflection.demo9.Person");
        }catch (Exception e)    {
            e.printStackTrace();
        }
        try {
            obj = demo.newInstance();
        }catch (Exception e)    {
            e.printStackTrace();
        }
        setter(obj,"Sex","male",String.class);
        getter(obj,"Sex");
    }

    public static void getter(Object obj,String att)    {
        try {
            Method method = obj.getClass().getMethod("get" + att);
            System.out.println(method.invoke(obj));
        }catch (Exception e)    {
            e.printStackTrace();
        }
    }

    public static void setter(Object obj,String att,Object value,Class<?> type) {
        try {
            Method method = obj.getClass().getMethod("set" + att,type);
            method.invoke(obj,value);
        }catch (Exception e)    {
            e.printStackTrace();
        }
    }
}
