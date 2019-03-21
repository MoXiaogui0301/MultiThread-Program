package multithread.chapter1.demo24InterruptThreadByForceAndSynchronized;

/**
 * P35
 * thread.stop()释放同步方法printString()的锁，导致打印的密码和用户名不一致
 *
 * Result:
 * B aa
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
