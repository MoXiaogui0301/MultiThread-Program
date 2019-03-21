package multithread.chapter2.demo15SynchronizedUsingObjectConfirm;

public class Service {
    private String anyString = new String();

    public void a() {
        try {
            synchronized (anyString)    {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }

    public void b() {
        System.out.println("b begin");
        System.out.println("b end");
    }
}
