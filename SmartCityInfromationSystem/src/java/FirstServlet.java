import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class FirstServlet extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String username=request.getParameter("email");  
    String password=request.getParameter("password");  
          
    if(Login.validate(username, password)){  
        RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
        rd.forward(request,response);  
    }  
    else{  
//        out.print("Sorry username or password error");  
        RequestDispatcher rd=request.getRequestDispatcher("wrongpassword.html");  
        rd.include(request,response);  
    }  
          
    out.close();  
   
 }  
 
} 

