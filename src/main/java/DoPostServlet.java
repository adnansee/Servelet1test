import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/doPost")
public class DoPostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//get the information that is mapped under "name"
        // this info is inside of the http request body it was posted via a form in post.html
        String name = req.getParameter("name");
        resp.getWriter().println(name);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>HelloWorldServletTRY</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>");
            out.println("Hello World I am servletNEZZZZZZZZZZ!");
            out.println("</h1>");
            out.println(name);
            out.println("</h1>");
            /*Footer begin*/
            out.println("<footer>");
            out.println("<p>");
            out.println("-----------------");
            out.println("</p>");
            out.println("   <p><a href=");

            out.println("<p>");
            out.println("-----------------");
            out.println("</p>");
            out.println("</footer>");
            /*Footer end*/
            out.println("</body>");
            out.println("<html>");

        }
    }


}



