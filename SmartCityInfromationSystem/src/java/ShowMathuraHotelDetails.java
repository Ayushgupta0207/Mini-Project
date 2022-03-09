
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowMathuraHotelDetails extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
     
           List<AddMathuraHotelDetails> list = SelectMathuraHotelDetails.getAllDetails();
          out.print("<head>");
        out.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>");
        out.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'/>");
            out.print("<link rel='stylesheet' type='text/css' href='Admin1.css'>");
            out.print("</head>");
         
          
          out.println("<body>");
    out.print("<div class='container'>");
        out.print("<div class='header'>");
out.print("<h2>SMART CITY INFORMATION SYSTEM</h2>");
        out.print("</div>");
        out.print("<nav>");
            out.print("<ul id = 'menu'>");
                out.print("<li><a href='admin-home.html'>Home</a></li>");
                out.print("<li class='about'><a href = 'adminabout.html'>About Us</a>");
                out.print("</li>");
                out.print("<li class = 'Dashboard'><a href='allcities_admin.html'>All Cities</a>");
                out.print("</li>");
                out.print("<li class ='Administration'><a href='Admin-dashboard.html'>Administration</a></li>");
                out.print("<li class = 'Reports'><a href='cityreport.html'>Reports</a></li>");
                out.print("<li class = 'MyAccount'><a href='myaccount.html'>My Account</a></li>");
                out.print("<li class = 'logout'><a href='index.html'>Logout</a></li>");
               
           out.print("</ul>");   
       out.print("</nav>");
//               out.print("</div>");
//               
            out.print("<h1 style='color:#3e2bb8;font-size:45px;margin:5px;text-align:center;'>Hotels</h1>");
           for(AddMathuraHotelDetails e : list ){
           
           out.print("<div class='banks'>");
           out.print("<p><i class='fa fa-star'></i>&nbsp"+e.getHotelname()+" , " + e.getlocation() +" , " + "Mathura,Uttar Prdesh 281406" + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<a href='DeleteMathuraHotelDetails?HotelId="+e.getHotelId()+"'><i class='fa fa-trash' style='color:white;float:right;'></i></a>"+ "</p>");
       
         out.print("</div>");
           
           
           
        }
           
           out.print("</body>");
            out.close();
    }

}
