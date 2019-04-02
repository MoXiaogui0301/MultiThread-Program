package multithread.chapter6.demo03LasyMan2;

public class MyObject {
    private static MyObject myObject;

    private MyObject()  {

    }

    //方法一：使用synchronized同步getInstance()方法，但是效率太低
//    synchronized public static MyObject getInstance()   {
//        try {
//            if (myObject != null)   {
//
//            } else {
//                //模拟在创建对象之前做一些准备工作
//                Thread.sleep(3000);
//                myObject = new MyObject();
//            }
//        } catch (InterruptedException e)    {
//            e.printStackTrace();
//        }
//        return myObject;
//    }

    //方法二：使用synchronized同步创建实例的代码块，依然效率低
//    public static MyObject getInstance()    {
//        try {
//            //此种写法等同于:
//            //synchronized public static MyObject getInstance()
//            //效率一样低，全部代码被上锁
//            synchronized (MyObject.class)   {
//                if (myObject != null)   {
//
//                } else {
//                    //模拟在创建对象之前做的准备工作
//                    Thread.sleep(3000);
//                    myObject = new MyObject();
//                }
//            }
//        } catch (InterruptedException e)    {
//            e.printStackTrace();
//        }
//        return myObject;
//    }

    //方法三：使用synchronized同步创建实例的代码，同步范围小，但存在线程安全问题
    public static MyObject getInstance()    {
        try {
            if (myObject != null)   {

            } else {
                Thread.sleep(3000);
                synchronized (MyObject.class)   {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
        return myObject;
    }

}

