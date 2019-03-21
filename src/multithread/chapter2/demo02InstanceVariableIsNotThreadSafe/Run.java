package multithread.chapter2.demo02InstanceVariableIsNotThreadSafe;

/**
 * P55(有修改)
 * 演示num为numRef对象的实例变量时，产生的线程不安全问题
 * 简单的解决方法是对改变实例变量的方法用synchronized关键字修饰
 *
 * Result:
 * a set over!
 * b set over!
 * b num=200
 * a num=200
 *
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        MyThread thread1 = new MyThread(numRef,"a");
        MyThread thread2 = new MyThread(numRef,"b");
        thread1.start();
        thread2.start();
    }
}
