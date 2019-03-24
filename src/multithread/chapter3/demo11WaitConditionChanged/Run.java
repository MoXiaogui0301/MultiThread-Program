package multithread.chapter3.demo11WaitConditionChanged;

/**
 * P155
 * 演示唤醒条件变化时引起的异常
 * 本例中有两个线程(subtract1和subtract2)等待addThread对List加一后删除List增加的元素
 * addThread执行后notifyAll，subtract1和subtract2依次对List执行remove操作
 * 由于List中仅有一个元素，导致集合下标越界
 *
 * Result:
 * wait begin ThreadName=SubStractThread-1
 * wait begin ThreadName=SubStractThread-2
 * wait end ThreadName=SubStractThread-1
 * List size=0
 * wait end ThreadName=SubStractThread-2
 * Exception in thread "SubStractThread-2" java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
 * 	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
 * 	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
 * 	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
 * 	at java.base/java.util.Objects.checkIndex(Objects.java:372)
 * 	at java.base/java.util.ArrayList.remove(ArrayList.java:535)
 * 	at multithread.chapter3.demo11WaitConditionChanged.Substract.substract(Substract.java:18)
 * 	at multithread.chapter3.demo11WaitConditionChanged.ThreadSubstract.run(ThreadSubstract.java:12)
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Substract substract = new Substract(lock);
        ThreadSubstract substract1 = new ThreadSubstract(substract);
        substract1.setName("SubStractThread-1");
        substract1.start();
        ThreadSubstract substract2 = new ThreadSubstract(substract);
        substract2.setName("SubStractThread-2");
        substract2.start();
        Thread.sleep(1000);
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.start();
    }
}
