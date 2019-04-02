package multithread.chapter5.demo6TimerTaskCancel;
/**
 * P250
 * TimerTask类的cancel()方法，将TimerTask从Timer的schedule移除
 *
 * Result:
 * 当前时间为:Thu Mar 28 11:35:01 CST 2019
 * 计划时间为:Thu Mar 28 11:35:01 CST 2019
 * A run timer=Thu Mar 28 11:35:01 CST 2019
 * 定时任务A自动移除自己
 * B run timer=Thu Mar 28 11:35:01 CST 2019
 * B run timer=Thu Mar 28 11:35:01 CST 2019
 * B run timer=Thu Mar 28 11:35:02 CST 2019
 * B run timer=Thu Mar 28 11:35:02 CST 2019
 * B run timer=Thu Mar 28 11:35:03 CST 2019
 * B run timer=Thu Mar 28 11:35:03 CST 2019
 * B run timer=Thu Mar 28 11:35:03 CST 2019
 * B run timer=Thu Mar 28 11:35:04 CST 2019
 * B run timer=Thu Mar 28 11:35:04 CST 2019
 * B run timer=Thu Mar 28 11:35:05 CST 2019
 * B run timer=Thu Mar 28 11:35:05 CST 2019
 * B run timer=Thu Mar 28 11:35:05 CST 2019
 * B run timer=Thu Mar 28 11:35:06 CST 2019
 * B run timer=Thu Mar 28 11:35:06 CST 2019
 * B run timer=Thu Mar 28 11:35:07 CST 2019
 * B run timer=Thu Mar 28 11:35:07 CST 2019
 * B run timer=Thu Mar 28 11:35:07 CST 2019
 * B run timer=Thu Mar 28 11:35:08 CST 2019
 * B run timer=Thu Mar 28 11:35:08 CST 2019
 * ...
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {
    public static void main(String[] args) {
        System.out.println("当前时间为:" + new Date());
        Calendar calendarRef1 = Calendar.getInstance();
        Date runDate1 = calendarRef1.getTime();
        System.out.println("计划时间为:" + runDate1);
        MyTaskA myTaskA = new MyTaskA();
        MyTaskB myTaskB = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(myTaskA,runDate1,4000);
        timer.schedule(myTaskB,runDate1,400);
    }
}
