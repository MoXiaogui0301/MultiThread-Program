package multithread.chapter3.demo11WaitConditionChanged;

public class ThreadSubstract extends Thread {
    private Substract s;

    public ThreadSubstract(Substract s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.substract();
    }
}
