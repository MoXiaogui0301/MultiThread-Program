package multithread.chapter7.demo18ThreadGroupException3;

/**
 * P304
 * 线程组的异常处理
 *
 * Result1:(给对象设置异常处理器)
 * 对象的异常处理
 * java.lang.NumberFormatException: For input string: "a"
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:652)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
 * 	at multithread.chapter7.demo18ThreadGroupException3.MyThread.run(MyThread.java:16)
 *
 * Result2:(对类设置默认异常处理器)
 * java.lang.NumberFormatException: For input string: "a"
 * 静态的异常处理
 * 线程组的异常处理
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:652)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
 * 	at multithread.chapter7.demo18ThreadGroupException3.MyThread.run(MyThread.java:16)
 * java.lang.NumberFormatException: For input string: "a"
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:652)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
 * 	at multithread.chapter7.demo18ThreadGroupException3.MyThread.run(MyThread.java:16)
 *
 * Result3:(不设置异常处理器，使用线程组的默认异常处理方法)
 * Exception in thread "我的线程" java.lang.NumberFormatException: For input string: "a"
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:652)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
 * 	at multithread.chapter7.demo18ThreadGroupException3.MyThread.run(MyThread.java:16)
 * java.lang.NumberFormatException: For input string: "a"
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:652)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
 * 	at multithread.chapter7.demo18ThreadGroupException3.MyThread.run(MyThread.java:16)
 * 线程组的异常处理
 *
 */
public class Run2 {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group,"我的线程");
        //给对象设置ExceptionHandler
//        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        //给类设置ExceptionHandler
//        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());

        myThread.start();
    }
}
