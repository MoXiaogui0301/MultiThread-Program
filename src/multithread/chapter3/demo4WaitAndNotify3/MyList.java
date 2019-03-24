package multithread.chapter3.demo4WaitAndNotify3;
import java.util.ArrayList;
import java.util.List;

public class MyList {
    private static List list = new ArrayList<String>();

    public static void add()    {
        list.add("node");
    }

    public static int size()    {
        return list.size();
    }
}
