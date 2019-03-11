package mutithread.chapter1.demo34DaemonThread;

public class MyThread extends Thread {
    private int i=0;

    @Override
    public void run() {
        try {
            while(true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
