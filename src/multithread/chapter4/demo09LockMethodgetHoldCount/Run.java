package multithread.chapter4.demo09LockMethodgetHoldCount;

/**
 * P219
 * Lock的getHoldCount()方法，返回当前线程保持此锁定的个数，也就是调用Lock.lock()方法的次数
 *
 * Result:
 * serviceMethod1 getHoldCount=1
 * serviceMethod2 getHoldCount=2
 *
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();
    }
}
