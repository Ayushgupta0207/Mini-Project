import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddDelhiUniversityUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("UniversityId");
String bankname = request.getParameter("Universityname");
String location = request.getParameter("location");

AddDelhiUniversityDetails e = new AddDelhiUniversityDetails();

e.setUniversityId(IFSC);
e.setUniversityname(bankname);
e.setlocation(location);


int status = SaveDelhiUniversityDetails.save(e);
if(status > 0){

     response.sendRedirect("ShowDelhiUniversityDetailsUser");
    
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("adddelhiuniversity.html").include(request, response);
}
      
out.close();  
}  
  }
