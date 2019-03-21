package multithread.chapter2.demo13SynchronizedThisConfirm;

/**
 * P80
 * 验证Synchronized(this)的this为当前对象
 *
 * Result:
 * synchronized threadName=A i=1
 * -------------- run otherMethod
 * synchronized threadName=A i=2
 * synchronized threadName=A i=3
 * synchronized threadName=A i=4
 * synchronized threadName=A i=5
 *
 * 更改otherMethod为Synchronized方法，发现和doLongTimeTask()共用一把锁(当前对象)
 *
 * Result:
 * synchronized threadName=A i=1
 * synchronized threadName=A i=2
 * synchronized threadName=A i=3
 * synchronized threadName=A i=4
 * synchronized threadName=A i=5
 * -------------- run otherMethod
 *
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread threadA = new MyThread(task);
        threadA.setName("A");
        MyThread threadB = new MyThread(task);
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
