
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectAgraPlaceDetails {
    public static List<AddAgraPlaceDetails> getAllDetails(){
       List<AddAgraPlaceDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from agraplaces");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
    AddAgraPlaceDetails e = new AddAgraPlaceDetails();
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
