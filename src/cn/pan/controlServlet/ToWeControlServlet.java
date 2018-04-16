package cn.pan.controlServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ToWeControlServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet方法");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		String uName=(String) session.getAttribute("uName");
		String pWd=(String) session.getAttribute("pWd");
		System.out.println(uName+"  123"+pWd);
		if(uName!=null&&pWd!=null){
			//request.getRequestDispatcher("view/We.jsp").forward(request, response);
			response.sendRedirect(request.getContextPath()+"/view/We.jsp");
		}
		else
			response.sendRedirect(request.getContextPath()+"/view/Login.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		System.out.println("post方法");
		HttpSession session=request.getSession();		
		System.out.println(session.getAttribute("uName"));
		String uName=(String) session.getAttribute("uName");
		String pWd=(String) session.getAttribute("pWd");
		if(uName!=null&&pWd!=null){
			request.getRequestDispatcher("view/We.jsp").forward(request, response);
		}
		else
			response.sendRedirect(request.getContextPath()+"/view/Login.jsp");
	}
}
