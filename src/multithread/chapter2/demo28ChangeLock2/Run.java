package multithread.chapter2.demo28ChangeLock2;

/**
 * P117
 * 演示使用对象为锁时，修改对象的属性前后，对象仍是同一把锁
 * A线程和B线程均使用userinfo作为锁
 * A线程启动后更改了userinfo的username属性
 * 更改后，A和B仍然争抢同一把锁，同步执行
 *
 * Result:
 * A
 * end! time=1553159315491
 * B
 * end! time=1553159318517
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            Userinfo userinfo = new Userinfo();
            ThreadA a = new ThreadA(service,userinfo);
            a.setName("A");
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(service,userinfo);
            b.setName("B");
            b.start();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
