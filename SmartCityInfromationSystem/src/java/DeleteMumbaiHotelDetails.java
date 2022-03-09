
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteMumbaiHotelDetails extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String loc = request.getParameter("HotelId");
        DeleteMumbaiHotel.delete(loc);
        response.sendRedirect("ShowMumbaiHotelDetails");
        
        
        
    }

    

}
