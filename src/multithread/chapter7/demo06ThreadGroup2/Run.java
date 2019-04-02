package multithread.chapter7.demo06ThreadGroup2;

/**
 * P287
 * 线程对象关联线程组：多级关联
 *
 * Result:
 * runMethod!
 * main线程中有多少个子线程组：1名字为：A
 * Z
 *
 */
public class Run {
    public static void main(String[] args) {
        //在main组中添加线程组A，然后在A中添加线程对象Z
        //方法activeGroupCount()和activeCount()的值不是固定的，而是系统中环境的一个快照
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainGroup,"A");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("runMethod!");
                    Thread.sleep(10000);    //线程必须在运行状态才可受线程组管理
                } catch (InterruptedException e)    {
                    e.printStackTrace();
                }
            }
        };

        Thread newThread = new Thread(group,runnable);
        newThread.setName("Z");
        newThread.start();  //线程必须启动才会加入到线程组
        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup);
        System.out.println("main线程中有多少个子线程组：" + listGroup.length + "名字为：" + listGroup[0].getName());
        Thread[] listThread = new Thread[listGroup[0].activeCount()];
        listGroup[0].enumerate(listThread);
        System.out.println(listThread[0].getName());
    }
}
