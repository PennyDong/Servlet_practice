package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Helloalert")
public class Helloalert extends HttpServlet {

	@Override
	protected void doGet(
			HttpServletRequest request,HttpServletResponse response) 
	throws ServletException,IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		
		String name = Optional.ofNullable(request.getParameter("name"))
				.map(value->value.replaceAll("<","&lt"))//map兩行表示 取代為HTML實體名稱
				.map(value->value.replaceAll(">","&gt;"))
				.orElse("Guest"); //沒有提供請求參數時的預設值
		
		
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Hello</title>");
		out.print("</head>");
		out.print("<body>");
		out.printf("<h1>Hello! %s!</h1>", name);
		out.print("</body>");
		out.print("</html>");
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		

	}

}
