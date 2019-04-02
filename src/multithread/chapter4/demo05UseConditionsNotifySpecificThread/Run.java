package multithread.chapter4.demo05UseConditionsNotifySpecificThread;

/**
 * P211
 * 使用多个Condition对象通知部分线程
 * MyService中分别在awaitA方法和awaitB方法中使用conditionA.await()和conditionB.await()暂停A和B两个线程
 * 并在延迟3秒后使用conditionA.signal()结束A线程的等待
 *
 * Result:
 * begin awaitA时间为 1553587999565 ThreadName=A
 * begin awaitB时间为 1553587999670 ThreadName=B
 * signalAll_A时间为 1553588002566 ThreadName=main
 *   end awaitA时间为 1553588002567 ThreadName=A
 * ...(线程B仍在运行)
 *
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        myService.signalAll_A();
    }
}
