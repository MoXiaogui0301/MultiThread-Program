package mutithread.chapter1.demo11isAlive;

/**
 * P18
 * isAlive()
 * Tests if this thread is alive.
 *
 * Result：
 * Thread-0 begin ==false
 * Thread-0 end ==true
 * Thread-0 run=true
 *
 * Note:
 * 直接创建线程时，this和myThread是同一个线程
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        System.out.println("current Thread name is " + Thread.currentThread().getName());
//        System.out.println("myThread name is " + myThread.getName());
//        Thread t1 = new Thread(myThread);
//        System.out.println("t1 name is " + t1.getName());
//        System.out.println("begin ==" + t1.isAlive());
        System.out.println(myThread.getName() + " begin ==" + myThread.isAlive());
        myThread.start();
        System.out.println(myThread.getName() + " end ==" + myThread.isAlive());
//        System.out.println("end ==" + t1.isAlive());
    }
}
