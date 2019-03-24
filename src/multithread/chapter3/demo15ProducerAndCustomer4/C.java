package multithread.chapter3.demo15ProducerAndCustomer4;

public class C {
    private MyStack myStack;

    public C(MyStack myStack)   {
        this.myStack = myStack;
    }

    public void popService()    {
        System.out.println("pop=" + myStack.pop());
    }
}
