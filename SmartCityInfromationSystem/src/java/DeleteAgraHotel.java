
import java.sql.*;


public class DeleteAgraHotel {
    public static int delete(String HotelId){
        int status =0;
        try{
            Connection con = GetConDao.getConnection();
            PreparedStatement ps  = con.prepareStatement("delete from agrahotels where HotelId=?");
            ps.setString(1,HotelId);
            status = ps.executeUpdate();
            
            con.close();
               
        }catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }
}
