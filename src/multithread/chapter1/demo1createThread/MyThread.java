package multithread.chapter1.demo1createThread;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
