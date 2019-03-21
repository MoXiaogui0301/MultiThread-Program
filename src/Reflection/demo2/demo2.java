package Reflection.demo2;

/**
 * 通过反射实例化Class类对象
 *
 * Result:
 * demo1类名：Reflection.demo2.Demo
 * demo2类名：Reflection.demo2.Demo
 * demo3类名：Reflection.demo2.Demo
 *
 */

class Demo  {

}
public class demo2 {
    public static void main(String[] args) {
        Class<?> demo1 = null;
        Class<?> demo2 = null;
        Class<?> demo3 = null;

        //方法一，通过Class类的forName()方法获得Demo类的实例
        try{
            demo1 = Class.forName("Reflection.demo2.Demo");
        }catch (ClassNotFoundException e)   {
            e.printStackTrace();
        }
        //方法二，通过getClass()方法
        demo2 = new Demo().getClass();
        //方法三，通过 类名+.class 获得类文件
        demo3 = Demo.class;

        System.out.println("demo1类名：" + demo1.getName());
        System.out.println("demo2类名：" + demo2.getName());
        System.out.println("demo3类名：" + demo3.getName());

    }
}
