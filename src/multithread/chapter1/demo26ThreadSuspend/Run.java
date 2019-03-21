package multithread.chapter1.demo26ThreadSuspend;

/**
 * P37
 * suspend()    Deprecated.     暂停线程
 * resume()     Deprecated.     恢复线程        This method exists solely for use with suspend(), which has been deprecated because it is deadlock-prone.
 *
 * Result:
 * A=1552295942165 i=314564099
 * A=1552295944199 i=314564099
 * B=1552295946204 i=1578737812
 * B=1552295948207 i=1578737812
 *
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(500);

            //执行0.5秒后暂停
            thread.suspend();
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(2000);
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());

            //恢复，继续执行2秒
            thread.resume();
            Thread.sleep(2000);

            //暂停，主线程暂停以确定thread处于暂停状态
            thread.suspend();
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(2000);
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
