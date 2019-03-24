package multithread.chapter3.demo11WaitConditionChanged;

public class Substract {
    private String lock;

    public Substract(String lock)   {
        this.lock = lock;
    }

    public void substract() {
        try {
            synchronized (lock) {
                if (ValueObject.list.size() == 0)   {
                    System.out.println("wait begin ThreadName=" + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName=" + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("List size=" + ValueObject.list.size());
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }

}
