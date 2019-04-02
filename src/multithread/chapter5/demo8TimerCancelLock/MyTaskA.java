package multithread.chapter5.demo8TimerCancelLock;

import java.util.TimerTask;

public class MyTaskA extends TimerTask {
    private int i;

    public MyTaskA(int i)   {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("第" + i + "次没有被cancel取消");
    }
}
