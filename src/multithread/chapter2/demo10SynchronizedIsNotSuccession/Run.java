package multithread.chapter2.demo10SynchronizedIsNotSuccession;

/**
 * P69
 * 演示同步不具有继承性
 * 两个线程调用子类普通方法和父类同步方法
 * 子类方法异步调用(同时begin，同时end)，父类方法同步调用(依次逐个begin、end)
 *
 * Result:
 * int sub 下一步 sleep begin threadName=A time=1552991289605
 * int sub 下一步 sleep begin threadName=B time=1552991289605
 * int sub 下一步 sleep end threadName=A time=1552991294683
 * int sub 下一步 sleep end threadName=B time=1552991294683
 * int main 下一步 sleep begin threadName=A time=1552991294684
 * int main 下一步 sleep end threadName=A time1552991299687
 * int main 下一步 sleep begin threadName=B time=1552991299688
 * int main 下一步 sleep end threadName=B time1552991304690
 *
 */
public class Run {
    public static void main(String[] args) {
        Sub subRef = new Sub();
        MyThread threadA = new MyThread(subRef);
        MyThread threadB = new MyThread(subRef);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
