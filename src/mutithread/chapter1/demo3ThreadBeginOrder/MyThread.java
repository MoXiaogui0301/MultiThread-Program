package mutithread.chapter1.demo3ThreadBeginOrder;

public class MyThread extends Thread {

    private int i;

    public MyThread(int i){
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
