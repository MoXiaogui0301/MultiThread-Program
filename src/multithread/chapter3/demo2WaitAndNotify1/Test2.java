package multithread.chapter3.demo2WaitAndNotify1;

/**
 * P137
 * 演示在 同步方法/同步代码块 中调用 wait()后，线程永远处于等待状态
 *
 * Result:
 * before synchronized
 * First line of synchronized
 * before line of wait()
 * ...(线程等待)
 *
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("before synchronized");
            synchronized (lock) {
                System.out.println("First line of synchronized");
                System.out.println("before line of wait()");
                lock.wait();
                System.out.println("after line of wait()");
            }
            System.out.println("after synchronized");
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
