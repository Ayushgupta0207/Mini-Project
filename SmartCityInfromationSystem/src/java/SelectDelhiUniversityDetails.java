
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectDelhiUniversityDetails {
   

    public static List<AddDelhiUniversityDetails> getAllDetails(){
       List<AddDelhiUniversityDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from delhiuniversitydetail");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
    AddDelhiUniversityDetails e = new AddDelhiUniversityDetails();
    e.setUniversityId(rs.getString(1));
   e.setUniversityname(rs.getString(2));
   e.setlocation(rs.getString(3));
  
    list.add(e);
}
con.close();

           }catch(Exception ex){
               out.print("Inavlid");
           }
    return list;
       
    }
    
}
