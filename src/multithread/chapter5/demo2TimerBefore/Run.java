package multithread.chapter5.demo2TimerBefore;

/**
 * P244
 * 定时器计划时间早于当前时间时，定时器任务提前运行
 *
 * Result:
 * 当前时间为：Thu Mar 28 10:41:18 CST 2019
 * 计划时间为：Thu Mar 28 10:41:08 CST 2019
 * 任务执行了，执行时间为：Thu Mar 28 10:41:18 CST 2019
 * main end
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND,calendarRef.get(Calendar.SECOND) - 10);
        Date runDate = calendarRef.getTime();
        System.out.println("计划时间为：" + runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer(true);
        timer.schedule(task,runDate);
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
