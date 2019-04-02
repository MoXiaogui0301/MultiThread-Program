package multithread.chapter3.demo30ThreadLocalVariableInitial;

/**
 * P195
 * 通过继承LocalThread类，重写initialValue方法，给LocalThread设置初始值
 * 本例中，父子线程各自拥有自己的值
 * 使用InheritableThreadLocal类可以在子线程取得父线程继承下来的值
 *
 * Result:
 * 在Main线程中取值=1553570280829
 * 在Main线程中取值=1553570280829
 * 在Main线程中取值=1553570280829
 * 在Main线程中取值=1553570280829
 * 在Main线程中取值=1553570280829
 * 在Main线程中取值=1553570280829
 * 在Main线程中取值=1553570280829
 * 在Main线程中取值=1553570280829
 * 在Main线程中取值=1553570280829
 * 在Main线程中取值=1553570280829
 * 在ThreadA线程中取值1553570286920
 * 在ThreadA线程中取值1553570286920
 * 在ThreadA线程中取值1553570286920
 * 在ThreadA线程中取值1553570286920
 * 在ThreadA线程中取值1553570286920
 * 在ThreadA线程中取值1553570286920
 * 在ThreadA线程中取值1553570286920
 * 在ThreadA线程中取值1553570286920
 * 在ThreadA线程中取值1553570286920
 * 在ThreadA线程中取值1553570286920
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i=0; i<10; i++)    {
                System.out.println("在Main线程中取值=" +  Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
