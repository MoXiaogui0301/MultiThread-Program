package multithread.chapter6.demo04DCLofLasySingleton;

public class MyObject {
    private volatile static MyObject myObject;

    private MyObject()  {

    }

    //使用DCL(双检测锁机制)解决问题，在保证不需同步代码异步执行的同时保证单例效果
    public static MyObject getInstance()    {
        try {
            if (myObject!=null) {

            } else {
                Thread.sleep(3000);
                synchronized (MyObject.class)   {
                    if (myObject == null)   {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
        return myObject;
    }
}
