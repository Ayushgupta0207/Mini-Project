import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddHyderabadHotelUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("HotelId");
String bankname = request.getParameter("Hotelname");
String location = request.getParameter("location");

AddHyderabadHotelDetails e = new AddHyderabadHotelDetails();

e.setHotelId(IFSC);
e.setHotelname(bankname);
e.setlocation(location);


int status = SaveHyderabadHotelDetails.save(e);
if(status > 0){

     response.sendRedirect("ShowHyderabadHotelDetailsUser");
    
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addhyderabadhotels.html").include(request, response);
}
      
out.close();  
}  
  }
