package multithread.chapter1.demo32ThreadPriority;

/**
 * P45
 * 设置priority分别为10和1时
 * 演示线程优先级的规律性
 * 优先级高的线程更容易获得cpu时间片，会更早执行完毕
 *
 * P46
 * 设置priority分别为5和6时
 * 演示线程优先级的随机性
 * 优先级较高的线程并不一定先执行完毕
 *
 */
public class Run {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            MyThread1 thread1 = new MyThread1();
//            thread1.setPriority(10);
            thread1.setPriority(6);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
//            thread2.setPriority(1);
            thread2.setPriority(5);
            thread2.start();
        }
    }
}
