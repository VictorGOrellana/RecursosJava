/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-07-25 20:48:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dataTable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Data Table JQuery</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css\">\r\n");
      out.write("<script src=\"//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table id=\"minhatabela\" class=\"display\" style=\"width:100%\">\r\n");
      out.write("        <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Name</th>\r\n");
      out.write("                <th>Position</th>\r\n");
      out.write("                <th>Office</th>\r\n");
      out.write("                <th>Age</th>\r\n");
      out.write("                <th>Start date</th>\r\n");
      out.write("                <th>Salary</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Tiger Nixon</td>\r\n");
      out.write("                <td>System Architect</td>\r\n");
      out.write("                <td>Edinburgh</td>\r\n");
      out.write("                <td>61</td>\r\n");
      out.write("                <td>2011/04/25</td>\r\n");
      out.write("                <td>$320,800</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Garrett Winters</td>\r\n");
      out.write("                <td>Accountant</td>\r\n");
      out.write("                <td>Tokyo</td>\r\n");
      out.write("                <td>63</td>\r\n");
      out.write("                <td>2011/07/25</td>\r\n");
      out.write("                <td>$170,750</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Ashton Cox</td>\r\n");
      out.write("                <td>Junior Technical Author</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>66</td>\r\n");
      out.write("                <td>2009/01/12</td>\r\n");
      out.write("                <td>$86,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Cedric Kelly</td>\r\n");
      out.write("                <td>Senior Javascript Developer</td>\r\n");
      out.write("                <td>Edinburgh</td>\r\n");
      out.write("                <td>22</td>\r\n");
      out.write("                <td>2012/03/29</td>\r\n");
      out.write("                <td>$433,060</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Airi Satou</td>\r\n");
      out.write("                <td>Accountant</td>\r\n");
      out.write("                <td>Tokyo</td>\r\n");
      out.write("                <td>33</td>\r\n");
      out.write("                <td>2008/11/28</td>\r\n");
      out.write("                <td>$162,700</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Brielle Williamson</td>\r\n");
      out.write("                <td>Integration Specialist</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>61</td>\r\n");
      out.write("                <td>2012/12/02</td>\r\n");
      out.write("                <td>$372,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Herrod Chandler</td>\r\n");
      out.write("                <td>Sales Assistant</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>59</td>\r\n");
      out.write("                <td>2012/08/06</td>\r\n");
      out.write("                <td>$137,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Rhona Davidson</td>\r\n");
      out.write("                <td>Integration Specialist</td>\r\n");
      out.write("                <td>Tokyo</td>\r\n");
      out.write("                <td>55</td>\r\n");
      out.write("                <td>2010/10/14</td>\r\n");
      out.write("                <td>$327,900</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Colleen Hurst</td>\r\n");
      out.write("                <td>Javascript Developer</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>39</td>\r\n");
      out.write("                <td>2009/09/15</td>\r\n");
      out.write("                <td>$205,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Sonya Frost</td>\r\n");
      out.write("                <td>Software Engineer</td>\r\n");
      out.write("                <td>Edinburgh</td>\r\n");
      out.write("                <td>23</td>\r\n");
      out.write("                <td>2008/12/13</td>\r\n");
      out.write("                <td>$103,600</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Jena Gaines</td>\r\n");
      out.write("                <td>Office Manager</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>30</td>\r\n");
      out.write("                <td>2008/12/19</td>\r\n");
      out.write("                <td>$90,560</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Quinn Flynn</td>\r\n");
      out.write("                <td>Support Lead</td>\r\n");
      out.write("                <td>Edinburgh</td>\r\n");
      out.write("                <td>22</td>\r\n");
      out.write("                <td>2013/03/03</td>\r\n");
      out.write("                <td>$342,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Charde Marshall</td>\r\n");
      out.write("                <td>Regional Director</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>36</td>\r\n");
      out.write("                <td>2008/10/16</td>\r\n");
      out.write("                <td>$470,600</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Haley Kennedy</td>\r\n");
      out.write("                <td>Senior Marketing Designer</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>43</td>\r\n");
      out.write("                <td>2012/12/18</td>\r\n");
      out.write("                <td>$313,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Tatyana Fitzpatrick</td>\r\n");
      out.write("                <td>Regional Director</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>19</td>\r\n");
      out.write("                <td>2010/03/17</td>\r\n");
      out.write("                <td>$385,750</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Michael Silva</td>\r\n");
      out.write("                <td>Marketing Designer</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>66</td>\r\n");
      out.write("                <td>2012/11/27</td>\r\n");
      out.write("                <td>$198,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Paul Byrd</td>\r\n");
      out.write("                <td>Chief Financial Officer (CFO)</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>64</td>\r\n");
      out.write("                <td>2010/06/09</td>\r\n");
      out.write("                <td>$725,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Gloria Little</td>\r\n");
      out.write("                <td>Systems Administrator</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>59</td>\r\n");
      out.write("                <td>2009/04/10</td>\r\n");
      out.write("                <td>$237,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Bradley Greer</td>\r\n");
      out.write("                <td>Software Engineer</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>41</td>\r\n");
      out.write("                <td>2012/10/13</td>\r\n");
      out.write("                <td>$132,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Dai Rios</td>\r\n");
      out.write("                <td>Personnel Lead</td>\r\n");
      out.write("                <td>Edinburgh</td>\r\n");
      out.write("                <td>35</td>\r\n");
      out.write("                <td>2012/09/26</td>\r\n");
      out.write("                <td>$217,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Jenette Caldwell</td>\r\n");
      out.write("                <td>Development Lead</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>30</td>\r\n");
      out.write("                <td>2011/09/03</td>\r\n");
      out.write("                <td>$345,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Yuri Berry</td>\r\n");
      out.write("                <td>Chief Marketing Officer (CMO)</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>40</td>\r\n");
      out.write("                <td>2009/06/25</td>\r\n");
      out.write("                <td>$675,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Caesar Vance</td>\r\n");
      out.write("                <td>Pre-Sales Support</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>21</td>\r\n");
      out.write("                <td>2011/12/12</td>\r\n");
      out.write("                <td>$106,450</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Doris Wilder</td>\r\n");
      out.write("                <td>Sales Assistant</td>\r\n");
      out.write("                <td>Sidney</td>\r\n");
      out.write("                <td>23</td>\r\n");
      out.write("                <td>2010/09/20</td>\r\n");
      out.write("                <td>$85,600</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Angelica Ramos</td>\r\n");
      out.write("                <td>Chief Executive Officer (CEO)</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>47</td>\r\n");
      out.write("                <td>2009/10/09</td>\r\n");
      out.write("                <td>$1,200,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Gavin Joyce</td>\r\n");
      out.write("                <td>Developer</td>\r\n");
      out.write("                <td>Edinburgh</td>\r\n");
      out.write("                <td>42</td>\r\n");
      out.write("                <td>2010/12/22</td>\r\n");
      out.write("                <td>$92,575</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Jennifer Chang</td>\r\n");
      out.write("                <td>Regional Director</td>\r\n");
      out.write("                <td>Singapore</td>\r\n");
      out.write("                <td>28</td>\r\n");
      out.write("                <td>2010/11/14</td>\r\n");
      out.write("                <td>$357,650</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Brenden Wagner</td>\r\n");
      out.write("                <td>Software Engineer</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>28</td>\r\n");
      out.write("                <td>2011/06/07</td>\r\n");
      out.write("                <td>$206,850</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Fiona Green</td>\r\n");
      out.write("                <td>Chief Operating Officer (COO)</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>48</td>\r\n");
      out.write("                <td>2010/03/11</td>\r\n");
      out.write("                <td>$850,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Shou Itou</td>\r\n");
      out.write("                <td>Regional Marketing</td>\r\n");
      out.write("                <td>Tokyo</td>\r\n");
      out.write("                <td>20</td>\r\n");
      out.write("                <td>2011/08/14</td>\r\n");
      out.write("                <td>$163,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Michelle House</td>\r\n");
      out.write("                <td>Integration Specialist</td>\r\n");
      out.write("                <td>Sidney</td>\r\n");
      out.write("                <td>37</td>\r\n");
      out.write("                <td>2011/06/02</td>\r\n");
      out.write("                <td>$95,400</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Suki Burks</td>\r\n");
      out.write("                <td>Developer</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>53</td>\r\n");
      out.write("                <td>2009/10/22</td>\r\n");
      out.write("                <td>$114,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Prescott Bartlett</td>\r\n");
      out.write("                <td>Technical Author</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>27</td>\r\n");
      out.write("                <td>2011/05/07</td>\r\n");
      out.write("                <td>$145,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Gavin Cortez</td>\r\n");
      out.write("                <td>Team Leader</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>22</td>\r\n");
      out.write("                <td>2008/10/26</td>\r\n");
      out.write("                <td>$235,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Martena Mccray</td>\r\n");
      out.write("                <td>Post-Sales support</td>\r\n");
      out.write("                <td>Edinburgh</td>\r\n");
      out.write("                <td>46</td>\r\n");
      out.write("                <td>2011/03/09</td>\r\n");
      out.write("                <td>$324,050</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Unity Butler</td>\r\n");
      out.write("                <td>Marketing Designer</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>47</td>\r\n");
      out.write("                <td>2009/12/09</td>\r\n");
      out.write("                <td>$85,675</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Howard Hatfield</td>\r\n");
      out.write("                <td>Office Manager</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>51</td>\r\n");
      out.write("                <td>2008/12/16</td>\r\n");
      out.write("                <td>$164,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Hope Fuentes</td>\r\n");
      out.write("                <td>Secretary</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>41</td>\r\n");
      out.write("                <td>2010/02/12</td>\r\n");
      out.write("                <td>$109,850</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Vivian Harrell</td>\r\n");
      out.write("                <td>Financial Controller</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>62</td>\r\n");
      out.write("                <td>2009/02/14</td>\r\n");
      out.write("                <td>$452,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Timothy Mooney</td>\r\n");
      out.write("                <td>Office Manager</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>37</td>\r\n");
      out.write("                <td>2008/12/11</td>\r\n");
      out.write("                <td>$136,200</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Jackson Bradshaw</td>\r\n");
      out.write("                <td>Director</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>65</td>\r\n");
      out.write("                <td>2008/09/26</td>\r\n");
      out.write("                <td>$645,750</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Olivia Liang</td>\r\n");
      out.write("                <td>Support Engineer</td>\r\n");
      out.write("                <td>Singapore</td>\r\n");
      out.write("                <td>64</td>\r\n");
      out.write("                <td>2011/02/03</td>\r\n");
      out.write("                <td>$234,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Bruno Nash</td>\r\n");
      out.write("                <td>Software Engineer</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>38</td>\r\n");
      out.write("                <td>2011/05/03</td>\r\n");
      out.write("                <td>$163,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Sakura Yamamoto</td>\r\n");
      out.write("                <td>Support Engineer</td>\r\n");
      out.write("                <td>Tokyo</td>\r\n");
      out.write("                <td>37</td>\r\n");
      out.write("                <td>2009/08/19</td>\r\n");
      out.write("                <td>$139,575</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Thor Walton</td>\r\n");
      out.write("                <td>Developer</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>61</td>\r\n");
      out.write("                <td>2013/08/11</td>\r\n");
      out.write("                <td>$98,540</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Finn Camacho</td>\r\n");
      out.write("                <td>Support Engineer</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>47</td>\r\n");
      out.write("                <td>2009/07/07</td>\r\n");
      out.write("                <td>$87,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Serge Baldwin</td>\r\n");
      out.write("                <td>Data Coordinator</td>\r\n");
      out.write("                <td>Singapore</td>\r\n");
      out.write("                <td>64</td>\r\n");
      out.write("                <td>2012/04/09</td>\r\n");
      out.write("                <td>$138,575</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Zenaida Frank</td>\r\n");
      out.write("                <td>Software Engineer</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>63</td>\r\n");
      out.write("                <td>2010/01/04</td>\r\n");
      out.write("                <td>$125,250</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Zorita Serrano</td>\r\n");
      out.write("                <td>Software Engineer</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>56</td>\r\n");
      out.write("                <td>2012/06/01</td>\r\n");
      out.write("                <td>$115,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Jennifer Acosta</td>\r\n");
      out.write("                <td>Junior Javascript Developer</td>\r\n");
      out.write("                <td>Edinburgh</td>\r\n");
      out.write("                <td>43</td>\r\n");
      out.write("                <td>2013/02/01</td>\r\n");
      out.write("                <td>$75,650</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Cara Stevens</td>\r\n");
      out.write("                <td>Sales Assistant</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>46</td>\r\n");
      out.write("                <td>2011/12/06</td>\r\n");
      out.write("                <td>$145,600</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Hermione Butler</td>\r\n");
      out.write("                <td>Regional Director</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>47</td>\r\n");
      out.write("                <td>2011/03/21</td>\r\n");
      out.write("                <td>$356,250</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Lael Greer</td>\r\n");
      out.write("                <td>Systems Administrator</td>\r\n");
      out.write("                <td>London</td>\r\n");
      out.write("                <td>21</td>\r\n");
      out.write("                <td>2009/02/27</td>\r\n");
      out.write("                <td>$103,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Jonas Alexander</td>\r\n");
      out.write("                <td>Developer</td>\r\n");
      out.write("                <td>San Francisco</td>\r\n");
      out.write("                <td>30</td>\r\n");
      out.write("                <td>2010/07/14</td>\r\n");
      out.write("                <td>$86,500</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Shad Decker</td>\r\n");
      out.write("                <td>Regional Director</td>\r\n");
      out.write("                <td>Edinburgh</td>\r\n");
      out.write("                <td>51</td>\r\n");
      out.write("                <td>2008/11/13</td>\r\n");
      out.write("                <td>$183,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Michael Bruce</td>\r\n");
      out.write("                <td>Javascript Developer</td>\r\n");
      out.write("                <td>Singapore</td>\r\n");
      out.write("                <td>29</td>\r\n");
      out.write("                <td>2011/06/27</td>\r\n");
      out.write("                <td>$183,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Donna Snider</td>\r\n");
      out.write("                <td>Customer Support</td>\r\n");
      out.write("                <td>New York</td>\r\n");
      out.write("                <td>27</td>\r\n");
      out.write("                <td>2011/01/25</td>\r\n");
      out.write("                <td>$112,000</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("        <tfoot>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Name</th>\r\n");
      out.write("                <th>Position</th>\r\n");
      out.write("                <th>Office</th>\r\n");
      out.write("                <th>Age</th>\r\n");
      out.write("                <th>Start date</th>\r\n");
      out.write("                <th>Salary</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </tfoot>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write(" $(document).ready(function() {\r\n");
      out.write("\t    $('#minhatabela').DataTable();\r\n");
      out.write("\t} );\r\n");
      out.write(" \r\n");
      out.write(" </script>\r\n");
      out.write("</html>");
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
