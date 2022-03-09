import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddDelhiPlaceUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("PlaceId");
String bankname = request.getParameter("Placename");
String location = request.getParameter("location");

AddDelhiPlaceDetails e = new AddDelhiPlaceDetails();

e.setPlaceId(IFSC);
e.setPlacename(bankname);
e.setlocation(location);


int status = SaveDelhiPlaceDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowDelhiPlaceDetailsUser");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("adddelhitouristplaces.html").include(request, response);
}
      
out.close();  
}  
  }
