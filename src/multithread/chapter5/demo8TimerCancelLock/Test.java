package multithread.chapter5.demo8TimerCancelLock;

/**
 * P251
 * Timer的cancel()方法没有抢到queue锁，使定时线程继续执行，没有被cancel停止
 *
 * Result:
 * ...
 * 第679771次没有被cancel取消
 * 第679772次没有被cancel取消
 * 第679790次没有被cancel取消
 * 第679792次没有被cancel取消
 * 第679799次没有被cancel取消
 * ...
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {
    public static void main(String[] args) {
        int i=0;
        Calendar calendarRef1 = Calendar.getInstance();
        Date runDate1 = calendarRef1.getTime();
        while (true)    {
            i++;
            Timer timer = new Timer();
            MyTaskA myTaskA = new MyTaskA(i);
            timer.schedule(myTaskA,runDate1);
            timer.cancel();
        }
    }
}
