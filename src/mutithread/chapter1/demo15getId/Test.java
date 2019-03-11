package mutithread.chapter1.demo15getId;

/**
 * P22
 * getId()  Returns the identifier of this Thread.
 * 获取线程的唯一标识
 *
 * Result：
 * main  1
 */
public class Test {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + "  " + runThread.getId());
    }
}

