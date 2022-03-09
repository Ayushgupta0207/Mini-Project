import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddAgraUniversityUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("UniversityId");
String bankname = request.getParameter("Universityname");
String location = request.getParameter("location");

AddAgraUniversityDetails e = new AddAgraUniversityDetails();

e.setUniversityId(IFSC);
e.setUniversityname(bankname);
e.setlocation(location);


int status = SaveAgraUniversityDetails.save(e);
if(status > 0){

     response.sendRedirect("ShowAgraUniversityDetailsUser");
    
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addagrauniversity.html").include(request, response);
}
      
out.close();  
}  
  }
