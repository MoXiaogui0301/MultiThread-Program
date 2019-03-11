package mutithread.chapter1.demo19InterruptThreadByException2;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i=0 ; i<50000 ; i++){
                if (this.interrupted()) {
                    System.out.println("已经是停止状态，即将退出");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i+1));
            }
            System.out.println("for循环之后的语句");
        }catch (InterruptedException e) {
            System.out.println("进入MyThread.java类run方法中的catch语句块了");
            e.printStackTrace();
        }
    }
}
