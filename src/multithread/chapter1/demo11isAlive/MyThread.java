package multithread.chapter1.demo11isAlive;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName() + " run=" + this.isAlive());
    }
}
