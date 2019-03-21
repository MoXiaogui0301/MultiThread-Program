package multithread.chapter2.demo28ChangeLock2;

public class Service {
    public void serviceMethodA(Userinfo userinfo)   {
        synchronized (userinfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                //改变锁对象的属性，依然是同一把锁
                userinfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time=" + System.currentTimeMillis());
            } catch (InterruptedException e)    {
                e.printStackTrace();
            }
        }
    }
}

class Userinfo  {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}