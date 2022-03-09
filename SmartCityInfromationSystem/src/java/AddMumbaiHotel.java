import java.io.*;  
import java.sql.*;      
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddMumbaiHotel extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String HotelId = request.getParameter("HotelId");
String Hotelname = request.getParameter("Hotelname");
String location = request.getParameter("location");

AddMumbaiHotelDetails e = new AddMumbaiHotelDetails();

e.setHotelId(HotelId);
e.setHotelname(Hotelname);
e.setlocation(location);


int status = SaveMumbaiHotelDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowMumbaiHotelDetails");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addmumbaihotels.html").include(request, response);
}
      
out.close();  
}  
  }
