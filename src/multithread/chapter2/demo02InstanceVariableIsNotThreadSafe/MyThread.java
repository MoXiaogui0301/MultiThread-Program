package multithread.chapter2.demo02InstanceVariableIsNotThreadSafe;

public class MyThread extends Thread {
    private HasSelfPrivateNum numRef;
    private String username;

    public MyThread(HasSelfPrivateNum numRef,String username)   {
        this.numRef = numRef;
        this.username = username;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI(username);
    }
}
