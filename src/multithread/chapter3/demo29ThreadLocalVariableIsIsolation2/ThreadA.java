package multithread.chapter3.demo29ThreadLocalVariableIsIsolation2;

import java.util.Date;

public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++)    {
                if (Tools.t1.get() == null) {
                    Tools.t1.set(new Date());
                }
                System.out.println("A " + Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
