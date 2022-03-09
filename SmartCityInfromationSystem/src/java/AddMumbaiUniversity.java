import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddMumbaiUniversity extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String univid = request.getParameter("UniversityId");
String name = request.getParameter("Universityname");
String location = request.getParameter("location");

AddMumbaiUniversityDetails e = new AddMumbaiUniversityDetails();

e.setUniversityId(univid);
e.setUniversityname(name);
e.setlocation(location);


int status = SaveMumbaiUniversityDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowMumbaiUniversityDetails");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addmumbaiuniversity.html").include(request, response);
}
      
out.close();  
}  
  }
