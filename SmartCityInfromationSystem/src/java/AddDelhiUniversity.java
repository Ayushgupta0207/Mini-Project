import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddDelhiUniversity extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String univid = request.getParameter("UniversityId");
String name = request.getParameter("Universityname");
String location = request.getParameter("location");

AddDelhiUniversityDetails e = new AddDelhiUniversityDetails();

e.setUniversityId(univid);
e.setUniversityname(name);
e.setlocation(location);


int status = SaveDelhiUniversityDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowDelhiUniversityDetails");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("adddelhiuniversity.html").include(request, response);
}
      
out.close();  
}  
  }
