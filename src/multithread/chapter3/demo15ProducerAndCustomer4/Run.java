package multithread.chapter3.demo15ProducerAndCustomer4;
/**
 * P167
 * 一生产和多消费：操作栈  改变wait条件与假死
 *
 * 使用if判断wait条件在多线程中可能抛出异常
 *
 * 本例中，push=1后唤醒pop线程3，pop线程3在pop后唤醒了同类线程pop4，
 * pop4由于使用if语句，没有在List.size()改变后重新条件判断，直接往下运行，导致下标越界异常
 * Result:
 * push=1
 * pop=0
 * pop=anyString=0.21739101868304167
 * pop操作中的:Thread-4线程为wait状态
 * pop操作中的:Thread-3线程为wait状态
 * pop操作中的:Thread-2线程为wait状态
 * pop操作中的:Thread-1线程为wait状态
 * pop操作中的:Thread-5线程为wait状态
 * push=1
 * pop=0
 * pop=anyString=0.7772228394177312
 * pop操作中的:Thread-4线程为wait状态Exception in thread "Thread-3"
 * java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
 * 	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
 * 	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
 * 	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
 * 	at java.base/java.util.Objects.checkIndex(Objects.java:372)
 * 	at java.base/java.util.ArrayList.get(ArrayList.java:458)
 * 	at multithread.chapter3.demo15ProducerAndCustomer4.MyStack.pop(MyStack.java:38)
 * 	at multithread.chapter3.demo15ProducerAndCustomer4.C.popService(C.java:11)
 * 	at multithread.chapter3.demo15ProducerAndCustomer4.C_Thread.run(C_Thread.java:14)
 *
 * 解决方式，更改wait条件判断if为while，在wait后先进行条件判断再执行，但这时存在假死情况(pop3唤醒了同类线程pop4，进入wait())
 * Result:
 * push=1
 * pop=0
 * pop=anyString=0.978554931043308
 * pop操作中的:Thread-4线程为wait状态
 * pop操作中的:Thread-3线程为wait状态
 * pop操作中的:Thread-2线程为wait状态
 * pop操作中的:Thread-1线程为wait状态
 * pop操作中的:Thread-5线程为wait状态
 * push=1
 * pop=0
 * pop=anyString=0.6566327694520162
 * pop操作中的:Thread-3线程为wait状态
 * pop操作中的:Thread-4线程为wait状态
 *
 * 解决方式，使用notifyAll代替notify
 * Result:
 * push=1
 * pop=0
 * pop=anyString=0.2703801068139877
 * pop操作中的:Thread-1线程为wait状态
 * push=1
 * pop=0
 * pop=anyString=0.0547004821461371
 * pop操作中的:Thread-1线程为wait状态
 * push=1
 * pop=0
 * pop=anyString=0.5843154047248146
 * push=1
 * pop=0
 * pop=anyString=0.8651781551344342
 * pop操作中的:Thread-3线程为wait状态
 * pop操作中的:Thread-4线程为wait状态
 * pop操作中的:Thread-2线程为wait状态
 * pop操作中的:Thread-5线程为wait状态
 * pop操作中的:Thread-1线程为wait状态
 * push=1
 * pop=0
 * pop=anyString=0.08351982855159001
 * pop操作中的:Thread-3线程为wait状态
 * push=1
 * pop=0
 * pop=anyString=0.14118013416463027
 * pop操作中的:Thread-3线程为wait状态
 * push=1
 * pop=0
 * pop=anyString=0.9328668825416727
 * pop操作中的:Thread-3线程为wait状态
 * push=1
 * pop=0
 * ...
 *
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        P_Thread pThread = new P_Thread(p);
        pThread.start();
        C_Thread cThread1 = new C_Thread(c1);
        C_Thread cThread2 = new C_Thread(c2);
        C_Thread cThread3 = new C_Thread(c3);
        C_Thread cThread4 = new C_Thread(c4);
        C_Thread cThread5 = new C_Thread(c5);
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
    }
}
