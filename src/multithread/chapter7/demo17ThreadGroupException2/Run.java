package multithread.chapter7.demo17ThreadGroupException2;

/**
 * P300
 * 重写ThreadGroup类的uncaughtException(Thread t,Throwable e)方法
 * 通过调用interrupt()方法，在线程组中一个线程报错时结束所有线程
 *
 * Result:
 * 死循环中：线程7
 * 死循环中：线程10
 * 死循环中：线程1
 * Exception in thread "报错线程" java.lang.NumberFormatException: For input string: "a"
 * 死循环中：线程8
 * 死循环中：线程6
 * 死循环中：线程8
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 死循环中：线程8
 * 死循环中：线程1
 * 死循环中：线程10
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:652)
 * 死循环中：线程7
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
 * 	at multithread.chapter7.demo17ThreadGroupException2.MyThread.run(MyThread.java:12)死循环中：线程4
 *
 * 死循环中：线程2
 * 死循环中：线程3
 * 死循环中：线程5
 * 死循环中：线程9
 * 死循环中：线程7
 * 死循环中：线程10
 * 死循环中：线程1
 * 死循环中：线程8
 * 死循环中：线程6
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread[] myThreads = new MyThread[10];

        for (int i=0; i<myThreads.length; i++)  {
            myThreads[i] = new MyThread(group,"线程" + (i+1), "1");
            myThreads[i].start();
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThread newT = new MyThread(group,"报错线程","a");
        newT.start();
    }
}
