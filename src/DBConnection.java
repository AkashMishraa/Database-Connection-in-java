//import lib.dbConfig.*;

import java.util.*;
import java.io.*;
import java.sql.*;

public class DBConnection{

  private static Connection con;
  private static Statement stmnt;


  public static Connection getDBConnection()throws Exception{

    InputStream st = new FileInputStream("/home/akash/Documents/java/javaPractice/project_testing/lib/dbConfig.properties");

    Properties p = new Properties();
    p.load(st);
    System.out.println(System.currentTimeMillis());
    String driverClass = p.getProperty("dbDriverClass");
    String driverUrl = p.getProperty("dbDriverUrl");
    String user = p.getProperty("user");
    String pass = p.getProperty("pass");

    Class.forName(driverClass);
    System.out.println("Driver Loaded Successfully");
    con = DriverManager.getConnection(driverUrl, user, pass);
    System.out.println("Database Connection Establish Successfully");
    System.out.println(System.currentTimeMillis());



    st.close();
    return con;
  }
}
