package multithread.chapter2.demo04SynchronizedMethodAndLock;

public class MyThread extends Thread {
    private MyObject myObject;

    public MyThread(MyObject myObject){
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
