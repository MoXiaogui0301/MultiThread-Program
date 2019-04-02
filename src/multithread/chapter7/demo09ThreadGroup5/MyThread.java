package multithread.chapter7.demo09ThreadGroup5;

public class MyThread extends Thread {
    public MyThread(ThreadGroup group,String name)  {
        super(group,name);
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "准备开始死循环");
        while (!this.isInterrupted())   {
        }
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "结束了");
    }
}
