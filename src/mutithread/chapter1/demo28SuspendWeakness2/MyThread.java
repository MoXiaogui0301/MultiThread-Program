package mutithread.chapter1.demo28SuspendWeakness2;

public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while(true) {
            i++;
            System.out.println(i);
        }
    }
}
