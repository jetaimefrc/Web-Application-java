package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "fragment/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "fragment/nav.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"container-fluid p-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex d-column\" id=\"about\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h4 class=\"mb-0\"> Wellcome <span class=\"text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span> to my website ! </h4>\n");
      out.write("        <br>\n");
      out.write("        <h1 class=\"mb-0\">Trần Quang\n");
      out.write("          <span class=\"text-primary\">Nhật</span>\n");
      out.write("        </h1>\n");
      out.write("        <div class=\"subheading mb-5\">3542 Berry Street · Cheyenne Wells, CO 80810 · (317) 585-8468 ·\n");
      out.write("          <a href=\"mailto:name@email.com\">name@email.com</a>\n");
      out.write("        </div>\n");
      out.write("        <p class=\"lead mb-5\">I am experienced in leveraging agile frameworks to provide a robust synopsis for high level overviews. Iterative approaches to corporate strategy foster collaborative thinking to further the overall value proposition.</p>\n");
      out.write("        <div class=\"social-icons\">\n");
      out.write("          <a target=\"_blank\" href=\"https://github.com/jetaimefrc\">\n");
      out.write("            <i class=\"fab fa-github\"></i>\n");
      out.write("          </a>\n");
      out.write("          <a target=\"_blank\" href=\"https://www.facebook.com/kingman.998\">\n");
      out.write("            <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"experience\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">Experience</h2>\n");
      out.write("\n");
      out.write("        <div class=\"resume-item d-flex flex-column flex-md-row mb-5\">\n");
      out.write("          <div class=\"resume-content mr-auto\">\n");
      out.write("            <h3 class=\"mb-0\">Senior Web Developer</h3>\n");
      out.write("            <div class=\"subheading mb-3\">Intelitec Solutions</div>\n");
      out.write("            <p>Bring to the table win-win survival strategies to ensure proactive domination. At the end of the day, going forward, a new normal that has evolved from generation X is on the runway heading towards a streamlined cloud solution. User generated content in real-time will have multiple touchpoints for offshoring.</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"resume-date text-md-right\">\n");
      out.write("            <span class=\"text-primary\">March 2013 - Present</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"resume-item d-flex flex-column flex-md-row mb-5\">\n");
      out.write("          <div class=\"resume-content mr-auto\">\n");
      out.write("            <h3 class=\"mb-0\">Web Developer</h3>\n");
      out.write("            <div class=\"subheading mb-3\">Intelitec Solutions</div>\n");
      out.write("            <p>Capitalize on low hanging fruit to identify a ballpark value added activity to beta test. Override the digital divide with additional clickthroughs from DevOps. Nanotechnology immersion along the information highway will close the loop on focusing solely on the bottom line.</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"resume-date text-md-right\">\n");
      out.write("            <span class=\"text-primary\">December 2011 - March 2013</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"resume-item d-flex flex-column flex-md-row mb-5\">\n");
      out.write("          <div class=\"resume-content mr-auto\">\n");
      out.write("            <h3 class=\"mb-0\">Junior Web Designer</h3>\n");
      out.write("            <div class=\"subheading mb-3\">Shout! Media Productions</div>\n");
      out.write("            <p>Podcasting operational change management inside of workflows to establish a framework. Taking seamless key performance indicators offline to maximise the long tail. Keeping your eye on the ball while performing a deep dive on the start-up mentality to derive convergence on cross-platform integration.</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"resume-date text-md-right\">\n");
      out.write("            <span class=\"text-primary\">July 2010 - December 2011</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"resume-item d-flex flex-column flex-md-row\">\n");
      out.write("          <div class=\"resume-content mr-auto\">\n");
      out.write("            <h3 class=\"mb-0\">Web Design Intern</h3>\n");
      out.write("            <div class=\"subheading mb-3\">Shout! Media Productions</div>\n");
      out.write("            <p>Collaboratively administrate empowered markets via plug-and-play networks. Dynamically procrastinate B2C users after installed base benefits. Dramatically visualize customer directed convergence without revolutionary ROI.</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"resume-date text-md-right\">\n");
      out.write("            <span class=\"text-primary\">September 2008 - June 2010</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"education\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">Education</h2>\n");
      out.write("\n");
      out.write("        <div class=\"resume-item d-flex flex-column flex-md-row mb-5\">\n");
      out.write("          <div class=\"resume-content mr-auto\">\n");
      out.write("            <h3 class=\"mb-0\">University of Colorado Boulder</h3>\n");
      out.write("            <div class=\"subheading mb-3\">Bachelor of Science</div>\n");
      out.write("            <div>Computer Science - Web Development Track</div>\n");
      out.write("            <p>GPA: 3.23</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"resume-date text-md-right\">\n");
      out.write("            <span class=\"text-primary\">August 2006 - May 2010</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"resume-item d-flex flex-column flex-md-row\">\n");
      out.write("          <div class=\"resume-content mr-auto\">\n");
      out.write("            <h3 class=\"mb-0\">James Buchanan High School</h3>\n");
      out.write("            <div class=\"subheading mb-3\">Technology Magnet Program</div>\n");
      out.write("            <p>GPA: 3.56</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"resume-date text-md-right\">\n");
      out.write("            <span class=\"text-primary\">August 2002 - May 2006</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"skills\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">Skills</h2>\n");
      out.write("\n");
      out.write("        <div class=\"subheading mb-3\">Programming Languages &amp; Tools</div>\n");
      out.write("        <ul class=\"list-inline dev-icons\">\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-html5\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-css3-alt\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-js-square\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-angular\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-react\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-node-js\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-sass\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-less\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-wordpress\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-gulp\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-grunt\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-npm\"></i>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <div class=\"subheading mb-3\">Workflow</div>\n");
      out.write("        <ul class=\"fa-ul mb-0\">\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-check\"></i>\n");
      out.write("            Mobile-First, Responsive Design</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-check\"></i>\n");
      out.write("            Cross Browser Testing &amp; Debugging</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-check\"></i>\n");
      out.write("            Cross Functional Teams</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-check\"></i>\n");
      out.write("            Agile Development &amp; Scrum</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"interests\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">Interests</h2>\n");
      out.write("        <p>Apart from being a web developer, I enjoy most of my time being outdoors. In the winter, I am an avid skier and novice ice climber. During the warmer months here in Colorado, I enjoy mountain biking, free climbing, and kayaking.</p>\n");
      out.write("        <p class=\"mb-0\">When forced indoors, I follow a number of sci-fi and fantasy genre movies and television shows, I am an aspiring chef, and I spend a large amount of my free time exploring the latest technology advancements in the front-end web development world.</p>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"awards\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">Awards &amp; Certifications</h2>\n");
      out.write("        <ul class=\"fa-ul mb-0\">\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            Google Analytics Certified Developer</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            Mobile Web Specialist - Google Certification</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            1<sup>st</sup>\n");
      out.write("            Place - University of Colorado Boulder - Emerging Tech Competition 2009</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            1<sup>st</sup>\n");
      out.write("            Place - University of Colorado Boulder - Adobe Creative Jam 2008 (UI Design Category)</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            2<sup>nd</sup>\n");
      out.write("            Place - University of Colorado Boulder - Emerging Tech Competition 2008</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            1<sup>st</sup>\n");
      out.write("            Place - James Buchanan High School - Hackathon 2006</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            3<sup>rd</sup>\n");
      out.write("            Place - James Buchanan High School - Hackathon 2005</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "fragment/footer.jsp", out, false);
      out.write('\n');
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
