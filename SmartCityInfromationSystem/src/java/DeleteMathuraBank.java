
import java.sql.*;


public class DeleteMathuraBank {
    public static int delete(String IFSC){
        int status =0;
        try{
            Connection con = GetConDao.getConnection();
            PreparedStatement ps  = con.prepareStatement("delete from mathurabankdetails where IFSC=?");
            ps.setString(1,IFSC);
            status = ps.executeUpdate();
            
            con.close();
               
        }catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }
}
