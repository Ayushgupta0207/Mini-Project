import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddHyderabadUniversity extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String univid = request.getParameter("UniversityId");
String name = request.getParameter("Universityname");
String location = request.getParameter("location");

AddHyderabadUniversityDetails e = new AddHyderabadUniversityDetails();

e.setUniversityId(univid);
e.setUniversityname(name);
e.setlocation(location);


int status = SaveHyderabadUniversityDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowHyderabadUniversityDetails");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addhyderabaduniversity.html").include(request, response);
}
      
out.close();  
}  
  }
