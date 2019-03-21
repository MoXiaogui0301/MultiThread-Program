package multithread.chapter2.demo06DirtyRead;

public class ThreadA extends Thread {
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
