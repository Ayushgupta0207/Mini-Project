
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SelectDelhiBankDetails {
    public static List<AddDelhiBankDetails> getAllDetails(){
       List<AddDelhiBankDetails> list = new ArrayList<>();
           try{  
Connection con = GetConDao.getConnection();
PreparedStatement ps=con.prepareStatement("Select * from delhibankdetail");  
ResultSet rs = ps.executeQuery();
while(rs.next()){
    AddDelhiBankDetails e = new AddDelhiBankDetails();
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
