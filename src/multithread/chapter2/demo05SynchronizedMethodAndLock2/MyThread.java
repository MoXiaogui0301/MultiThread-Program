package multithread.chapter2.demo05SynchronizedMethodAndLock2;

public class MyThread extends Thread {
    private MyObject myObject = new MyObject();

    public MyThread(MyObject myObject)  {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        if (Thread.currentThread().getName().equals("A"))
            myObject.methodA();
        else
            myObject.methodB();
    }
}
