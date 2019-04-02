package multithread.chapter4.demo02ReentrantLock2;

/**
 * P202
 * ReentrantLock使用例程2，通过lock实现同步
 *
 * Result:
 * methodB begin ThreadName=BB time=1553585365464
 * methodB end ThreadName=BB time=1553585367540
 * methodA begin ThreadName=AA time=1553585367541
 * methodA end ThreadName=AA time=1553585369543
 * methodA begin ThreadName=A time=1553585369544
 * methodA end ThreadName=A time=1553585371544
 * methodB begin ThreadName=B time=1553585371545
 * methodB end ThreadName=B time=1553585373548
 *
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();

        ThreadA a = new ThreadA(myService);
        ThreadAA aa = new ThreadAA(myService);
        ThreadB b = new ThreadB(myService);
        ThreadBB bb = new ThreadBB(myService);

        a.setName("A");
        aa.setName("AA");
        b.setName("B");
        bb.setName("BB");

        a.start();
        aa.start();
        b.start();
        bb.start();
    }
}
