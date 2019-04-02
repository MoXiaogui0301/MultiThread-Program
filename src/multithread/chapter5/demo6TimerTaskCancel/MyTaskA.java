package multithread.chapter5.demo6TimerTaskCancel;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A run timer=" + new Date());
        this.cancel();
        System.out.println("定时任务A自动移除自己");
    }
}
