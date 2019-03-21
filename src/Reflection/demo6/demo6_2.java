package Reflection.demo6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 演示获取反射对象的构造方法，方法修饰符，名字，方法参数
 */
class Person2 {

    public Person2() {

    }

    public Person2(String sex)   {
        this.sex = sex;
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

public class demo6_2 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflection.demo6.Person2");
        } catch (Exception e)   {
            e.printStackTrace();
        }
        Constructor<?> cons[] = demo.getConstructors();
        for (int i = 0; i < cons.length; i++ )  {
            Class<?> p[] = cons[i].getParameterTypes();
            System.out.print("构造方法：");
            int mo = cons[i].getModifiers();
            System.out.print(Modifier.toString(mo) + " ");
            System.out.print(cons[i].getName());
            System.out.print("(");
            for (int j = 0; j<p.length; ++j)    {
                System.out.print(p[j].getName() + " arg" + j);
                if (j<p.length-1)
                    System.out.print(",");
            }
            System.out.println("){}");
        }
    }
}
