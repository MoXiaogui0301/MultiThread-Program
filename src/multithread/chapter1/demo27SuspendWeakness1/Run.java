package multithread.chapter1.demo27SuspendWeakness1;

/**
 * P38
 * 演示调用同步方法printString()的线程在suspend后不释放锁，其他线程无法再进入printString()方法
 *
 * Result:
 * begin
 * a线程suspend，独占此对象的printString()
 * thread2已启动，但无法进入同步方法printString()
 * 因为thread1占用同步方法printString()
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("thread2已启动，但无法进入同步方法printString()");
                    System.out.println("因为thread1占用同步方法printString()");
                    object.printString();
                }
            };
            thread2.start();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
