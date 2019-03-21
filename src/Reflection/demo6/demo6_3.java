package Reflection.demo6;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 演示返回方法信息(含异常)
 *
 * Result:
 * public java.lang.String getSex ()
 * public void setSex (java.lang.String arg0)
 * public void sayChina ()
 * public void sayHello (java.lang.String arg0,int arg1)
 * public final native void wait (long arg0) throws java.lang.InterruptedException
 * public final void wait (long arg0,int arg1) throws java.lang.InterruptedException
 * public final void wait () throws java.lang.InterruptedException
 * public boolean equals (java.lang.Object arg0)
 * public java.lang.String toString ()
 * public native int hashCode ()
 * public final native java.lang.Class getClass ()
 * public final native void notify ()
 * public final native void notifyAll ()
 *
 */
class Person3 {

    public Person3() {

    }

    public Person3(String sex)   {
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

public class demo6_3 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflection.demo6.Person3");
        } catch (Exception e)   {
            e.printStackTrace();
        }
        Method[] methods = demo.getMethods();
        for (int i = 0; i < methods.length; i++)    {
            Class<?> returnType = methods[i].getReturnType();
            Class<?> para[] = methods[i].getParameterTypes();
            int temp = methods[i].getModifiers();
            System.out.print(Modifier.toString(temp) + " ");
            System.out.print(returnType.getName() + " ");
            System.out.print(methods[i].getName() + " ");
            System.out.print("(");
            for (int j=0 ; j < para.length; j++)    {
                System.out.print(para[j].getName() + " " + "arg" + j);
                if (j<para.length-1)    {
                    System.out.print(",");
                }
            }
            Class<?> exce[] = methods[i].getExceptionTypes();
            if (exce.length>0)  {
                System.out.print(") throws ");
                for (int k=0 ; k<exce.length ; k++) {
                    System.out.print(exce[k].getName() + " ");
                    if (k<exce.length-1)
                        System.out.print(",");
                }
            } else {
                System.out.print(")");
            }
            System.out.println();
        }
    }
}
