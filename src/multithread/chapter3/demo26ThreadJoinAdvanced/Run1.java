package multithread.chapter3.demo26ThreadJoinAdvanced;

/**
 * P187
 * 演示join()之后代码提前运行出现的意外(经典！！！)
 * 通过本包中的RunFirst类可以发现join(2000)大部分时间都是先运行(先抢到b锁，然后立刻释放)
 *
 * Result1:
 * begin A ThreadName=Thread-1  1553523654138
 * end A ThreadName=Thread-1  1553523659186
 * begin B ThreadName=Thread-0  1553523659188
 * main end1553523659188
 * end B ThreadName=Thread-0  1553523664192
 *
 * Analysis1:
 * main线程在A和B start()后，先于线程A和线程B获得时间片，b.join获得锁b(由于此时B还没有执行，b.join无效)，又立刻释放锁
 * 此时线程A抢到锁b，打印begin A并在sleep占用锁5秒后打印end A，之后释放锁
 * 接下来线程B和join(2000)继续争抢锁，join(2000)获得锁后发现在自己上次获得锁后已过了2000ms，于是释放锁
 * 此时线程B抢到锁b，并打印begin B
 * main线程异步执行，打印main end
 * 最后线程B打印end B
 *
 * Result2:
 * begin A ThreadName=Thread-1  1553523798454
 * end A ThreadName=Thread-1  1553523803510
 * begin B ThreadName=Thread-0  1553523803511
 * end B ThreadName=Thread-0  1553523808513
 * main end1553523808514
 *
 * Analysis2:
 * main线程在A和B start()后，先于线程A和线程B获得时间片，b.join获得锁b(由于此时B还没有执行，b.join无效)，又立刻释放锁
 * 此时线程A抢到锁b，打印begin A并在sleep占用锁5秒后打印end A，之后释放锁
 * 接下来线程B和join(2000)继续争抢锁，线程B抢到
 * 此时线程B抢到锁b，并打印begin B，在sleep占用锁5秒后打印end B，之后释放锁
 * 最后b.join(2000)抢到锁并执行，此时B已执行完毕，故直接main线程打main end
 *
 * Result3：
 * begin B ThreadName=Thread-0  1553524098871
 * end B ThreadName=Thread-0  1553524103931
 * begin A ThreadName=Thread-1  1553524103932
 * main end1553524103932
 * end A ThreadName=Thread-1  1553524108937
 *
 * Analysis3:
 * main线程在A和B start()后，先于线程A和线程B获得时间片，b.join获得锁b(由于此时B还没有执行，b.join无效)，又立刻释放锁
 * 此时线程B抢到锁b，打印begin B并在sleep占用锁5秒后打印end B，之后释放锁
 * 接下来线程A和join(2000)继续争抢锁，join(2000)获得锁后发现B已执行完毕，且距离自己上次抢到锁已经过了2000ms，于是释放锁
 * 此时线程A抢到锁b，并打印begin A
 * main线程继续异步执行，打印main end
 * 最后线程A打印end A
 *
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("main end" + System.currentTimeMillis());
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
