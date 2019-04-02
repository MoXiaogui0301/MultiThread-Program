package multithread.chapter3.demo23ThreadJoinLong;

/**
 * P163
 * 演示join(long)通过long参数设置主线程等待join线程的时间
 * 本例中，threadTest线程完全运行需要5秒
 * main线程中，threadTest.join(2000)，设置main线程等待threadTest线程2秒
 * 结果2秒(而非5秒)后main线程继续运行
 *
 * Result:
 * begin Timer=1553515330217
 * end Timer=1553515332217
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join(2000);  //只等待2秒，threadTest运行完毕需要5秒
            System.out.println("end Timer=" + System.currentTimeMillis());
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
