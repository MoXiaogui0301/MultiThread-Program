package Reflection.demo10;
/**
 * 通过反射操作类的属性
 *
 * field = demo.getDeclaredField("sex");
 * field.set(obj,"男");
 * field.get(obj);
 *
 * Result:
 * 男
 *
 */

import java.lang.reflect.Field;

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

public class demo10 {
    public static void main(String[] args) {
        Class<?> demo = null;
        Object obj = null;
        try {
            demo = Class.forName("Reflection.demo10.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            obj = demo.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Field field = null;
        try {
        field = demo.getDeclaredField("sex");
        } catch (Exception e) {
            e.printStackTrace();
        }
        field.setAccessible(true);
        try {
            field.set(obj,"男");
            System.out.println(field.get(obj));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
