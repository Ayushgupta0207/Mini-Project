import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddMathuraUniversity extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("UniversityId");
String bankname = request.getParameter("Universityname");
String location = request.getParameter("location");

AddMathuraUniversityDetails e = new AddMathuraUniversityDetails();

e.setIFSC(IFSC);
e.setbankname(bankname);
e.setlocation(location);


int status = SaveMathuraUniversityDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowMathuraUniversityDetails");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addmathurauniversity.html").include(request, response);
}
      
out.close();  
}  
  }
