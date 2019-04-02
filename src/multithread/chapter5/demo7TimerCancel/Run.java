package multithread.chapter5.demo7TimerCancel;

/**
 * P250
 * Timer.cancel()取消Timer绑定的所有TimerTask
 *
 * Result:
 * 当前时间为:Thu Mar 28 11:42:10 CST 2019
 * 计划时间为:Thu Mar 28 11:42:10 CST 2019
 * A run timer=Thu Mar 28 11:42:10 CST 2019
 * B run timer=Thu Mar 28 11:42:10 CST 2019
 * A run timer=Thu Mar 28 11:42:12 CST 2019
 * B run timer=Thu Mar 28 11:42:12 CST 2019
 * B run timer=Thu Mar 28 11:42:14 CST 2019
 * A run timer=Thu Mar 28 11:42:14 CST 2019
 * A run timer=Thu Mar 28 11:42:16 CST 2019
 * B run timer=Thu Mar 28 11:42:16 CST 2019
 * A run timer=Thu Mar 28 11:42:18 CST 2019
 * B run timer=Thu Mar 28 11:42:18 CST 2019
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("当前时间为:" + new Date());
        Calendar calendarRef1 = Calendar.getInstance();
        Date runDate1 = calendarRef1.getTime();
        System.out.println("计划时间为:" + runDate1);
        MyTaskA myTaskA = new MyTaskA();
        MyTaskB myTaskB = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(myTaskA,runDate1,2000);
        timer.schedule(myTaskB,runDate1,2000);
        Thread.sleep(10000);
        timer.cancel();
    }
}
