package multithread.chapter5.demo11TimerScheduleAtFixedRate;

/**
 * P260
 * Timer.scheduleAtFixedRate()方法，追赶执行开始时间之前的任务
 *
 * Result:
 * 现在执行时间：Thu Mar 28 12:21:49 CST 2019
 * 计划执行时间：Thu Mar 28 12:21:39 CST 2019
 * begin time=Thu Mar 28 12:21:49 CST 2019
 * end time=Thu Mar 28 12:21:49 CST 2019
 * begin time=Thu Mar 28 12:21:49 CST 2019
 * end time=Thu Mar 28 12:21:49 CST 2019
 * begin time=Thu Mar 28 12:21:49 CST 2019
 * end time=Thu Mar 28 12:21:49 CST 2019
 * begin time=Thu Mar 28 12:21:49 CST 2019
 * end time=Thu Mar 28 12:21:49 CST 2019
 * begin time=Thu Mar 28 12:21:49 CST 2019
 * end time=Thu Mar 28 12:21:49 CST 2019
 * begin time=Thu Mar 28 12:21:49 CST 2019
 * end time=Thu Mar 28 12:21:49 CST 2019
 * begin time=Thu Mar 28 12:21:51 CST 2019
 * end time=Thu Mar 28 12:21:51 CST 2019
 * begin time=Thu Mar 28 12:21:53 CST 2019
 * end time=Thu Mar 28 12:21:53 CST 2019
 * begin time=Thu Mar 28 12:21:55 CST 2019
 * end time=Thu Mar 28 12:21:55 CST 2019
 * begin time=Thu Mar 28 12:21:57 CST 2019
 * end time=Thu Mar 28 12:21:57 CST 2019
 * begin time=Thu Mar 28 12:21:59 CST 2019
 * end time=Thu Mar 28 12:21:59 CST 2019
 * begin time=Thu Mar 28 12:22:01 CST 2019
 * end time=Thu Mar 28 12:22:01 CST 2019
 * ...
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleAtFixedRate {
    static class MyTask extends TimerTask   {
        @Override
        public void run() {
            System.out.println("begin time=" + new Date());
            System.out.println("end time=" + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        System.out.println("现在执行时间：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 10);
        Date runDate = calendarRef.getTime();
        System.out.println("计划执行时间：" + runDate);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task,runDate,2000);
    }
}
