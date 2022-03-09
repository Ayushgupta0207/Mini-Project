
import java.sql.*;


public class DeleteHyderabadPlace {
    public static int delete(String PlaceId){
        int status =0;
        try{
            Connection con = GetConDao.getConnection();
            PreparedStatement ps  = con.prepareStatement("delete from hyderabadplacedetail where PlaceId=?");
            ps.setString(1,PlaceId);
            status = ps.executeUpdate();
            
            con.close();
               
        }catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }
}