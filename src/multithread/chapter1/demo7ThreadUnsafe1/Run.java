package multithread.chapter1.demo7ThreadUnsafe1;

/**
 * 模拟登陆的线程非安全场景
 * 使用synchronize关键字可解决
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        BLogin b = new BLogin();
        a.start();
        b.start();
    }
}
