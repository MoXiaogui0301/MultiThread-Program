package multithread.chapter3.demo1ThreadCommunicationWithoutWaitNotify;

/**
 * P133
 * 演示不使用wait/notify进行线程通信
 * 使用传统的轮询机制，存在问题是浪费CPU资源
 * 对书上代码有改动，需要使用volatile保证list.size()返回的集合大小的可见性，否则ThreadB无法即时获知size大小
 *
 * Result:
 * 添加了1个元素
 * 添加了2个元素
 * 添加了3个元素
 * 添加了4个元素
 * 添加了5个元素
 * list size==5，线程b要退出了！
 * java.lang.InterruptedException
 * 	at multithread.chapter3.demo1ThreadCommunicationWithoutWaitNotify.NotifyThread.run(NotifyThread.java:19)
 * 添加了6个元素
 * 添加了7个元素
 * 添加了8个元素
 * ...
 *
 */
public class Test {
    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
