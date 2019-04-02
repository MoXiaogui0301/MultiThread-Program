package multithread.chapter3.demo28ThreadLocalVariableIsIsolation1;

/**
 * P192
 * 验证线程变量的隔离性
 * A、B、Main三个线程同时向ThreadLocal存入值，并分别取出属于自己线程的值
 *
 * Result:
 * ThreadA get Value=ThreadA11553568544513
 * ThreadB get Value=ThreadB11553568544616
 * Main get Value=Main11553568544716
 * ThreadA get Value=ThreadA21553568544776
 * ThreadB get Value=ThreadB21553568544820
 * Main get Value=Main21553568544917
 * ThreadA get Value=ThreadA31553568544976
 * ThreadB get Value=ThreadB31553568545024
 * Main get Value=Main31553568545120
 * ThreadA get Value=ThreadA41553568545178
 * ThreadB get Value=ThreadB41553568545224
 * Main get Value=Main41553568545324
 * ThreadA get Value=ThreadA51553568545379
 * ThreadB get Value=ThreadB51553568545426
 * Main get Value=Main51553568545525
 * ThreadA get Value=ThreadA61553568545581
 * ThreadB get Value=ThreadB61553568545629
 * Main get Value=Main61553568545727
 * ...
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            Thread.sleep(100);
            b.start();
            Thread.sleep(100);
            for (int i=0; i<100; i++)   {
                Tools.t1.set("Main" + (i+1) + System.currentTimeMillis());
                System.out.println("Main get Value=" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
