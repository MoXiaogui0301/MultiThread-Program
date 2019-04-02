package multithread.chapter5.demo7TimerCancel;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A run timer=" + new Date());
    }
}
