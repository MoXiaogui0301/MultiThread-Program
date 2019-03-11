package mutithread.chapter1.demo17interrupted;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
            System.out.println("i=" + (i+1));
        }
    }
}
