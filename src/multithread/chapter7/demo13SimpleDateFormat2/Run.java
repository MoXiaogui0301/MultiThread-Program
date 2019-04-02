package multithread.chapter7.demo13SimpleDateFormat2;
/**
 * P294
 * 演示类SimpleDateFormat在多线程环境下处理日期但得出的结果却是错误的
 * 解决办法1创建多个SimpleDateFormat对象(有修改)
 *
 * Result:
 * (无输出，证明全部成功转换)
 *
 */

public class Run {
    public static void main(String[] args) {
        String[] dateStringArray = {
                "2000-01-01","2000-01-02","2000-01-03","2000-01-04","2000-01-05","2000-01-06"
        };
        MyThread[] threadArray = new MyThread[6];
        for (int i=0; i<6; i++) {
            threadArray[i] = new MyThread(dateStringArray[i]);
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=0; i<6; i++) {
            threadArray[i].start();
        }
    }
}
