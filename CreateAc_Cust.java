import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Service {
    
    public class GetConnection {
      private static Connection con = null;
      public static Connection getConnection(){
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb?autoReconnect=true&useSSL=false", "root", "root");
              String sql = "select * from customer";
              PreparedStatement ps = con.prepareStatement(sql);
              ResultSet rs = ps.executeQuery(); 
              while(rs.next()){
                  int id = rs.getInt(1);
                  String name = rs.getString(1);
                  System.out.println(id+" "+name);
              }
            }
          catch(Exception e){
              e.printStackTrace();

          }
          return con;
      
              try{
                  con.close();
              }
              catch(Exception e){
                  e.printStackTrace();
              }
    
    