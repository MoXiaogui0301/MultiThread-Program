package multithread.chapter2.demo11SynchronizedCodeBlock;

public class MyThread extends Thread {
    private Task task;
    public MyThread(Task task)  {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
