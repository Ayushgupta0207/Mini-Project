
import java.sql.*;


public class DeleteMathuraUniversity {
    public static int delete(String UniversityId){
        int status =0;
        try{
            Connection con = GetConDao.getConnection();
            PreparedStatement ps  = con.prepareStatement("delete from mathurauniversitydetails where UniversityId=?");
            ps.setString(1,UniversityId);
            status = ps.executeUpdate();
            
            con.close();
               
        }catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }
}
