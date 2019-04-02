package multithread.chapter5.demo4TimerCircularTask;

/**
 * P247
 * 使用schedule(TimerTask task,Date firstTime,Long period)方法在指定时点firstTime开始，间隔period循环执行task
 * 当firstTime早于当前时间是，task立刻开始执行
 *
 * Result:
 * 当前时间为：Thu Mar 28 11:03:11 CST 2019
 * 计划时间为：Thu Mar 28 11:03:21 CST 2019
 * 任务执行了，时间为：Thu Mar 28 11:03:21 CST 2019
 * 任务执行了，时间为：Thu Mar 28 11:03:25 CST 2019
 * 任务执行了，时间为：Thu Mar 28 11:03:29 CST 2019
 * 任务执行了，时间为：Thu Mar 28 11:03:33 CST 2019
 * ...(非守护线程一直执行)
 *
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
        System.out.println("计划时间为：" + runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        //从runDate开始，每间隔4秒，执行定时器任务task
        timer.schedule(task,runDate,4000);
    }
}
