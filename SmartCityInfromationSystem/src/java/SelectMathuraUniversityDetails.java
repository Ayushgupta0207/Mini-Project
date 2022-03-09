
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectMathuraUniversityDetails {
   
    public static List<AddMathuraUniversityDetails> getAllDetails(){
       List<AddMathuraUniversityDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from mathurauniversitydetails");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
   AddMathuraUniversityDetails e = new AddMathuraUniversityDetails();
    e.setIFSC(rs.getString(1));
   e.setbankname(rs.getString(2));
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
