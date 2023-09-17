/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-09-17 16:00:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta name=\"author\" content=\"\" />\n");
      out.write("<title>Cozentus</title>\n");
      out.write("<!-- Favicon-->\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("<!-- Font Awesome icons (free version)-->\n");
      out.write("<script src=\"https://use.fontawesome.com/releases/v5.15.4/js/all.js\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<!-- Google fonts-->\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\"\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\"\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("<link href=\"css/index-styles.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("<body id=\"page-top\">\n");
      out.write("	<!-- Navigation-->\n");
      out.write("	<nav\n");
      out.write("		class=\"navbar navbar-expand-lg bg-secondary text-uppercase fixed-top\"\n");
      out.write("		id=\"mainNav\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<a class=\"navbar-brand\" href=\"#page-top\">RPS DEVELOPER</a>\n");
      out.write("			<button\n");
      out.write("				class=\"navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded\"\n");
      out.write("				type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("				data-bs-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\"\n");
      out.write("				aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("				Menu <i class=\"fas fa-bars\"></i>\n");
      out.write("			</button>\n");
      out.write("			\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("				<ul class=\"navbar-nav ms-auto\">\n");
      out.write("					<li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("						class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"login.jsp\">Login</a></li>\n");
      out.write("					<li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("						class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"registration.jsp\">Registration</a></li>\n");
      out.write("						\n");
      out.write("					\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</nav>\n");
      out.write("	<!-- Masthead-->\n");
      out.write("	<header class=\"masthead bg-primary text-white text-center\">\n");
      out.write("		<div class=\"container d-flex align-items-center flex-column\">\n");
      out.write("			<!-- Masthead Avatar Image-->\n");
      out.write("			<img class=\"masthead-avatar mb-5\" src=\"assets/img/portfolio/avt.svg\"\n");
      out.write("				alt=\"...\" />\n");
      out.write("			<!-- Masthead Heading-->\n");
      out.write("			<h1 class=\"masthead-heading text-uppercase mb-0\">Welcome To  cozentus</h1>\n");
      out.write("			<!-- Icon Divider-->\n");
      out.write("			<div class=\"divider-custom divider-light\">\n");
      out.write("				<div class=\"divider-custom-line\"></div>\n");
      out.write("				<div class=\"divider-custom-icon\">\n");
      out.write("					<i class=\"fas fa-star\"></i>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"divider-custom-line\"></div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</header>\n");
      out.write("	\n");
      out.write("	</section>\n");
      out.write("	\n");
      out.write("	<div class=\"row\">\n");
      out.write("		<!-- <div class=\"alert alert-success\" *ngIf='message'>{{message}}</div> -->\n");
      out.write("\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<h3 class=\"text-center\">List of Users</h3>\n");
      out.write("			<hr>\n");
      out.write("			<div class=\"container text-left\">\n");
      out.write("\n");
      out.write("				<a href=\"");
      out.print(request.getContextPath());
      out.write("/new\" class=\"btn btn-success\">Add\n");
      out.write("					User</a>\n");
      out.write("			</div>\n");
      out.write("			<br>\n");
      out.write("			<table class=\"table table-bordered\">\n");
      out.write("				<thead>\n");
      out.write("					<tr>\n");
      out.write("						<th>ID</th>\n");
      out.write("						<th>Name</th>\n");
      out.write("						<th>Email</th>\n");
      out.write("						<th>Country</th>\n");
      out.write("						<th>Actions</th>\n");
      out.write("					</tr>\n");
      out.write("				</thead>\n");
      out.write("				<tbody>\n");
      out.write("					<!--   for (Todo todo: todos) {  -->\n");
      out.write("					<c:forEach var=\"user\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("						<tr>\n");
      out.write("							<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("							<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("							<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("							<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.country}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("							\n");
      out.write("					</c:forEach>\n");
      out.write("					<!-- } -->\n");
      out.write("				</tbody>\n");
      out.write("\n");
      out.write("			</table>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("			<!-- Contact Section Form-->\n");
      out.write("			<div class=\"row justify-content-center\">\n");
      out.write("				<div class=\"col-lg-8 col-xl-7\">\n");
      out.write("					<form id=\"contactForm\" data-sb-form-api-token=\"API_TOKEN\">\n");
      out.write("						<!-- Name input-->\n");
      out.write("						<div class=\"form-floating mb-3\">\n");
      out.write("							<input class=\"form-control\" id=\"name\" type=\"text\"\n");
      out.write("								placeholder=\"Enter your name...\" data-sb-validations=\"required\" />\n");
      out.write("							<label for=\"name\">Full name</label>\n");
      out.write("							<div class=\"invalid-feedback\" data-sb-feedback=\"name:required\">A\n");
      out.write("								name is required.</div>\n");
      out.write("						</div>\n");
      out.write("						<!-- Email address input-->\n");
      out.write("						<div class=\"form-floating mb-3\">\n");
      out.write("							<input class=\"form-control\" id=\"email\" type=\"email\"\n");
      out.write("								placeholder=\"name@example.com\"\n");
      out.write("								data-sb-validations=\"required,email\" /> <label for=\"email\">Email\n");
      out.write("								address</label>\n");
      out.write("							<div class=\"invalid-feedback\" data-sb-feedback=\"email:required\">An\n");
      out.write("								email is required.</div>\n");
      out.write("							<div class=\"invalid-feedback\" data-sb-feedback=\"email:email\">Email\n");
      out.write("								is not valid.</div>\n");
      out.write("						</div>\n");
      out.write("						<!-- Phone number input-->\n");
      out.write("						<div class=\"form-floating mb-3\">\n");
      out.write("							<input class=\"form-control\" id=\"phone\" type=\"tel\"\n");
      out.write("								placeholder=\"(123) 456-7890\" data-sb-validations=\"required\" />\n");
      out.write("							<label for=\"phone\">Phone number</label>\n");
      out.write("							<div class=\"invalid-feedback\" data-sb-feedback=\"phone:required\">A\n");
      out.write("								phone number is required.</div>\n");
      out.write("						</div>\n");
      out.write("						<!-- Message input-->\n");
      out.write("						<div class=\"form-floating mb-3\">\n");
      out.write("							<textarea class=\"form-control\" id=\"message\" type=\"text\"\n");
      out.write("								placeholder=\"Enter your message here...\" style=\"height: 10rem\"\n");
      out.write("								data-sb-validations=\"required\"></textarea>\n");
      out.write("							<label for=\"message\">Message</label>\n");
      out.write("							<div class=\"invalid-feedback\" data-sb-feedback=\"message:required\">A\n");
      out.write("								message is required.</div>\n");
      out.write("						</div>\n");
      out.write("						<!-- Submit success message-->\n");
      out.write("						<!---->\n");
      out.write("						<!-- This is what your users will see when the form-->\n");
      out.write("						<!-- has successfully submitted-->\n");
      out.write("						<div class=\"d-none\" id=\"submitSuccessMessage\">\n");
      out.write("							<div class=\"text-center mb-3\">\n");
      out.write("								<div class=\"fw-bolder\">Form submission successful!</div>\n");
      out.write("								To activate this form, sign up at <br /> \n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						<!-- Submit error message-->\n");
      out.write("						<!---->\n");
      out.write("						<!-- This is what your users will see when there is-->\n");
      out.write("						<!-- an error submitting the form-->\n");
      out.write("						<div class=\"d-none\" id=\"submitErrorMessage\">\n");
      out.write("							<div class=\"text-center text-danger mb-3\">Error sending\n");
      out.write("								message!</div>\n");
      out.write("						</div>\n");
      out.write("						<!-- Submit Button-->\n");
      out.write("						<button class=\"btn btn-primary btn-xl disabled\" id=\"submitButton\"\n");
      out.write("							type=\"submit\">Send</button>\n");
      out.write("					</form>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</section>\n");
      out.write("	<!-- Footer-->\n");
      out.write("	<footer class=\"footer text-center\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<!-- Footer Location-->\n");
      out.write("				<div class=\"col-lg-4 mb-5 mb-lg-0\">\n");
      out.write("					<h4 class=\"text-uppercase mb-4\">Location</h4>\n");
      out.write("					<p class=\"lead mb-0\">\n");
      out.write("						infocity bbsr <br /> cozentus\n");
      out.write("					</p>\n");
      out.write("				</div>\n");
      out.write("				<!-- Footer Social Icons-->\n");
      out.write("				\n");
      out.write("				<!-- Footer About Text-->\n");
      out.write("				<div class=\"col-lg-4\">\n");
      out.write("					<h4 class=\"text-uppercase mb-4\">About cozentus</h4>\n");
      out.write("					<p class=\"lead mb-0\">\n");
      out.write("						We help Businesses #MoveForward with Cutting Edge Logistics and SCM Solutions <a href=\"https://www.cozentus.com/about\">Start your careear</a> .\n");
      out.write("					</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</footer>\n");
      out.write("	<!-- Copyright Section-->\n");
      out.write("	<div class=\"copyright py-4 text-center text-white\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<small>Copyright &copy; Your Website 2023</small>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<!-- Bootstrap core JS-->\n");
      out.write("	<script\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("	<!-- Core theme JS-->\n");
      out.write("	<script src=\"js/scripts.js\"></script>\n");
      out.write("	<script src=\"https://cdn.startbootstrap.com/sb-forms-latest.js\"></script>\n");
      out.write("	<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("	<link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
