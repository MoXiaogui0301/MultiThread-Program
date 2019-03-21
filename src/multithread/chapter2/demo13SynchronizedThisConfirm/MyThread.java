package multithread.chapter2.demo13SynchronizedThisConfirm;

public class MyThread extends Thread {
    private Task task;

    public MyThread(Task task)  {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        if (Thread.currentThread().getName().equals("A"))
            task.doLongTimeTask();
        else
            task.otherMethod();
    }
}
