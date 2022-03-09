import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddMumbaiHotelUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("HotelId");
String bankname = request.getParameter("Hotelname");
String location = request.getParameter("location");

AddMumbaiHotelDetails e = new AddMumbaiHotelDetails();

e.setHotelId(IFSC);
e.setHotelname(bankname);
e.setlocation(location);


int status = SaveMumbaiHotelDetails.save(e);
if(status > 0){

     response.sendRedirect("ShowMumbaiHotelDetailsUser");
    
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addmumbaihotels.html").include(request, response);
}
      
out.close();  
}  
  }
