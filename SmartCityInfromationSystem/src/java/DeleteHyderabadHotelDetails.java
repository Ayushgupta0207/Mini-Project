
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteHyderabadHotelDetails extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String loc = request.getParameter("HotelId");
        DeleteHyderabadHotel.delete(loc);
        response.sendRedirect("ShowHyderabadHotelDetails");
        
        
        
    }

    

}
