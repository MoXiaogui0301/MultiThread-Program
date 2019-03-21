package Reflection.demo3;

/**
 * 通过反射调用无参构造器实例化函数
 *
 * Result:
 * [Rollen  20]
 *
 * 注意，如果Person只定义含参构造器，覆盖原有无参构造器
 * 那么程序会报空指针异常
 *
 * java.lang.InstantiationException: Reflection.demo3.Person
 * 	at java.base/java.lang.Class.newInstance(Class.java:571)
 * 	at Reflection.demo3.demo3_1.main(demo3_1.java:36)
 * 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 * 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 * 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 * 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
 * 	at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
 * Caused by: java.lang.NoSuchMethodException: Reflection.demo3.Person.<init>()
 * 	at java.base/java.lang.Class.getConstructor0(Class.java:3350)
 * 	at java.base/java.lang.Class.newInstance(Class.java:556)
 * 	... 6 more
 * Exception in thread "main" java.lang.NullPointerException
 * 	at Reflection.demo3.demo3_1.main(demo3_1.java:40)
 * 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 * 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 * 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 * 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
 * 	at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
 *
 * 	此时，需要手动定义Person的无参构造器
 *
 */
public class demo3_1 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflection.demo3.Person");
        }catch (ClassNotFoundException e)   {
            e.printStackTrace();
        }
        Person person = null;
        try {
            person = (Person) demo.newInstance();
        }catch (InstantiationException | IllegalAccessException e)   {
            e.printStackTrace();
        }
        person.setName("Rollen");
        person.setAge(20);
        System.out.println(person);
    }
}

class Person{

    private String name;
    private int age;

    //没有无参构造器，调用newInstance()方法创建Person实例时将会报错
    public Person(){

    }

    public Person(String name)  {
        this.name = name;
    }

    public Person(int age)  {
        this.age = age;
    }

    public Person(String name,int age)  {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "[" + this.name + "  " + this.age + "]";
    }
}
