package multithread.chapter3.demo5NotifyHoldLock;

/**
 * P144
 * 演示必须执行完notify()方法所在的同步synchronized代码块后才释放锁
 *
 * Result:
 * begin wait at 1553251464466 Thread-0
 * begin notify at 1553251464502 Thread-2
 * end notify at 1553251466506 Thread-2
 * begin notify at 1553251466508 Thread-1
 * end notify at 1553251468509 Thread-1
 * end wait at 1553251468509 Thread-0
 *
 * 存疑，与书P146结果不一致，书上结果为
 * Result(book):
 * begin wait at 1553251464466 Thread-0
 * begin notify at 1553251464502 Thread-2
 * end notify at 1553251466506 Thread-2
 * end wait at 1553251468509 Thread-0
 * begin notify at 1553251466508 Thread-1
 * end notify at 1553251468509 Thread-1
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        synNotifyThread synNotifyThread = new synNotifyThread(lock);
        synNotifyThread.start();
    }
}
