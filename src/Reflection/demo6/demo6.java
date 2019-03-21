package Reflection.demo6;
import java.lang.reflect.Constructor;

/**
 * 演示获取反射类的构造方法
 *
 * Result:
 * 构造方法： public Reflection.demo6.Person()
 * 构造方法： public Reflection.demo6.Person(java.lang.String)
 *
 */
class Person {
    public Person() {

    }

    public Person(String sex)   {
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

public class demo6 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflection.demo6.Person");
        } catch (Exception e)   {
            e.printStackTrace();
        }
        Constructor<?> cons[] = demo.getConstructors();
        for (int i=0 ; i<cons.length ; i++) {
            System.out.println("构造方法： " + cons[i]);
        }
    }
}
