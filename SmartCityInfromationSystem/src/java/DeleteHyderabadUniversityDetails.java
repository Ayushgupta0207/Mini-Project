
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteHyderabadUniversityDetails extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String loc = request.getParameter("UniversityId");
        DeleteHyderabadUniversity.delete(loc);
        response.sendRedirect("ShowHyderabadUniversityDetails");
        
        
        
    }

    

}
