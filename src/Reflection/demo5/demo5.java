package Reflection.demo5;

/**
 * 演示通过反射获取反射对象的父类
 *
 * Result:
 * 继承的父类为： java.lang.Object
 *
 */

class Person {
    public Person() {

    }

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sayChina() {
        System.out.println("hello，china");
    }

    public void sayHello(String name, int age) {
        System.out.println(name + "     " + age);
    }
}

public class demo5 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflection.demo5.Person");
        } catch (Exception e)   {
            e.printStackTrace();
        }
        //获取父类
        Class<?> temp = demo.getSuperclass();
        System.out.println("继承的父类为： " + temp.getName());
    }
}
