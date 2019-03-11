package mutithread.chapter1.demo21InterruptThreadInSleep2;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i=0; i<10000; i++) {
                System.out.println("i=" + (i+1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e) {
            System.out.println("先interrupt，再执行for，之后线程进入sleep时被中断");
            e.printStackTrace();
        }
    }
}
