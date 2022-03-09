import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AddMathuraPlaceUser extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String IFSC = request.getParameter("PlaceId");
String bankname = request.getParameter("Placename");
String location = request.getParameter("location");

AddMathuraPlaceDetails e = new AddMathuraPlaceDetails();

e.setPlaceId(IFSC);
e.setPlacename(bankname);
e.setlocation(location);


int status = SaveMathuraPlaceDetails.save(e);
if(status > 0){
    response.sendRedirect("ShowMathuraPlaceDetailsUser");
}
else{
    out.print("Sorry ! Unable to Save Record");
    
    request.getRequestDispatcher("addmathuratouristplaces.html").include(request, response);
}
      
out.close();  
}  
  }
