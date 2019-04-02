package multithread.chapter4.demo06ConditionOfProducerAndCustomer1;

/**
 * P213
 * 通过condition实现生产者/消费者模式：一对一交替打印
 *
 * Result:
 * #####
 * *****
 * #####
 * *****
 * #####
 * ...
 * *****
 * #####
 * *****
 *
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        ThreadB b = new ThreadB(myService);
        b.start();
    }
}
