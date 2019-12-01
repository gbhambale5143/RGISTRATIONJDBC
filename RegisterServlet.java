package in.cdac;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register-servlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
		//reading input from user	
			   String username =request.getParameter("username");
			   String email= request.getParameter("email");
			   String password =request.getParameter("password");
			   String mobile  = request.getParameter("mobile");  
			  
			   //Preparing instant of user
			   
			   UserPojo user = new UserPojo();
			   user.setUsername(username);
			   user.setPassword(password);
			   user.setEmail(email);
			   user.setMobile(mobile);
			   
			   //DB CALL
			   JdbcRegiterService.registerUser(user);
			   
			   
			   
			   response.sendRedirect("Login.jsp");
			

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
