package multithread.chapter3.demo29ThreadLocalVariableIsIsolation2;

/**
 * P193
 * 演示LocalThread的隔离性例程2
 * 在LocalThread.get()前先做空值判断，若不存在值则set，存在值则直接读取
 *
 * Result:
 * A 1553569528313
 * A 1553569528313
 * A 1553569528313
 * A 1553569528313
 * A 1553569528313
 * A 1553569528313
 * A 1553569528313
 * A 1553569528313
 * A 1553569528313
 * A 1553569528313
 * B 1553569529309
 * B 1553569529309
 * B 1553569529309
 * B 1553569529309
 * B 1553569529309
 * B 1553569529309
 * B 1553569529309
 * B 1553569529309
 * B 1553569529309
 * B 1553569529309
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
