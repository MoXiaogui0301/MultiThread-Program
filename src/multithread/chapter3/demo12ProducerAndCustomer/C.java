package multithread.chapter3.demo12ProducerAndCustomer;

public class C {
    private String lock;

    public C(String lock)   {
        this.lock = lock;
    }

    public void getValue()  {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals(""))
                    lock.wait();
                System.out.println("消费者get的值是" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }

}
