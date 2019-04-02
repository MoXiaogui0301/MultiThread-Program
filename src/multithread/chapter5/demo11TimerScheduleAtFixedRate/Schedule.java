package multithread.chapter5.demo11TimerScheduleAtFixedRate;

/**
 * P260
 * schedule()方法不具备追赶性(在执行时间之前的任务将被自动取消)
 *
 * Result:
 * 现在执行时间：Thu Mar 28 12:16:42 CST 2019
 * 计划执行时间：Thu Mar 28 12:16:22 CST 2019
 * begin timer = Thu Mar 28 12:16:42 CST 2019
 * end timer = Thu Mar 28 12:16:42 CST 2019
 * begin timer = Thu Mar 28 12:16:44 CST 2019
 * end timer = Thu Mar 28 12:16:44 CST 2019
 * begin timer = Thu Mar 28 12:16:46 CST 2019
 * end timer = Thu Mar 28 12:16:46 CST 2019
 * ...
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Schedule {
    static class MyTask extends TimerTask   {
        @Override
        public void run() {
            System.out.println("begin timer = " + new Date());
            System.out.println("end timer = " + new Date());
        }

        public static void main(String[] args) {
            MyTask myTask = new MyTask();
            System.out.println("现在执行时间：" + new Date());
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
            Date runDate = calendarRef.getTime();
            System.out.println("计划执行时间：" + runDate);
            Timer timer = new Timer();
            timer.schedule(myTask,runDate,2000);
        }
    }
}
