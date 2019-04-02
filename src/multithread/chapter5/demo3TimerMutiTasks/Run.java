package multithread.chapter5.demo3TimerMutiTasks;

/**
 * P245
 * Timer执行多个定时任务时，TaskA执行时间过长，可能造成TaskB直接执行
 * 实际上，Task是放置在Timer队列中逐个执行的
 *
 * Result:
 * 当前时间为：Thu Mar 28 10:52:38 CST 2019
 * A计划时间为：Thu Mar 28 10:52:38 CST 2019
 * B计划时间为：Thu Mar 28 10:52:43 CST 2019
 * A begin timer=Thu Mar 28 10:52:38 CST 2019
 * A end timer=Thu Mar 28 10:52:48 CST 2019
 * B begin timer=Thu Mar 28 10:52:48 CST 2019
 * B end timer=Thu Mar 28 10:52:48 CST 2019
 * ...(由于未设置Timer为守护线程，所以Timer线程不会结束)
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {
    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef1 = Calendar.getInstance();
        Date runDate1 =calendarRef1.getTime();
        System.out.println("A计划时间为：" + runDate1);
        Calendar calendarRef2 = Calendar.getInstance();
        calendarRef2.add(Calendar.SECOND,5);
        Date runDate2 = calendarRef2.getTime();
        System.out.println("B计划时间为：" + runDate2);

        MyTaskA task1 = new MyTaskA();
        MyTaskB task2 = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(task1,runDate1);
        timer.schedule(task2,runDate2);
    }
}
