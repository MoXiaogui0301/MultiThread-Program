package multithread.chapter2.demo02InstanceVariableIsNotThreadSafe;

public class HasSelfPrivateNum {
    //num是实例变量，存在线程安全问题
    int num = 0;
    public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
