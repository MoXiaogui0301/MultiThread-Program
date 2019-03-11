package mutithread.chapter1.demo18InterruptThreadByException;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0 ; i < 50000 ; i++)   {
            if (this.isInterrupted())   {
                System.out.println(currentThread().getName() + " 已经是停止状态，将要退出");
                break;
            }
            System.out.println("i=" + (i+1));
        }
        System.out.println("我被输出，仅break出原for循环，之后的代码继续执行");
    }
}
