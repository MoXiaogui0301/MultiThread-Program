package multithread.chapter3.demo13ProducerAndCustomer2;

/**
 * P161
 * 多生产者-多消费者 操作值 产生假死现象
 * 生产者1 RUNNABLE 释放lock 进入下一次while循环
 * 生产者1 再次运行 发现ValueObject.value不为"" 生产者一为WAITING并notify 但却唤醒了同类生产者二
 * 生产者2发现ValueObject.value不为"" 生产者2也为 WAITING
 * 此时没有生产者调用notify方法，消费者不被唤醒，程序出现假死
 * 解决办法是使用notifyAll()代替notify()
 *
 * Result:
 * 生产者 生产者1 RUNNABLE了
 * 生产者 生产者1 WAITING了 #####
 * 生产者 生产者2 WAITING了 #####
 * 消费者 消费者2 RUNNABLE了
 * 消费者 消费者1 WAITING了*****
 * 生产者 生产者1 RUNNABLE了
 * 生产者 生产者1 WAITING了 #####
 * 生产者 生产者2 WAITING了 #####
 * main RUNNABLE
 * Monitor Ctrl-Break RUNNABLE
 * 生产者1 WAITING
 * 消费者1 WAITING
 * 生产者2 WAITING
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];

        for (int i=0; i<2; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者" + (i+1));
            cThread[i] = new ThreadC(c);
            cThread[i].setName("消费者" + (i+1));
            pThread[i].start();
            cThread[i].start();
        }

        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);

        for (int i=0; i<threadArray.length; i++)    {
            System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
        }
    }
}
