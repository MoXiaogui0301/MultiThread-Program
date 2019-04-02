package multithread.chapter7.demo12SimpleDateFormat1;
/**
 * P293
 * 演示类SimpleDateFormat在多线程环境下处理日期但得出的结果却是错误的
 *
 * Result:
 * ThreadName=Thread-5报错了 日期字符串：2000-01-06 转换成的日期为：220000-02-24
 * ThreadName=Thread-4报错了 日期字符串：2000-01-05 转换成的日期为：220000-02-24
 * ThreadName=Thread-2报错了 日期字符串：2000-01-03 转换成的日期为：220000-02-24
 * ThreadName=Thread-3报错了 日期字符串：2000-01-04 转换成的日期为：0022-02-24
 * ThreadName=Thread-0报错了 日期字符串：2000-01-01 转换成的日期为：220000-02-24
 * ThreadName=Thread-1报错了 日期字符串：2000-01-02 转换成的日期为：0022-02-24
 *
 */

import java.text.SimpleDateFormat;

public class Run {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[] {
                "2000-01-01","2000-01-02","2000-01-03","2000-01-04","2000-01-05","2000-01-06"
        };
        MyThread[] threadArray = new MyThread[6];
        for (int i=0; i<6; i++) {
            threadArray[i] = new MyThread(sdf,dateStringArray[i]);
        }
        for (int i=0; i<6; i++) {
            threadArray[i].start();
        }
    }
}
