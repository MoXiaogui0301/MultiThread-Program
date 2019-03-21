package multithread.chapter2.demo16SynchronizedUsingObjectAvoidDirtyRead;

import java.util.ArrayList;
import java.util.List;

/**
 * 只能容纳一个对象的List类
 */
public class MyOneList {
    private List list = new ArrayList();

    synchronized public void add(String data)   {
        list.add(data);
    }

    synchronized public int getSize()   {
        return list.size();
    }
}
