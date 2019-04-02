package multithread.chapter5.demo10TimerDelayCircular;

/**
 * P252
 * schedule(TimerTask task,long delay,long period)方法，在当前时间基础上延迟delay后循环执行task，循环间隔为period
 *
 * Result:
 * 当前时间:Thu Mar 28 11:59:47 CST 2019
 * 定时线程运行了，运行时间为:Thu Mar 28 11:59:50 CST 2019
 * 定时线程运行了，运行时间为:Thu Mar 28 11:59:52 CST 2019
 * 定时线程运行了，运行时间为:Thu Mar 28 11:59:54 CST 2019
 * 定时线程运行了，运行时间为:Thu Mar 28 11:59:56 CST 2019
 * 定时线程运行了，运行时间为:Thu Mar 28 11:59:58 CST 2019
 * 定时线程运行了，运行时间为:Thu Mar 28 12:00:00 CST 2019
 * 定时线程运行了，运行时间为:Thu Mar 28 12:00:02 CST 2019
 * 定时线程运行了，运行时间为:Thu Mar 28 12:00:04 CST 2019
 * ...
 *
 */

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

    static public class MyTask extends TimerTask    {
        @Override
        public void run() {
            System.out.println("定时线程运行了，运行时间为:" + new Date());
        }
    }
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间:" + new Date());
        timer.schedule(myTask,3000,2000);
    }
}
