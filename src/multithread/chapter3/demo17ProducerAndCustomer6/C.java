package multithread.chapter3.demo17ProducerAndCustomer6;

public class C {
    private MyStack myStack;

    public C(MyStack myStack)   {
        this.myStack = myStack;
    }

    public void popService()    {
//        System.out.println("pop=" + myStack.pop());
        myStack.pop();
    }

}
