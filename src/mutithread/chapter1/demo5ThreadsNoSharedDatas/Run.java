package mutithread.chapter1.demo5ThreadsNoSharedDatas;

/**
 * 测试多个线程不访问同一变量时情景
 * 每个线程都是MyThread类的一个实例，各有一份实例变量count
 */
public class Run {
    public static void main(String[] args) {
        MyThread ThreadA = new MyThread("A");
        MyThread ThreadB = new MyThread("B");
        MyThread ThreadC = new MyThread("C");

        ThreadA.start();
        ThreadB.start();
        ThreadC.start();
    }
}
