package multithread.chapter7.demo03ThreadState3;

/**
 * P282
 * 验证Thread的BLOCKED状态
 *
 * Result:
 * A进入Service的serviceMethod方法
 * B的状态为BLOCKED
 * B进入Service的serviceMethod方法
 *
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };

        Thread a = new Thread(runnable1,"A");
        a.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread b = new Thread(runnable1,"B");
        b.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
        System.out.println(b.getName() + "的状态为" + b.getState());
    }
}
