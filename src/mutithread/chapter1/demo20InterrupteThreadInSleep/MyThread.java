package mutithread.chapter1.demo20InterrupteThreadInSleep;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println(Thread.currentThread().getName() + " run begin");
            Thread.sleep(200000);
            System.out.println(Thread.currentThread().getName() + " run end");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "在沉睡中被停止！进入catch!" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
