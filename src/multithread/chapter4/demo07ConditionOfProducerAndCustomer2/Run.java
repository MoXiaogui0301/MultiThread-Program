package multithread.chapter4.demo07ConditionOfProducerAndCustomer2;

/**
 * P214
 * Condition实现生产者/消费者模式，多对多交替打印
 * 注意使用signal()可能造成唤醒同类线程程序假死，避免此问题的办法是使用signalAll()
 *
 * Result:
 * 有可能##连续
 * 有可能##连续
 * 打印*
 * 打印#
 * 有可能##连续
 * 有可能##连续
 * 有可能##连续
 * 打印*
 * 有可能**连续
 * 有可能**连续
 * 打印#
 * 有可能##连续
 * 有可能##连续
 * 打印*
 * ...
 * 打印#
 * 有可能##连续
 * 打印*
 * 有可能**连续
 * 打印#
 * 有可能##连续
 * 打印*
 * 打印#
 *
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA[] threadAS = new ThreadA[5];
        ThreadB[] threadBS = new ThreadB[5];
        for (int i=0; i<5; i++) {
            threadAS[i] = new ThreadA(myService);
            threadBS[i] = new ThreadB(myService);
            threadAS[i].start();
            threadBS[i].start();
        }
    }
}
