import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddAgraHotelUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("HotelId");
String bankname = request.getParameter("Hotelname");
String location = request.getParameter("location");

AddAgraHotelDetails e = new AddAgraHotelDetails();

e.setHotelId(IFSC);
e.setHotelname(bankname);
e.setlocation(location);


int status = SaveAgraHotelDetails.save(e);
if(status > 0){

     response.sendRedirect("ShowAgraHotelDetailsUser");
    
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addagrahotels.html").include(request, response);
}
      
out.close();  
}  
  }
