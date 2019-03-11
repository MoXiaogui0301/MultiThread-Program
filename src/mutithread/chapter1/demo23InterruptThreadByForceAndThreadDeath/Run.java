package mutithread.chapter1.demo23InterruptThreadByForceAndThreadDeath;

/**
 * P33
 * stop方法将产生ThreadDeath异常
 * 此异常为RuntimeException，不需要显式捕捉
 *
 * stop()方法已作废
 * 强制执行stop()后果：
 * 1.可能使一些请理性的工作得不到完成；
 * 2.对锁定的状态进行了"解锁"，导致数据得不到同步处理
 *
 * Result:
 * java.lang.ThreadDeath
 * 	at java.base/java.lang.Thread.stop(Thread.java:942)
 * 	at mutithread.chapter1.demo23InterruptThreadByForceAndThreadDeath.MyThread.run(MyThread.java:7)
 * 进入catch捕捉到ThreadDeath异常
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
