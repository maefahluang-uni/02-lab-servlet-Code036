package th.mfu.web.calulate;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//TODO: add @WebServlet annotation with urlPatterns = "/sum"
@WebServlet(urlPatterns = "/sum")
public class CalculatorServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        //TODO: retreive the parameter num1 and num2 from the request 
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        response.setContentType("text/html");
       
        //TODO: convert the parameter values from String to int
         int n1 = Integer.parseInt(num1);
         int n2= Integer.parseInt(num2);
         int result = n1 + n2;
       
        
    //TODO: print out result as <h2>Result is 10</h2>
    PrintWriter out =  response.getWriter();
       out.print("<h2>Result is "+result+ "</h2>");
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        //TODO: this method should work the same way as doGet()
        doGet(request, response);
       
    }
}
