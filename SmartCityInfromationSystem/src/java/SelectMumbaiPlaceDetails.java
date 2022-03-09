
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectMumbaiPlaceDetails {
    public static List<AddMumbaiPlaceDetails> getAllDetails(){
       List<AddMumbaiPlaceDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from mumbaiplacedetails");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
    AddMumbaiPlaceDetails e = new AddMumbaiPlaceDetails();
    e.setPlaceId(rs.getString(1));
   e.setPlacename(rs.getString(2));
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
