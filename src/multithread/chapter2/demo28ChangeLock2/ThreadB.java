package multithread.chapter2.demo28ChangeLock2;

public class ThreadB extends Thread {

    private Service service;
    private Userinfo userinfo;

    public ThreadB(Service service,Userinfo userinfo)   {
        this.service = service;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }

}
