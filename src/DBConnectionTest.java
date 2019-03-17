import java.sql.*;
import java.util.*;

public class DBConnectionTest{
  public static void main(String[] args) {



     // System.out.println(new DBConnectionTest().getClass().getResource("").getPath());

    Connection con=null;
  try{
    con = DBConnection.getDBConnection();
    //Statement stmnt = con.createStatement();

    // System.out.println("Enter Table name");
    // Scanner sc = new Scanner(System.in);
    // String table = sc.next();
    // PreparedStatement ps = con.createStatement("select * from "+table);
    // ResultSet rs = stmnt.executeQuery("select * from "+table);
    // while(rs.next()){
    //   System.out.println(rs.getInt("CustomerID"));
    //   System.out.println(rs.getString("CustomerName"));
    //   System.out.println(rs.getString("Country"));
  //  }
  }catch(Exception e){
    e.printStackTrace();
  }

  }
}
