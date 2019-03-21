package multithread.chapter2.demo33SynchronizedIsMytualAndVIsible;

/**
 * P130
 * 演示Synchronized具备原子性和互斥性
 *
 * Result:
 * 开始循环
 * 已经发出停止命令
 *
 * 实际ThreadB对isContinueRun的修改没有被ThreadA收到，所以循环一直继续
 * 除了使用volatile修饰isContinueRun之外，可以对循环用Synchronized修饰
 * Synchronized可以保证进入同步方法或同步代码块的每个线程，都能看到进入同步方法或同步代码块前的修改效果
 *
 * 使用Synchronized修饰while循环中的空语句后
 * Result：
 * 开始循环
 * 已经发出停止命令
 * 停下来了！
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB(service);
            b.start();
            System.out.println("已经发出停止命令");
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
