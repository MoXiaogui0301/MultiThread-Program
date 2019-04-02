package multithread.chapter6.demo07StaticBlockofLasySingleton;

/**
 * P274
 * 通过static代码块实现懒汉式单例模式
 *
 * Result:
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 * 1721588072
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();

        th1.start();
        th2.start();
        th3.start();
    }
}
