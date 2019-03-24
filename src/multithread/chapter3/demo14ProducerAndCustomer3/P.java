package multithread.chapter3.demo14ProducerAndCustomer3;

public class P {
    private MyStack myStack;

    public P(MyStack myStack)   {
        this.myStack = myStack;
    }

    public void pushService()   {
        myStack.push();
    }
}
