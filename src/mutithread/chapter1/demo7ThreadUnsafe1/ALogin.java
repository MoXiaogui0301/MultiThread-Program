package mutithread.chapter1.demo7ThreadUnsafe1;

public class ALogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("A","aa");
    }
}
