package multithread.chapter7.demo18ThreadGroupException3;

/**
 * P302
 * 通过 对象/类 设置异常处理器
 *
 * Result1:
 * 对象的异常处理
 * java.lang.NumberFormatException: For input string: "a"
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:652)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
 * 	at multithread.chapter7.demo18ThreadGroupException3.MyThread.run(MyThread.java:16)
 *
 * Result2:
 * 静态的异常处理
 * java.lang.NumberFormatException: For input string: "a"
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:652)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
 * 	at multithread.chapter7.demo18ThreadGroupException3.MyThread.run(MyThread.java:16)
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
