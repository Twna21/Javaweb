package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!-- link css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/login2.css\">\n");
      out.write("\n");
      out.write("        <!-- link icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\"\n");
      out.write("              integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\"\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("        <title>Form Animate</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"box login\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3 class=\"title\">\n");
      out.write("                        Login\n");
      out.write("                    </h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <form action=\"login\" method=\"POST\" id=\"form\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form_input\">\n");
      out.write("                            <input type=\"text\" name=\"username\" id=\"name\" required>\n");
      out.write("                            <label for=\"name\">Username</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form_input\">\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\" required>\n");
      out.write("                            <label for=\"password\">Password</label>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn submit\">\n");
      out.write("                            Login\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <a href=\"foget.jsp\" style=\"color: white; text-decoration: none;\">Forgot Password?</a>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"box navigation\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"nav navigation_signIn\">\n");
      out.write("                        <p>\n");
      out.write("                            If you don't have an account yet, join us and start your journey\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <button class=\"btn layer log\">\n");
      out.write("\n");
      out.write("                            Register\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"nav navigation_signUp\">\n");
      out.write("                        <p>\n");
      out.write("                            If you already have an account login here and have fun\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <div class=\"Login\">\n");
      out.write("                            <button class=\"btn layer out\">\n");
      out.write("                                Login\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <button class=\"btn layer out\">\n");
      out.write("                                <a href=\"https://accounts.google.com/o/oauth2/auth?scope=email%20profile%20openid&redirect_uri=http://localhost:8080/MilkTeaProjectPRJ301/LoginGoogleController&response_type=code\n");
      out.write("                                   &client_id=552963219492-6a880it69r6hmnahrj8c69f328id25m6.apps.googleusercontent.com&approval_prompt=force\"\n");
      out.write("                                   class=\"btn btn-danger text-white\"><i class=\"bi bi-google\"></i> Google</a>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- link javascript -->\n");
      out.write("                <script src=\"./js/loginJS_1.js\"></script>\n");
      out.write("                </body>\n");
      out.write("\n");
      out.write("                </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
