import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
class addition extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
int x=Integer.parseInt(req.getParameter("ti"));
int y=Integer.parseInt(req.getParameter("t1"));
pw.println("addition is "+(x+y));
}
}