package multithread.chapter2.demo09ExceptionReleaseLock;

/**
 * P68
 * 演示方法执行发送异常时，方法持有的对象锁自动释放
 *
 * thread a 发生异常后释放service的对象锁，thread b获得service对象锁执行
 *
 * Result:
 *ThreadName=a run beginTime=1552989959467
 * ThreadName=a run exceptionTime=1552989960090
 * Exception in thread "a" java.lang.NumberFormatException: For input string: "a"
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:652)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
 * 	at multithread.chapter2.demo09ExceptionReleaseLock.Service.testMethod(Service.java:12)
 * 	at multithread.chapter2.demo09ExceptionReleaseLock.ThreadA.run(ThreadA.java:13)
 * Thread B run Time = 1552989960091
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
