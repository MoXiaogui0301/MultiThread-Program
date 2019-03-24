package multithread.chapter3.demo12ProducerAndCustomer;

/**
 * P158
 * 演示使用wait/notify 实现 生产者/消费者模式
 * 本例程为一生产一消费操作值例程
 *
 * Result:
 * 生产者set的值是1553338525864_94819212340526
 * 消费者get的值是1553338525864_94819212340526
 * 生产者set的值是1553338525864_94819212368215
 * 消费者get的值是1553338525864_94819212368215
 * ...
 * 生产者set的值是1553338525880_94819227912941
 * 消费者get的值是1553338525880_94819227912941
 * 生产者set的值是1553338525880_94819227941592
 * 消费者get的值是1553338525880_94819227941592
 * 生产者set的值是1553338525880_94819228026317
 * ...
 *
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(c);

        pThread.start();
        cThread.start();
    }
}
