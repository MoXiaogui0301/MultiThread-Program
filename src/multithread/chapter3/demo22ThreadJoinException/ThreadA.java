package multithread.chapter3.demo22ThreadJoinException;

public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i=0; i<Integer.MAX_VALUE; i++) {
            String newString = new String("");
            System.out.println(Math.random());
        }
    }
}
