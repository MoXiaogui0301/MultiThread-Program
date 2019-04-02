package multithread.chapter7.demo09ThreadGroup5;

/**
 * P290
 * 批量停止线程组内的线程
 *
 * Result:
 * ThreadName=线程2准备开始死循环
 * ThreadName=线程1准备开始死循环
 * ThreadName=线程3准备开始死循环
 * ThreadName=线程4准备开始死循环
 * ThreadName=线程5准备开始死循环
 * 调用了interrupt()方法
 * ThreadName=线程5结束了
 * ThreadName=线程1结束了
 * ThreadName=线程4结束了
 * ThreadName=线程2结束了
 * ThreadName=线程3结束了
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadGroup group = new ThreadGroup("我的线程组");
            for (int i=0; i<5; i++) {
                MyThread thread = new MyThread(group,"线程" + (i+1));
                thread.start();
            }
            Thread.sleep(5000);
            //批量停止线程组的线程
            group.interrupt();
            System.out.println("调用了interrupt()方法");
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
