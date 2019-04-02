package multithread.chapter7.demo07ThreadGroup3;

/**
 * P288
 * 线程组自动归属特性
 * 当前线程创建的线程组自动归属于当前线程
 *
 * Result:
 * A处线程：main 所属线程组名为main  中有线程组数量：0
 * B处线程：main 所属线程组名为main  中有线程组数量：1
 * 第一个线程组名称为：新的组
 *
 */
public class Run {
    public static void main(String[] args) {
        //方法activeGroupCount()取得当前线程组对象中的子线程数量
        //方法enumerate()作用是将线程组中的子线程以复制的形式拷贝到ThreadGroup[]数组对象中
        System.out.println("A处线程：" + Thread.currentThread().getName() + " 所属线程组名为" + Thread.currentThread().getThreadGroup().getName() + " " +
        " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup("新的组");     //自动添加到main组中
        System.out.println("B处线程：" + Thread.currentThread().getName() + " 所属线程组名为" + Thread.currentThread().getThreadGroup().getName() + " " +
                " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] threadGroups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroups);

        for (int i=0; i<threadGroups.length; i++)   {
            System.out.println("第一个线程组名称为：" + threadGroups[i].getName());
        }
    }
}
