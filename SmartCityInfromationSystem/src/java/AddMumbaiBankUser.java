import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddMumbaiBankUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("IFSC");
String bankname = request.getParameter("bankname");
String location = request.getParameter("location");

AddMumbaiBankDetails e = new AddMumbaiBankDetails();

e.setIFSC(IFSC);
e.setbankname(bankname);
e.setlocation(location);


int status = SaveMumbaiBankDetails.save(e);
if(status > 0){

     response.sendRedirect("ShowMumbaiBankDetailsUser");
    
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addmumbaibank.html").include(request, response);
}
      
out.close();  
}  
  }
