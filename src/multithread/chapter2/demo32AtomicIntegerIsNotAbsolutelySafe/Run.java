package multithread.chapter2.demo32AtomicIntegerIsNotAbsolutelySafe;

/**
 * P127
 * atomic类不能保证方法间的原子性
 * atomicLong在每次自增100后输出变量值，再自增1
 * 多个线程操作atomicLong时，其他线程在线程4自增100输出后，再自增1之前完成了输出，方法间未能保障原子性
 *
 * Result:
 * Thread-4加了100后的值是：500
 * Thread-2加了100后的值是：300
 * Thread-3加了100后的值是：400
 * Thread-0加了100后的值是：100
 * Thread-1加了100后的值是：200
 * 505
 *
 * 解决办法，使用Synchronized修饰不能中断的方法
 * Result:
 * Thread-0加了100后的值是：100
 * Thread-4加了100后的值是：201
 * Thread-3加了100后的值是：302
 * Thread-2加了100后的值是：403
 * Thread-1加了100后的值是：504
 * 505
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            MyThread[] array = new MyThread[5];
            for (int i=0; i<array.length; i++)  {
                array[i] = new MyThread(service);
            }
            for (int i=0; i<array.length; i++)  {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
