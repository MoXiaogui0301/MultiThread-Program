package multithread.chapter3.demo4WaitAndNotify3;

/**
 * P139
 * 使用wait-notify机制替代demo1的sleep-while轮询实现线程通信
 *
 * 每个锁对象都有两个队列：就绪队列 + 阻塞队列
 * 就绪队列存储了将要获得锁的线程，阻塞队列存储了被阻塞的线程
 * 线程被notify后进入就绪队列，等待获取CPU时间片
 * 线程被wait后进入阻塞队列，等待被notify
 *
 * Result:
 * wait begin 1553248973792
 * add 1 elements
 * add 2 elements
 * add 3 elements
 * add 4 elements
 * lock send notify!
 * add 5 elements
 * add 6 elements
 * add 7 elements
 * add 8 elements
 * add 9 elements
 * add 10 elements
 * wait end 1553248983892
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
