package multithread.chapter2.demo33SynchronizedIsMytualAndVIsible;

public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        System.out.println("开始循环");
        while(isContinueRun == true)    {
            synchronized (new String("123")){}
        }
        System.out.println("停下来了！");
    }

    public void stopMethod()    {
        isContinueRun = false;
    }
}
