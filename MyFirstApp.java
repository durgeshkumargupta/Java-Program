import java.io.*;
import javax.servlet.*;
public class MyFirstApp implements Servlet
{
	public void init(ServletConfig con)
	{
		System.out.println("init Method");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter p=res.getWriter();
		p.println("Hello Servlet");
		System.out.println("Service method");
	}
	public void destroy()
	{
		System.out.println("Destory method");
	}
	public String getServletInfo()
	{
		return null;
	}
	public ServletConfig getServletConfig()
	{
		return null;
	}
}