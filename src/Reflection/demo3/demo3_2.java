package Reflection.demo3;

import java.lang.reflect.Constructor;

/**
 * 演示通过Class调用其他类的构造函数创建其他类的对象
 *
 * Result:
 * [null  0]
 * [Rollen  0]
 * [null  20]
 * [Rollen  20]
 *
 * 注意getConstructors返回的构造函数的顺序，首个定义的构造函数位于构造器数组的最后
 */
public class demo3_2 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflection.demo3.Person");
        } catch (ClassNotFoundException e)  {
            e.printStackTrace();
        }
        Person per1 = null;
        Person per2 = null;
        Person per3 = null;
        Person per4 = null;

        //获得所有构造函数，返回Constructor类的实例
        Constructor<?> cons[] = demo.getConstructors();
        try {
            per1 = (Person)cons[3].newInstance();
            per2 = (Person)cons[2].newInstance("Rollen");
            per3 = (Person)cons[1].newInstance(20);
            per4 = (Person)cons[0].newInstance("Rollen",20);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
    }
}
