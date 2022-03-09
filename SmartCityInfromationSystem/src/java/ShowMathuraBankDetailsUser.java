
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowMathuraBankDetailsUser extends HttpServlet {

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
        List<AddMathuraBankDetails> list = SelectMathuraBankDetails.getAllDetails();
        out.print("<head>");
      
        out.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'/>");
         out.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'/>");
            out.print("<link rel='stylesheet' type='text/css' href='style.css'>");
            out.print("</head>");
            out.print("<body>");
//            out.print(" <script src='script.js'></script>");
           out.print("<div class = 'header'>");
           
//           List<AddAgraBankDetails> list = SelectAgraBankDetails.getAllDetails();
           out.print(" <p class='para'>SMART CITY INFORMATION SYSTEM</p>");
//           out.print("<a href ='javascript:void(0);' onclick='myFunction()'><i class = 'fa fa-bars' ></i></a>");
           out.print("<ul id = 'menu'>");
          out.print("<li><a href='index.html'>Home</a></li>");
           out.print("<li class='about'><a href ='About-us.html'>About Us</a>");
          out.print(" </li>");
            out.print(" <li class = 'allcities'><a href='allcities_user.html'>All Cities</a>");
            out.print(" </li>");
             out.print("<li class ='login'><a href='Login.html'>Login</a></li>");
            out.print(" <li class = 'contactus'><a href='contactus.html'>Contact Us</a></li>");        
//             out.print(" <a href = 'javascript:void(0);' class = 'hide-btn' onclick='myFunction()'><i class = 'fa fa-close></i></a>");
             out.print("</ul>");
           
              out.print(" </div>");
             
          
            out.print("<h1 style='color:#3e2bb8;font-size:45px;margin:5px;'>Banks</h1>");
           for(AddMathuraBankDetails e : list ){
           
           out.print("<div class='banks'>");
           out.print("<p><i class='fa fa-star'></i>&nbsp"+e.getbankname()+" , " + e.getlocation() +"  , " +"Mathura,Uttar Prdesh 281406" +"</p>");
       
           out.print("</div>");
           
           
           
        }
           
           out.print("</body>");
            out.close();
    }

}
