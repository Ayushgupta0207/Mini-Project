
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectHyderabadPlaceDetails {
    public static List<AddHyderabadPlaceDetails> getAllDetails(){
       List<AddHyderabadPlaceDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from hyderabadplacedetail");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
    AddHyderabadPlaceDetails e = new AddHyderabadPlaceDetails();
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
