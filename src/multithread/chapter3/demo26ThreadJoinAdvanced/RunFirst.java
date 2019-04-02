package multithread.chapter3.demo26ThreadJoinAdvanced;

/**
 * P189
 * 验证main的输出main end通常在线程a和线程b获得cpu时间片之前执行
 *
 * Result(通常):
 * main end=1553525007388
 * begin B ThreadName=Thread-0  1553525007388
 * end B ThreadName=Thread-0  1553525012461
 * begin A ThreadName=Thread-1  1553525012462
 * end A ThreadName=Thread-1  1553525017468
 * 或
 * main end=1553525061999
 * begin A ThreadName=Thread-1  1553525062000
 * end A ThreadName=Thread-1  1553525067055
 * begin B ThreadName=Thread-0  1553525067059
 * end B ThreadName=Thread-0  1553525072062
 *
 */
public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("main end=" + System.currentTimeMillis());
    }
}
