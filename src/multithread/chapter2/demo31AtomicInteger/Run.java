package multithread.chapter2.demo31AtomicInteger;

/**
 * P127
 * 演示使用原子类进行i++操作
 *
 * Result:
 * 1
 * 3
 * 5
 * 7
 * ...
 * 49997
 * 49998
 * 49999
 * 50000
 *
 * 可见原子类只能保障自加操纵安全，在system.out.println()方法调用仍然出现了脏读
 *
 * 用Synchronized修饰system.out.println()代码块，解决开始时输出跳数的问题
 *
 * Result:
 *  * 1
 *  * 2
 *  * 3
 *  * 4
 *  * ...
 *  * 49997
 *  * 49998
 *  * 49999
 *  * 50000
 *
 *
 */
public class Run {
    public static void main(String[] args) {
        AddCountThread countService = new AddCountThread();
        Thread t1 = new Thread(countService);
        t1.start();
        Thread t2 = new Thread(countService);
        t2.start();
        Thread t3 = new Thread(countService);
        t3.start();
        Thread t4 = new Thread(countService);
        t4.start();
        Thread t5 = new Thread(countService);
        t5.start();
    }
}
