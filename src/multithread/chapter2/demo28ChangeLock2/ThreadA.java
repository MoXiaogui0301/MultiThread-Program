package multithread.chapter2.demo28ChangeLock2;

public class ThreadA extends Thread {

    private Service service;
    private Userinfo userinfo;

    public ThreadA(Service service,Userinfo userinfo)   {
        this.service = service;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }
}
