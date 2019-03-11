package mutithread.chapter1.demo17interrupted;

/**
 * P26
 * interrupt()中断当前线程
 * interrupted()测试当前线程是否已经中断(第一次返回true)，并清除线程中断状态(第二次返回false)
 *
 * Result:
 * 是否停止1? = true
 * 是否停止2? = false
 * end!
 *
 */
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1? = " + Thread.interrupted());
        System.out.println("是否停止2? = " + Thread.interrupted());
        System.out.println("end!");
    }
}
