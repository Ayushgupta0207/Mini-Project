
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectMathuraHotelDetails {
    

    public static List<AddMathuraHotelDetails> getAllDetails(){
       List<AddMathuraHotelDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from mathurahoteldetails");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
    AddMathuraHotelDetails e = new AddMathuraHotelDetails();
    e.setHotelId(rs.getString(1));
   e.setHotelname(rs.getString(2));
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
