package cn.pan.controlServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import cn.pan.model.Service.LoginMoelService;
import cn.pan.model.entity.Admin;

public class LoginControlServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.sendRedirect(request.getContextPath()+"/view/Login.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		boolean check=false;
		Admin admin=new Admin();
		admin.setuName(request.getParameter("uName"));
		admin.setpWd(request.getParameter("pWd"));
		System.out.println("�û�:"+admin.getuName()+"\n����:"+admin.getpWd());
		LoginMoelService loginMoelService=new LoginMoelService();
		if(admin.getuName()!=null&&admin.getpWd()!=null)
		{
			try {
				check=loginMoelService.Login(admin);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(check)
			{
				//ת����ҳ��
				HttpSession session=request.getSession();
				session.setAttribute("uName", admin.getuName());
				session.setAttribute("pWd", admin.getpWd());
				//request.getRequestDispatcher("ToWeControlServlet").forward(request, response);
				response.sendRedirect("ToWeControlServlet");
			}
			else{
				response.sendRedirect(request.getContextPath()+"/view/Login.jsp");//�û������������
			}
		}
		else{
			response.sendRedirect(request.getContextPath()+"/view/Login.jsp");//�û��������벻��Ϊ��
		}
	}
}
