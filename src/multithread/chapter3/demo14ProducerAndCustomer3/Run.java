package multithread.chapter3.demo14ProducerAndCustomer3;

/**
 * P164
 * 一生产一消费：操作栈
 *
 * Result:
 * push=1
 * pop=0
 * push=1
 * pop=anyString=0.9551883637394051
 * pop=0
 * pop=anyString=0.02343601341816659
 * push=1
 * pop=0
 * pop=anyString=0.994670726529168
 * ...
 * push=1
 * pop=0
 * pop=anyString=0.022538405889896973
 * push=1
 * pop=0
 * ...
 *
 * 注意开始运行时的线程抢占情况：pop=0和pop=anyString=0.9551883637394051之间push=1
 *
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        P_Thread pThread = new P_Thread(p);
        C_Thread cThread = new C_Thread(c);
        pThread.start();
        cThread.start();
    }
}

