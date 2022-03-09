
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectMumbaiHotelDetails {
    public static AddMumbaiHotelDetails getAllDetailsBycityname(String cityname){
        AddMumbaiHotelDetails e = new  AddMumbaiHotelDetails();
         try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from mumbaihoteldetails where HotelId=?");
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

    public static List<AddMumbaiHotelDetails> getAllDetails(){
       List<AddMumbaiHotelDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from mumbaihoteldetails");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
    AddMumbaiHotelDetails e = new AddMumbaiHotelDetails();
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
