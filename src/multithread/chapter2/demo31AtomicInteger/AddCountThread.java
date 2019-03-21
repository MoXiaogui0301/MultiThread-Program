package multithread.chapter2.demo31AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            //使用Synchronized修饰println方法，避免输出跳数
            synchronized (AddCountThread.class) {
                System.out.println(count.incrementAndGet());
            }
        }
    }
}
