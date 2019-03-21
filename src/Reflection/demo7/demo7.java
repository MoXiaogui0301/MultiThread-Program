package Reflection.demo7;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 演示获取反射类的属性
 * <p>
 * Result:
 * ====================本类定义的属性====================
 * public java.lang.String sex;
 * ====================所有public属性，含继承父类和实现的接口==========
 * public java.lang.String sex;
 * public static final java.lang.String name;
 * public static final int age;
 */

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

public class demo7 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflection.demo7.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("====================本类定义的属性====================");
        //取得本类的全部属性
        Field[] fields = demo.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            //权限修饰符
            int mo = fields[i].getModifiers();
            String priv = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields[i].getType();
            System.out.println(priv + " " + type.getName() + " " + fields[i].getName() + ";");
        }
        System.out.println("====================所有public属性，含继承父类和实现的接口==========");
        Field[] fields2 = demo.getFields();
        for (int i = 0; i < fields2.length; i++) {
            //权限修饰符
            int mo = fields2[i].getModifiers();
            String priv = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields2[i].getType();
            System.out.println(priv + " " + type.getName() + " " + fields2[i].getName() + ";");
        }
    }
}
