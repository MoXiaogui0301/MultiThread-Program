package multithread.chapter1.demo16interrupt;

/**
 * P24
 * interrupt() 并没有立即停止方法
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
