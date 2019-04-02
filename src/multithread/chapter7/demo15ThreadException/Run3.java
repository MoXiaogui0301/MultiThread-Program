package multithread.chapter7.demo15ThreadException;

/**
 * P298
 * setDefaultUncaughtExceptionHandler()方法对所有线程对象设置异常处理器
 *
 * Result:
 * 线程：线程t1 出现了异常：
 * 线程：线程t2 出现了异常：
 * java.lang.NullPointerException
 * 	at multithread.chapter7.demo15ThreadException.MyThread.run(MyThread.java:7)
 * java.lang.NullPointerException
 * 	at multithread.chapter7.demo15ThreadException.MyThread.run(MyThread.java:7)
 *
 */
public class Run3 {
    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程：" + t.getName() + " 出现了异常：");
                e.printStackTrace();
            }
        });
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
