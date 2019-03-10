package mutithread.chapter1.demo4CreateThread2;

public class Run {
    public static void main(String[] args) {
        Runnable runnable= new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }
}
