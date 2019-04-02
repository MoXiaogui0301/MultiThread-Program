package multithread.chapter3.demo25ThreadJoinAndSleep2;

import multithread.chapter3.demo24ThreadJoinAndSleep.ThreadB;

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b)   {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b)    {
                b.start();
                b.join();
                for (int i=0; i<Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
