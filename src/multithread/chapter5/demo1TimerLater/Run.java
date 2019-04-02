package multithread.chapter5.demo1TimerLater;
/**
 * P241
 * 演示使用Timer在未来时间执行定时线程
 *
 * Result:
 * 当前时间为:Thu Mar 28 10:34:22 CST 2019
 * 定时任务执行啦，执行时间为：Thu Mar 28 10:34:27 CST 2019
 * main结束了，结束时间为:Thu Mar 28 10:34:28 CST 2019
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("当前时间为:" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND,5);
        Date runDate = calendarRef.getTime();

        MyTask task = new MyTask();
        Timer timer = new Timer(true);  //设置为守护线程，否则会一直运行
        timer.schedule(task,runDate);
        Thread.sleep(6000);
        System.out.println(Thread.currentThread().getName() + "结束了，结束时间为:" + new Date(System.currentTimeMillis()));
    }
}
