package multithread.chapter3.demo1ThreadCommunicationWithoutWaitNotify;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    volatile int size;
    private List list = new ArrayList<String>();

    public void add()   {
        list.add("Node");
    }

    public int size()   {
        return size = list.size();
    }
}
