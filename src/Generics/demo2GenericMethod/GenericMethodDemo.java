package Generics.demo2GenericMethod;

/**
 *
 * 泛型方法与其所在类是否是泛型没有关系，定义泛型方法只需将泛型参数列表置于返回值前
 *
 * Result:
 * java.lang.String
 * java.lang.Character
 * java.lang.Integer
 *
 */
public class GenericMethodDemo {

    public <T> void f(T x)  {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethodDemo genericMethodDemo = new GenericMethodDemo();
        genericMethodDemo.f("String");
        genericMethodDemo.f('A');
        genericMethodDemo.f(123);
    }
}
