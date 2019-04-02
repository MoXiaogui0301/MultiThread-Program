package multithread.chapter3.demo28ThreadLocalVariableIsIsolation1;

public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i=0; i<100; i++)   {
                Tools.t1.set("ThreadB" + (i+1) + System.currentTimeMillis());
                System.out.println("ThreadB get Value=" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e)   {
            e.printStackTrace();
        }
    }
}
