package Reflection.demo4;

/**
 * 演示通过反射获取类的接口
 *
 * Result:
 * 实现的接口   Reflection.demo4.China
 *
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

    private String sex;

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

public class demo4 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflection.demo4.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Class<?> intes[] = demo.getInterfaces();
        for (int i = 0; i < intes.length; i++) {
            System.out.println("实现的接口   " + intes[i].getName());
        }
    }
}
