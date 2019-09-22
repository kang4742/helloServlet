package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자가 보낸 폼데이터를 읽어들이기
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//process : access to database, perform business logic
		
		//build html code
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html>";
		htmlResponse += "<h2>your username is " + username + "<br>";
		htmlResponse += "<h2>your password is " + password + "<br>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		
	}

}
