import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddDelhiBank extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("IFSC");
String bankname = request.getParameter("bankname");
String location = request.getParameter("location");

AddDelhiBankDetails e = new AddDelhiBankDetails();

e.setIFSC(IFSC);
e.setbankname(bankname);
e.setlocation(location);


int status = SaveDelhiBankDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowDelhiBankDetails");
   
    
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("adddelhibank.html").include(request, response);
}
      
out.close();  
}  
  }
