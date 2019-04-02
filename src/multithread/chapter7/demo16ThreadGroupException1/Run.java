package multithread.chapter7.demo16ThreadGroupException1;

/**
 * P299
 * 线程组中一个线程报错后，其他线程依然继续运行
 *
 * Result:
 * 死循环中：线程6
 * Exception in thread "报错线程" java.lang.NumberFormatException: For input string: "a"
 * 死循环中：线程10
 * 死循环中：线程3
 * 死循环中：线程7
 * 死循环中：线程4
 *
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("我的线程组");
        MyThread[] myThreads = new MyThread[10];
        for (int i=0; i<myThreads.length; i++)  {
            myThreads[i] = new MyThread(group,"线程"+(i+1),"1");
            myThreads[i].start();
        }
        MyThread newT = new MyThread(group,"报错线程","a");
        newT.start();
    }
}
