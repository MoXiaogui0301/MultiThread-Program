package multithread.chapter3.demo24ThreadJoinAndSleep;

/**
 * P185
 * 验证sleep()和join()的区别
 * 在线程Asleep()过程中，线程A不释放占有的对象锁b。线程C只有等线程Asleep()结束后执行
 *
 * Result:
 * b run begin timer=1553520959114
 * b run end timer=1553520964152
 * 打印了 bService timer=1553520965117
 *
 * 其中b线程执行run()过程sleep()5秒
 * 线程Asleep6秒后释放对象锁b，线程C才执行b.bService()
 *
 */

public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            //a的run()方法sleep过程中持有对象锁b
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
            //c只有等待a释放对象锁b后才能获得b对象锁开始执行
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
