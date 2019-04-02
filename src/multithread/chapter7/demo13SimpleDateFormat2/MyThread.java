package multithread.chapter7.demo13SimpleDateFormat2;

import java.text.ParseException;
import java.util.Date;

public class MyThread extends Thread {
    private String dateString;

    public MyThread(String dateString) {
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = DateTools.parse("yyyy-MM-dd",dateString);
            String newDateString = DateTools.format("yyyy-MM-dd",dateRef).toString();
            if (!newDateString.equals(dateString))  {
                System.out.println("ThreadName=" + this.getName() + "报错了 日期字符串：" + dateString + " 转换成的日期为：" + newDateString);
            }
        } catch (ParseException e)  {
            e.printStackTrace();
        }
    }
}
