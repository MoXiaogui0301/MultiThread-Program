package multithread.chapter2.demo32AtomicIntegerIsNotAbsolutelySafe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
    public static AtomicLong aiRef = new AtomicLong();

    //    public void addNum()    {
    //使用Synchronized关键字，确保自增100并输出、自增101这几步作为一个原子执行
    synchronized public void addNum() {

        System.out.println(Thread.currentThread().getName() + "加了100后的值是：" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
