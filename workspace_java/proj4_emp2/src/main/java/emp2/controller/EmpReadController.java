package emp2.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import emp2.dto.EmpDTO;
import emp2.service.EmpService;

@WebServlet("/emp/read")
public class EmpReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/EmpReadController doGet 실행");
		 
	      int empno = Integer.parseInt( request.getParameter("empno")) ;
	      
	      EmpService empService = new EmpService();
	      EmpDTO empDTO = empService.get(empno);
	      
	      request.setAttribute("empDTO", empDTO);
	      
	      request.getRequestDispatcher("/WEB-INF/views/empRead.jsp").forward(request, response);
	}
	
	


}
