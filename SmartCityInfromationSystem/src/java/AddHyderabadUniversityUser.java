import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddHyderabadUniversityUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("UniversityId");
String bankname = request.getParameter("Universityname");
String location = request.getParameter("location");

AddHyderabadUniversityDetails e = new AddHyderabadUniversityDetails();

e.setUniversityId(IFSC);
e.setUniversityname(bankname);
e.setlocation(location);


int status = SaveHyderabadUniversityDetails.save(e);
if(status > 0){

     response.sendRedirect("ShowHyderabadUniversityDetailsUser");
    
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addhyderabaduniversity.html").include(request, response);
}
      
out.close();  
}  
  }
