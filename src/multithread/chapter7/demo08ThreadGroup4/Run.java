package multithread.chapter7.demo08ThreadGroup4;

/**
 * P289
 * 线程组中添加线程组
 * 获取父线程组 getParent()
 *
 * Result:
 * 线程组名称：main
 * 线程组中活动的线程数量：2
 * 线程组中线程组数量 —— 增加之前0
 * 线程组中线程组数量 —— 增加之后1
 * 父线程组名称：system
 *
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("线程组名称：" + Thread.currentThread().getThreadGroup().getName());
        System.out.println("线程组中活动的线程数量：" + Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("线程组中线程组数量 —— 增加之前" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup threadGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(),"newGroup");
        System.out.println("线程组中线程组数量 —— 增加之后" + Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("父线程组名称：" + Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
