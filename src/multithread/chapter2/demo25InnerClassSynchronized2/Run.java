package multithread.chapter2.demo25InnerClassSynchronized2;

/**
 * P113
 * 演示使用相同锁的内部类方法依次执行
 *
 * 本例中T1和T3分别运行InnerClass1类的method1方法和InnerClass2类的method1方法
 * 使用相同的锁(innerClass2的类锁，注意InnerClass2的method1为静态方法)
 * T2运行InnerClass1类method2方法，普通同步方法，使用InnerClass1的对象锁，与T1和T2不冲突
 * 结果T1和T2同时运行，T1执行完毕后释放InnerClass2的类锁，T3得到InnerClass2的类锁后再执行
 *
 * Result:
 * T1 进入InnerClass1类的method1方法
 * T2 进入InnerClass1类的method2方法
 * j=0
 * i=0
 * i=1
 * j=1
 * i=2
 * j=2
 * j=3
 * i=3
 * i=4
 * j=4
 * T1 离开InnerClass1类的method1方法
 * T2 离开InnerClass1类的method2方法
 * T3 进入InnerClass2类的method1方法
 * k=0
 * k=1
 * k=2
 * k=3
 * k=4
 * T3 离开InnerClass2类的method1方法
 *
 */
public class Run {
    public static void main(String[] args) {

        final OutClass.InnerClass1 in1 = new OutClass.InnerClass1();
        final OutClass.InnerClass2 in2 = new OutClass.InnerClass2();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);
            }
        },"T1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();
            }
        },"T2");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();
            }
        },"T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
