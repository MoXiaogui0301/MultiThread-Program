package multithread.chapter5.demo5TimerMutiCircularTasks;

/**
 * P248
 * 演示任务执行时间被延后(Task执行时间超过循环间隔时间，仍然在Timer队列中依次执行)
 *
 * 当前时间为：Thu Mar 28 11:10:53 CST 2019
 * 计划执行时间为：Thu Mar 28 11:10:53 CST 2019
 * A begin timer=Thu Mar 28 11:11:03 CST 2019
 * A end timer=Thu Mar 28 11:11:08 CST 2019
 * A begin timer=Thu Mar 28 11:11:08 CST 2019
 * A end timer=Thu Mar 28 11:11:13 CST 2019
 * A begin timer=Thu Mar 28 11:11:13 CST 2019
 * A end timer=Thu Mar 28 11:11:18 CST 2019
 * A begin timer=Thu Mar 28 11:11:18 CST 2019
 * A end timer=Thu Mar 28 11:11:23 CST 2019
 * A begin timer=Thu Mar 28 11:11:23 CST 2019
 * A end timer=Thu Mar 28 11:11:28 CST 2019
 * ...
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {
    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND,10);
        Date runDate = calendarRef.getTime();
        System.out.println("计划执行时间为：" + new Date());
        MyTaskA myTaskA = new MyTaskA();
        Timer timer = new Timer();
        timer.schedule(myTaskA,runDate,3000);
    }
}
