package multithread.chapter6.demo07StaticBlockofLasySingleton;

public class MyObject {
    private static MyObject instance = null;

    private MyObject()  {

    }

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance()    {
        return instance;
    }
}
