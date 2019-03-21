package multithread.chapter1.demo24InterruptThreadByForceAndSynchronized;

public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("B","bb");
    }
}
