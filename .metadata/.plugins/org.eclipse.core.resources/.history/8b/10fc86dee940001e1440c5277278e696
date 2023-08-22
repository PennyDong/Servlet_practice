package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pet")
public class Pet extends HttpServlet{
	
	@Override
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8"); //設定請求物件字元編碼
		response.setContentType("text/html; charset=UTF-8"); //設定內容類型
		
		PrintWriter out = response.getWriter(); //取得數出物件
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		
		out.printf("聯絡人:<a href='mailto:%s'>%s</a>%n",
				request.getParameter("email"), //取得請求參數值
				request.getParameter("user")
				);
		
		out.println("<br>喜愛的寵物類型");
		out.println("<ul>");
		
		List.of(request.getParameterValues("type")) //取得複選項請求參數值
			.forEach(type-> out.printf("<li>%s</li>%n",type)
					);
		out.print("</ul>");
		out.print("/body");
		out.print("/html");
	}
}
