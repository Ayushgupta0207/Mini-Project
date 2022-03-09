import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddMathuraHotelUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("HotelId");
String Hotelname = request.getParameter("Hotelname");
String location = request.getParameter("location");

AddMathuraHotelDetails e = new AddMathuraHotelDetails();

e.setHotelId(IFSC);
e.setHotelname(Hotelname);
e.setlocation(location);


int status = SaveMathuraHotelDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowMathuraHotelDetailsUser");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addmathurahotel.html").include(request, response);
}
      
out.close();  
}  
  }
