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

@WebServlet("/emp/update")
public class EmpUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("/emp/update doGet 실행");
		
		int empno = Integer.parseInt( request.getParameter("empno") );
		
		EmpService empService = new EmpService();
		EmpDTO empDTO = empService.get(empno);
		
		request.setAttribute("update", empDTO);
		
		request.getRequestDispatcher("/WEB-INF/views/empUpdate.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("/emp/update doPost 실행");
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8;");
		
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String hiredate = request.getParameter("hiredate");
		String deptno = request.getParameter("deptno");
		System.out.println(empno);
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno( Integer.parseInt(empno) );
		empDTO.setEname(ename);
		empDTO.setJob(job);
		empDTO.setHireDate( Date.valueOf(hiredate) );
		empDTO.setDeptno( Integer.parseInt(deptno) );
		
		EmpService empService = new EmpService();
		int result = empService.update(empDTO);
		System.out.println("insert : " + result);	
		
		response.sendRedirect("/proj4_emp2/emp");
		
	}

}
