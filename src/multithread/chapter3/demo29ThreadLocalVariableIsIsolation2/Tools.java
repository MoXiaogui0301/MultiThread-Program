package multithread.chapter3.demo29ThreadLocalVariableIsIsolation2;

import java.util.Date;

public class Tools {
    public static ThreadLocal<Date> t1 = new ThreadLocal<>();
}
