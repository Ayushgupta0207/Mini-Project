import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddAgraUniversity extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String univid = request.getParameter("UniversityId");
String name = request.getParameter("Universityname");
String location = request.getParameter("location");

AddAgraUniversityDetails e = new AddAgraUniversityDetails();

e.setUniversityId(univid);
e.setUniversityname(name);
e.setlocation(location);


int status = SaveAgraUniversityDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowAgraUniversityDetails");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addagrauniversity.html").include(request, response);
}
      
out.close();  
}  
  }
