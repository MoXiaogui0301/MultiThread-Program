package multithread.chapter3.demo16ProducerAndCustomer5;

public class P {
    private MyStack myStack;

    public P(MyStack myStack)   {
        this.myStack = myStack;
    }

    public void pushService()   {
        myStack.push();
    }
}
