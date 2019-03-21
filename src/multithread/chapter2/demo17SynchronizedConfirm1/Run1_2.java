package multithread.chapter2.demo17SynchronizedConfirm1;
/**
 * P93
 * 多线程持有不同的object锁，运行Synchronized(object){}同步代码块时异步执行
 *
 * Result:
 * test Method1 _____ getLock time = 1553140070819run ThreadName= a
 * test Method1 _____ getLock time = 1553140070820run ThreadName= b
 * test Method1 _____ releaseLock time = 1553140072920run ThreadName= b
 * test Method1 _____ releaseLock time = 1553140072920run ThreadName= a
 *
 */

import multithread.chapter2.demo05SynchronizedMethodAndLock2.MyObject;

public class Run1_2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();
        ThreadA a = new ThreadA(service,object1);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service,object2);
        b.setName("b");
        b.start();
    }
}
