package multithread.chapter2.demo06DirtyRead;

/**
 * P63
 * 演示脏读：线程main读取线程Thread-0未提交的数据(实例变量)
 *
 * Result:
 * getValue method thread name = main username = B password = AA
 * setValue method thread name = Thread-0 username = B password = BB
 *
 * 解决办法，在getValue方法加synchronized关键字，通过对象锁序列化对象方法的访问
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA threadA = new ThreadA(publicVarRef);
            threadA.start();
            Thread.sleep(200);
            publicVarRef.getValue();
        }catch (Exception e)    {
            e.printStackTrace();
        }
    }
}
