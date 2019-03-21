package multithread.chapter1.demo7ThreadUnsafe1;

public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("B","bb");
    }
}
