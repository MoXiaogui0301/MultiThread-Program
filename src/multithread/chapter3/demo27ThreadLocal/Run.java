package multithread.chapter3.demo27ThreadLocal;

/**
 * P191
 * ThreadLocal类的方法get()与null值
 *
 * Result:
 * null
 * 从未放入值
 * 我的值
 * 我的值
 *
 */
public class Run {
    public static ThreadLocal<String> t1 = new ThreadLocal<>();

    public static void main(String[] args) {
        System.out.println(t1.get());
        if (t1.get() == null)   {
            System.out.println("从未放入值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
