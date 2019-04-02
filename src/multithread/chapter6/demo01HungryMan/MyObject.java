package multithread.chapter6.demo01HungryMan;

public class MyObject {
    //立即加载方式==饿汉模式，MyObject对象在调用getInstance()方法前完成加载
    private static MyObject myObject = new MyObject();

    private MyObject()  {
        //私有构造器，防止其他类通过new创建对象
    }

    public static MyObject getInstance()    {
        //此代码版本为立即加载
        //缺点是不能有其他实例变量
        //因为getInstance()方法没有同步，所以可能出现非线程安全问题
        return myObject;
    }
}
