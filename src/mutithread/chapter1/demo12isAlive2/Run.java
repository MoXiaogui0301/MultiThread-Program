package mutithread.chapter1.demo12isAlive2;

/**
 *
 * P19
 * 将线程对象以构造参数方式传递给Thread对象时，Thread.currentThread()和this是不同的线程
 *
 * Result:
 * CountOperate---begin
 * Thread.currentThread().getName() = main
 * Thread.currentThread().isAlive() = true
 * this.getName() = Thread-0
 * this.isAlive() = false
 * CountOperate---end
 * main begin t1 is Alive = false
 * run---begin
 * main end t1 is Alive = true
 * Thread.currentThread().getName() = A
 * Thread.currentThread().isAlive() = true
 * this.getName() = Thread-0
 * this.isAlive() = false
 * run---end
 */
public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 is Alive = " + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 is Alive = " + t1.isAlive());
    }
}
