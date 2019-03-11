package mutithread.chapter1.demo29SuspendWeakness3;

/**
 * P41
 * suspend导致线程不安全的场景
 * 在写入密码前suspend，导致password未被更新
 *
 * Result:
 * 停止a线程
 * username:a password:11
 *
 */
public class Run {
    public static void main(String[] args) {
        //final修饰对象，表示该对象的引用地址不能被改变
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                myObject.setValue("a","aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                myObject.printUsernamePassword();
            }
        };
        thread2.start();
    }
}
