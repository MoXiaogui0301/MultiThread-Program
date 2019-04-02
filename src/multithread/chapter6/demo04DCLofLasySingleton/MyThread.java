package multithread.chapter6.demo04DCLofLasySingleton;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
