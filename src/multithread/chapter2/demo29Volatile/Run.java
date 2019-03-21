package multithread.chapter2.demo29Volatile;

/**
 * P121
 * 演示volatile，确保实例变量在多个线程之间的可见性
 * 当setRunning没被volatile修饰时，RunThread线程无法读到main线程更改的setRunning值，导致一直处于循环
 *
 * Result:
 * 进入run了
 * setRunning已经被赋值为false
 *
 * 解决办法：使用volatile修饰setRunning，main线程更新setRunning在第一时间被RunThread得知
 * Result(使用volatile修饰setRunning变量):
 * 进入run了
 * setRunning已经被赋值为false
 * 线程被停止了
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("setRunning已经被赋值为false");
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
