package multithread.chapter4.demo03UseConditionNotifyWait1;

/**
 * P206
 * 使用condition.await()暂停线程
 *
 * Result:
 * A
 * ...(程序继续，等待锁释放)
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
    }
}
