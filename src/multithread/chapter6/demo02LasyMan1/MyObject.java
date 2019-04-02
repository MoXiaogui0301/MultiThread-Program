package multithread.chapter6.demo02LasyMan1;

public class MyObject {
    //此处没有new出MyObject对象
    private static MyObject myObject;

    private MyObject()  {

    }

    public static MyObject getInstance()    {
        //延迟加载
        if (myObject != null)   {

        } else {
            //模拟创建对象之前做的一些准备工作
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e)    {
                e.printStackTrace();
            }
            myObject = new MyObject();
        }
        return myObject;
    }
}
