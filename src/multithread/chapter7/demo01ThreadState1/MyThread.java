package multithread.chapter7.demo01ThreadState1;

public class MyThread extends Thread {
    public MyThread()   {
        System.out.println(getName() + "构造方法中的状态：" + Thread.currentThread().getState());
    }

    public void run()   {
        System.out.println(getName() + "run方法中的状态：" + Thread.currentThread().getState());
    }
}
