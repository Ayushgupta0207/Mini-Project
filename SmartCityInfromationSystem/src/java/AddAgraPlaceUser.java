import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddAgraPlaceUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("PlaceId");
String bankname = request.getParameter("Placename");
String location = request.getParameter("location");

AddAgraPlaceDetails e = new AddAgraPlaceDetails();

e.setPlaceId(IFSC);
e.setPlacename(bankname);
e.setlocation(location);


int status = SaveAgraPlaceDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowAgraPlaceDetailsUser");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addagraplaces.html").include(request, response);
}
      
out.close();  
}  
  }
