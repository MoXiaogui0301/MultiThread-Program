package multithread.chapter3.demo15ProducerAndCustomer4;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<String> list = new ArrayList<>();

    synchronized public void push() {
        try {
//            if (list.size() == 1)   {
            while (list.size() == 1)   {
                this.wait();
            }
            list.add("anyString=" + Math.random());
//            this.notify();
            this.notifyAll();
            System.out.println("push=" + list.size());
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }

    synchronized public String pop()    {
        String returnValue="";
        try {
//            if (list.size() == 0)   {
            while (list.size() == 0)   {
                System.out.println("pop操作中的:" + Thread.currentThread().getName() + "线程为wait状态");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
//            this.notify();
            this.notifyAll();
            System.out.println("pop=" + list.size());
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
        return returnValue;
    }
}
