
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class SaveHyderabadUniversityDetails {
    public static int save(AddHyderabadUniversityDetails e){
        int status = 0;
        try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/miniproject", "root", "");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into hyderabaduniversitydetail values(?,?,?)");  
  
ps.setString(1,e.getUniversityId());  
ps.setString(2,e.getUniversityname());  
ps.setString(3,e.getlocation());  

status = ps.executeUpdate();
con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
      return status;
    }
}
