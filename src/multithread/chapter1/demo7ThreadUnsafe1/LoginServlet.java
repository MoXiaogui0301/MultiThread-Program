package multithread.chapter1.demo7ThreadUnsafe1;

public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    public static synchronized void doPost(String username,String password){
        try {
            usernameRef = username;
            if (username.equals("A")){
                Thread.sleep(2000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " password=" + passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
