package multithread.chapter2.demo30VolatileIsNonatomicity;

/**
 * P124
 * 演示volatile的非原子特性
 * i++非原子操作，包含三步
 * 1)从内存取出i的值
 * 2)计算i的值
 * 3)将i的值写入内存
 * 在线程A进行这三步的中间，其他线程也修改i的值，就会造成脏读
 * 解决办法是使用Synchronized关键字
 *
 * Result：
 * count=4700
 * count=9947
 * count=4000
 * ...
 * count=5300
 * count=600
 * count=6947
 *
 * count乱序输出
 *
 * Result2:
 * 使用Synchronized类锁修饰静态方法addcount
 * count=100
 * count=200
 * count=300
 * ...
 * count=9800
 * count=9900
 * count=10000
 *
 * count顺序增加并输出
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i=0; i<100; i++)   {
            myThreads[i] = new MyThread();
        }
        for (int i=0; i<100; i++)   {
            myThreads[i].start();
        }
    }
}
