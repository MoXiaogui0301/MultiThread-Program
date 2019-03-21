package multithread.chapter1.demo23InterruptThreadByForceAndThreadDeath;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            this.stop();
        }catch (ThreadDeath e)  {
            System.out.println("进入catch捕捉到ThreadDeath异常");
            e.printStackTrace();
        }
    }
}
