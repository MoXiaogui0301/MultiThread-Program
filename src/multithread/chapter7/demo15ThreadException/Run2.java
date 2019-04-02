package multithread.chapter7.demo15ThreadException;

/**
 * P298
 * 使用setUncaughtExceptionHandler()给指定的线程对象设置默认的异常处理器
 *
 * Result:
 * Exception in thread "线程t2" java.lang.NullPointerException
 * 	at multithread.chapter7.demo15ThreadException.MyThread.run(MyThread.java:7)
 * 线程：线程t1 出现了异常
 * java.lang.NullPointerException
 * 	at multithread.chapter7.demo15ThreadException.MyThread.run(MyThread.java:7)
 *
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程：" + t.getName() + " 出现了异常");
                e.printStackTrace();
            }
        });
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
