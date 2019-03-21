package multithread.chapter2.demo15SynchronizedUsingObjectConfirm;

/**
 * P85
 * 演示使用不同object为对象监视器时，绑定在不同锁的方法异步执行
 *
 * Result:
 * b begin
 * a begin
 * b end
 * a end
 *
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        threadB.start();
    }
}
