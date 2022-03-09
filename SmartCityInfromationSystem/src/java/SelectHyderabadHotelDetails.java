
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectHyderabadHotelDetails {
    public static AddHyderabadHotelDetails getAllDetailsBycityname(String cityname){
        AddHyderabadHotelDetails e = new  AddHyderabadHotelDetails();
         try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from hyderabadhoteldetail where HotelId=?");
ps.setString(1, cityname);
ResultSet rs = ps.executeQuery();
if(rs.next()){
    e.setHotelId(rs.getString(1));
   e.setHotelname(rs.getString(2));
   e.setlocation(rs.getString(3));
  
    
}
con.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
         return e;
    }

    public static List<AddHyderabadHotelDetails> getAllDetails(){
       List<AddHyderabadHotelDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from hyderabadhoteldetail");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
    AddHyderabadHotelDetails e = new AddHyderabadHotelDetails();
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
