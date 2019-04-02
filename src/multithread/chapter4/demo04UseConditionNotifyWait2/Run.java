package multithread.chapter4.demo04UseConditionNotifyWait2;

/**
 * P207
 * 使用Condition实现等待/通知
 * Object类的wait()方法相当于Condition类的await()方法
 * Object类的notify()方法相当于Condition类的signal()方法
 * Object类的notifyAll()方法相当于Condition类的signalAll()方法
 *
 * Result:
 *   wait时间为1553586776678
 * signal时间为1553586779680
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        Thread.sleep(3000);
        myService.signal();
    }
}
