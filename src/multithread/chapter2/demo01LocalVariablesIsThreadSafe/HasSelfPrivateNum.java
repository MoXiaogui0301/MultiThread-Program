package multithread.chapter2.demo01LocalVariablesIsThreadSafe;

public class HasSelfPrivateNum {
    public void addI(String username)   {
        try {
            //num是局部变量，不存在线程安全问题
            int num = 0;
            if (username.equals("a"))   {
                num = 100 ;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
