import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddHyderabadPlace extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String placeid = request.getParameter("PlaceId");
String placename = request.getParameter("Placename");
String location = request.getParameter("location");

AddHyderabadPlaceDetails e = new AddHyderabadPlaceDetails();

e.setPlaceId(placeid);
e.setPlacename(placename);
e.setlocation(location);


int status = SaveHyderabadPlaceDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowHyderabadPlaceDetails");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addhyderabadtouristplaces.html").include(request, response);
}
      
out.close();  
}  
  }
