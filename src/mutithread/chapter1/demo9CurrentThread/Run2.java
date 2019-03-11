package mutithread.chapter1.demo9CurrentThread;

/**
 * P16  currentThread()返回代码段被哪个线程调用
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setPriority(8);
        myThread.setName("Run Thread");
        myThread.start();
//        myThread.run();
    }
}
