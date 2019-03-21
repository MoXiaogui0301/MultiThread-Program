package multithread.chapter2.demo18SynchronizedConfirm2;

/**
 * P93
 * 验证使用了对象为锁和同步快，和对象的同步方法之间，是同步运行的
 *
 * Result:
 * testMethod1 _____getLock time = 1553140977214 run ThreadName = a
 * testMethod1 releaseLock time = 1553140982272 run ThreadName = a
 * speedPrintString ______getLock time = 1553140982273 run ThreadName=b
 * ________________________
 * speedPrintString releaseLock time = 1553140982274 run ThreadName=b
 *
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
