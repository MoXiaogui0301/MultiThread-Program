package multithread.chapter3.demo1ThreadCommunicationWithoutWaitNotify;

public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {

                if (list.size() == 5)   {
                    System.out.println("list size==5，线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
