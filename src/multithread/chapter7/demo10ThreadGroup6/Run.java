package multithread.chapter7.demo10ThreadGroup6;

/**
 * P291 递归与非递归获取组内对象
 * 通过enumerate()方法，递归/非递归 获取子孙线程组
 *
 * Result:
 * A
 * B
 * A
 *
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup groupA = new ThreadGroup(mainGroup,"A");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("runMethod!");
                    Thread.sleep(10000);
                } catch (InterruptedException e)    {
                    e.printStackTrace();
                }
            }
        };
        ThreadGroup groupB = new ThreadGroup(groupA,"B");
        ThreadGroup[] listGroup1 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        //enumerate()方法传入true返回子组及子孙组
        Thread.currentThread().getThreadGroup().enumerate(listGroup1,true);
        for (int i=0; i<listGroup1.length; i++) {
            if (listGroup1[i] != null)
                System.out.println(listGroup1[i].getName());
        }
        ThreadGroup[] listGroup2 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        //enumerate()方法传入false仅返回子线程组
        Thread.currentThread().getThreadGroup().enumerate(listGroup2,false);
        for (int i=0; i<listGroup2.length; i++) {
            if (listGroup2[i] != null)
                System.out.println(listGroup2[i].getName());
        }
    }
}
