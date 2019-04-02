package multithread.chapter3.demo17ProducerAndCustomer6;

/**
 * P169
 * 多生产与一消费：操作栈
 *
 * Result:
 * ...
 * Thread-5 pop=0
 * pop操作中的：Thread-5 线程呈wait状态
 * push操作中的：Thread-3 线程被唤醒
 * Thread-3 push=1
 * push操作中的：Thread-3 线程呈wait状态
 * pop操作中的：Thread-5 线程被唤醒
 * Thread-5 pop=0
 * pop操作中的：Thread-5 线程呈wait状态
 * push操作中的：Thread-3 线程被唤醒
 * Thread-3 push=1
 * push操作中的：Thread-3 线程呈wait状态
 * pop操作中的：Thread-5 线程被唤醒
 * Thread-5 pop=0
 * pop操作中的：Thread-5 线程呈wait状态
 * push操作中的：Thread-3 线程被唤醒
 * Thread-3 push=1
 * push操作中的：Thread-3 线程呈wait状态
 * pop操作中的：Thread-5 线程被唤醒
 * Thread-5 pop=0
 * pop操作中的：Thread-5 线程呈wait状态
 * push操作中的：Thread-3 线程被唤醒
 * Thread-3 push=1
 * ...
 *
 */

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<String> list = new ArrayList<>();

    synchronized public void push() {
        try {
            while (list.size() == 1) {
                System.out.println("push操作中的：" + Thread.currentThread().getName() + " 线程呈wait状态");
                this.wait();
                System.out.println("push操作中的：" + Thread.currentThread().getName() + " 线程被唤醒");
            }
            list.add("anyString=" + Math.random());
            System.out.println(Thread.currentThread().getName() + " push=" + list.size());
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String returnValue = "";
        try {
            while (list.size() == 0)    {
                System.out.println("pop操作中的：" + Thread.currentThread().getName() + " 线程呈wait状态");
                this.wait();
                System.out.println("pop操作中的：" + Thread.currentThread().getName() + " 线程被唤醒");
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            System.out.println(Thread.currentThread().getName() + " pop=" + list.size());
            this.notifyAll();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
        return  returnValue;
    }
}
