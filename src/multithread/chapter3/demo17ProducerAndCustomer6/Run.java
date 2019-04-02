package multithread.chapter3.demo17ProducerAndCustomer6;

/**
 * P170
 * 多生产与多消费：操作栈
 *
 * Result:
 * ...
 * Thread-7 pop=0
 * pop操作中的：Thread-7 线程呈wait状态
 * push操作中的：Thread-1 线程被唤醒
 * Thread-1 push=1
 * push操作中的：Thread-1 线程呈wait状态
 * pop操作中的：Thread-7 线程被唤醒
 * Thread-7 pop=0
 * pop操作中的：Thread-7 线程呈wait状态
 * push操作中的：Thread-1 线程被唤醒
 * Thread-1 push=1
 * push操作中的：Thread-1 线程呈wait状态
 * pop操作中的：Thread-7 线程被唤醒
 * Thread-7 pop=0
 * pop操作中的：Thread-7 线程呈wait状态
 * push操作中的：Thread-1 线程被唤醒
 * Thread-1 push=1
 * push操作中的：Thread-1 线程呈wait状态
 * pop操作中的：Thread-7 线程被唤醒
 * Thread-7 pop=0
 * pop操作中的：Thread-7 线程呈wait状态
 * push操作中的：Thread-1 线程被唤醒
 * Thread-1 push=1
 * push操作中的：Thread-1 线程呈wait状态
 * pop操作中的：Thread-7 线程被唤醒
 * ...
 *
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);

        P_Thread pThread1 = new P_Thread(p1);
        P_Thread pThread2 = new P_Thread(p2);
        P_Thread pThread3 = new P_Thread(p3);
        P_Thread pThread4 = new P_Thread(p4);
        P_Thread pThread5 = new P_Thread(p5);

        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);

        C_Thread cThread1 = new C_Thread(c1);
        C_Thread cThread2 = new C_Thread(c2);
        C_Thread cThread3 = new C_Thread(c3);
        C_Thread cThread4 = new C_Thread(c4);
        C_Thread cThread5 = new C_Thread(c5);

        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();

        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
    }
}
