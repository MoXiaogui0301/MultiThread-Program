package multithread.chapter2.demo17SynchronizedConfirm1;
/**
 * P91
 * 验证当多个线程使用同一个锁object同时执行Synchronized(object){}同步代码块时呈同步效果
 *
 * Result：
 * test Method1 _____ getLock time = 1553139987566run ThreadName= a
 * test Method1 _____ releaseLock time = 1553139989640run ThreadName= a
 * test Method1 _____ getLock time = 1553139989641run ThreadName= b
 * test Method1 _____ releaseLock time = 1553139991643run ThreadName= b
 *
 */

import multithread.chapter2.demo05SynchronizedMethodAndLock2.MyObject;

public class Run1_1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service,object);
        b.setName("b");
        b.start();
    }
}
