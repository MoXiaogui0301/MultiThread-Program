package multithread.chapter6.demo08EnumofLasySingleton1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum MyObject {
    connectionFactory;
    private Connection connection;

    private MyObject()  {
        try {
            System.out.println("调用了MyObject的构造");
            String url = "jdbc:mysql://localhost:3306:databaseName=test";
            String username = "sa";
            String password = "";
            String driverName = "...";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException|SQLException e)  {
            e.printStackTrace();
        }
    }

    public Connection getConnection()   {
        return connection;
    }
}
