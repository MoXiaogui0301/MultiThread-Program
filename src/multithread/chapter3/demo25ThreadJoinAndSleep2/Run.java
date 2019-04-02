package multithread.chapter3.demo25ThreadJoinAndSleep2;

/**
 * P187
 * 使用join()，A线程执行b.join等待B线程时，释放了对象锁b
 *
 * Result:
 * b run begin timer=1553522706314
 * 打印了 bService timer=1553522707316
 * b run end timer=1553522711359
 * ...(A线程还在运行)
 *
 */

import multithread.chapter3.demo24ThreadJoinAndSleep.ThreadB;
import multithread.chapter3.demo24ThreadJoinAndSleep.ThreadC;

public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
