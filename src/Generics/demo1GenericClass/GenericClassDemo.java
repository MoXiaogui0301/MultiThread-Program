package Generics.demo1GenericClass;

/**
 * 演示泛型类的使用
 * 优点1：大型应用时能显著降低程序的复杂度
 * 使用泛型类为相同方法传入不同类型参数，不必为不同类型逐一编写方法
 * @param <T>
 *
 * Result:
 * stringGenericFoo:Hello Generics!
 * intGenericFoo:666
 * objectGenericFoo:Hello World!
 *
 */

class GenericFoo<T> {
    private  T x;

    public GenericFoo(T x)  {
        this.x = x;
    }

    public T getX()    {
        return this.x;
    }

    public void setX(T x)    {
        this.x = x;
    }
}


public class GenericClassDemo {

    public static void main(String[] args) {
        GenericFoo<String> stringGenericFoo = new GenericFoo<>("Hello Generics!");
        GenericFoo<Integer> intGenericFoo = new GenericFoo<>(666);
        GenericFoo<Object> objectGenericFoo = new GenericFoo<>("Hello World!");

        System.out.println("stringGenericFoo:" + stringGenericFoo.getX());
        System.out.println("intGenericFoo:" + intGenericFoo.getX());
        System.out.println("objectGenericFoo:" + objectGenericFoo.getX());
    }

}
