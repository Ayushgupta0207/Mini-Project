
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class SaveMumbaiHotelDetails {
    public static int save(AddMumbaiHotelDetails e){
        int status = 0;
        try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/miniproject", "root", "");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into mumbaihoteldetails values(?,?,?)");  
  
ps.setString(1,e.getHotelId());  
ps.setString(2,e.getHotelname());  
ps.setString(3,e.getlocation());  

status = ps.executeUpdate();
con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
      return status;
    }
}
