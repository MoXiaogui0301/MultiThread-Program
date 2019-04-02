package multithread.chapter5.demo9TimerDelay;

/**
 * P252
 * schedule(TimerTask task,Long delay)方法，在当前时间基础上延迟delay时间执行task任务
 *
 * Result:
 * 当前时间:Thu Mar 28 11:54:02 CST 2019
 * execute after 3 seconds
 * 定时线程运行了，执行时间为：Thu Mar 28 11:54:05 CST 2019
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
            System.out.println("定时线程运行了，执行时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间:" + new Date());
        System.out.println("execute after 3 seconds");
        timer.schedule(myTask,3000);
    }
}
