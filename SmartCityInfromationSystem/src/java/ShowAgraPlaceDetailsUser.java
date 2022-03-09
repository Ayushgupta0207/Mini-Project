
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowAgraPlaceDetailsUser extends HttpServlet {

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
     
           List<AddAgraPlaceDetails> list = SelectAgraPlaceDetails.getAllDetails();
          out.print("<head>");
        out.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>");
        out.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'/>");
            out.print("<link rel='stylesheet' type='text/css' href='style.css'>");
            out.print("</head>");
         
          
          out.println("<body>");
    //out.print("<div class='container'>");
        out.print("<div class='header'>");
out.print("<h2>SMART CITY INFORMATION SYSTEM</h2>");
        //out.print("</div>");
        out.print("<nav>");
            out.print("<ul id = 'menu'>");
                out.print("<li><a href='index.html'>Home</a></li>");
           out.print("<li class='about'><a href ='About-us.html'>About Us</a>");
          out.print(" </li>");
            out.print(" <li class = 'allcities'><a href='allcities_user.html'>All Cities</a>");
            out.print(" </li>");
             out.print("<li class ='login'><a href='Login.html'>Login</a></li>");
            out.print(" <li class = 'contactus'><a href='contactus.html'>Contact Us</a></li>");
               
           out.print("</ul>");   
       out.print("</nav>");
               out.print("</div>");
//               
            out.print("<h1 style='color:#3e2bb8;font-size:45px;margin:5px;text-align:center;'>Places</h1>");
           for(AddAgraPlaceDetails e : list ){
           
           out.print("<div class='banks'>");
           out.print("<p><i class='fa fa-star'></i>&nbsp"+e.getPlacename()+" , " + e.getlocation() +" , " + "Agra,Uttar Prdesh 282006" +  "</p>");
       
         out.print("</div>");
           
           
           
        }
           
           out.print("</body>");
            out.close();
    }

}
