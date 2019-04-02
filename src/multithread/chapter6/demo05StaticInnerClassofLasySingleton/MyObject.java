package multithread.chapter6.demo05StaticInnerClassofLasySingleton;

public class MyObject {
    public static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject()  {

    }


    public static MyObject getInstance()    {
        return MyObjectHandler.myObject;
    }
}
