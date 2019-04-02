package multithread.chapter5.demo3TimerMutiTasks;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B begin timer=" + new Date());
        System.out.println("B end timer=" + new Date());
    }
}
