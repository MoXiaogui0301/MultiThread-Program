package multithread.chapter3.demo4WaitAndNotify3;

public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i=0; i<10; i++)    {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("lock send notify!");
                    }
                    System.out.println("add " + MyList.size() + " elements");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
