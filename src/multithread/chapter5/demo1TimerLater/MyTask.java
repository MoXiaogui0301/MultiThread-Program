package multithread.chapter5.demo1TimerLater;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("定时任务执行啦，执行时间为：" + new Date());
    }
}
