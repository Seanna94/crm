/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-07-18 08:16:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.setting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loglist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/setting/../include/leftSide.jsp", Long.valueOf(1468464684241L));
    _jspx_dependants.put("/WEB-INF/views/setting/../include/mainHeader.jsp", Long.valueOf(1468472481787L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.release();
    _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>SeannaCRM--用户登录日志</title>\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/fontawesome/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/datatables/css/dataTables.bootstrap.min.css\">\n");
      out.write("    <!-- Theme style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/dist/css/AdminLTE.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/dist/css/skins/skin-blue.min.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Main Header -->\n");
      out.write("<header class=\"main-header\">\n");
      out.write("\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <a href=\"index2.html\" class=\"logo\">\n");
      out.write("        <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("        <span class=\"logo-mini\">CRM</span>\n");
      out.write("        <!-- logo for regular state and mobile devices -->\n");
      out.write("        <span class=\"logo-lg\"><b>Kaisheng</b>CRM</span>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Header Navbar -->\n");
      out.write("    <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("        <!-- Sidebar toggle button-->\n");
      out.write("        <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        </a>\n");
      out.write("        <!-- Navbar Right Menu -->\n");
      out.write("        <div class=\"navbar-custom-menu\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("                <li class=\"dropdown messages-menu\">\n");
      out.write("                    <!-- Menu toggle button -->\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                        <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                        <span class=\"label label-success\">4</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li class=\"header\">You have 4 messages</li>\n");
      out.write("                        <li>\n");
      out.write("                            <!-- inner menu: contains the messages -->\n");
      out.write("                            <ul class=\"menu\">\n");
      out.write("                                <li><!-- start message -->\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <div class=\"pull-left\">\n");
      out.write("                                            <!-- User Image -->\n");
      out.write("                                            <img src=\"/static/dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- Message title and timestamp -->\n");
      out.write("                                        <h4>\n");
      out.write("                                            Support Team\n");
      out.write("                                            <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\n");
      out.write("                                        </h4>\n");
      out.write("                                        <!-- The message -->\n");
      out.write("                                        <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- end message -->\n");
      out.write("                            </ul>\n");
      out.write("                            <!-- /.menu -->\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <!-- /.messages-menu -->\n");
      out.write("\n");
      out.write("                <!-- Notifications Menu -->\n");
      out.write("                <li class=\"dropdown notifications-menu\">\n");
      out.write("                    <!-- Menu toggle button -->\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                        <i class=\"fa fa-bell-o\"></i>\n");
      out.write("                        <span class=\"label label-warning\">10</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li class=\"header\">You have 10 notifications</li>\n");
      out.write("                        <li>\n");
      out.write("                            <!-- Inner Menu: contains the notifications -->\n");
      out.write("                            <ul class=\"menu\">\n");
      out.write("                                <li><!-- start notification -->\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- end notification -->\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer\"><a href=\"#\">View all</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <!-- Tasks Menu -->\n");
      out.write("                <li class=\"dropdown tasks-menu\">\n");
      out.write("                    <!-- Menu Toggle Button -->\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                        <i class=\"fa fa-flag-o\"></i>\n");
      out.write("                        <span class=\"label label-danger\">9</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li class=\"header\">You have 9 tasks</li>\n");
      out.write("                        <li>\n");
      out.write("                            <!-- Inner menu: contains the tasks -->\n");
      out.write("                            <ul class=\"menu\">\n");
      out.write("                                <li><!-- Task item -->\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <!-- Task title and progress text -->\n");
      out.write("                                        <h3>\n");
      out.write("                                            Design some buttons\n");
      out.write("                                            <small class=\"pull-right\">20%</small>\n");
      out.write("                                        </h3>\n");
      out.write("                                        <!-- The progress bar -->\n");
      out.write("                                        <div class=\"progress xs\">\n");
      out.write("                                            <!-- Change the css width attribute to simulate progress -->\n");
      out.write("                                            <div class=\"progress-bar progress-bar-aqua\" style=\"width: 20%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- end task item -->\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer\">\n");
      out.write("                            <a href=\"#\">View all tasks</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <!-- User Account Menu -->\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <!-- Menu Toggle Button -->\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                        <span class=\"hidden-xs\">");
      if (_jspx_meth_shiro_005fprincipal_005f0(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"/user/password\">修改密码</a></li>\n");
      out.write("                        <li><a href=\"/user/log\">登录日志</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"/logout\">安全退出</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</header>");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Left side column. contains the logo and sidebar -->\n");
      out.write("<aside class=\"main-sidebar\">\n");
      out.write("\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("    <section class=\"sidebar\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar Menu -->\n");
      out.write("        <ul class=\"sidebar-menu\">\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_shiro_005fhasAnyRoles_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_shiro_005fhasRole_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <!-- /.sidebar-menu -->\n");
      out.write("    </section>\n");
      out.write("    <!-- /.sidebar -->\n");
      out.write("</aside>");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Content Wrapper. Contains page content -->\n");
      out.write("    <div class=\"content-wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Main content -->\n");
      out.write("        <section class=\"content\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12\">\n");
      out.write("                    <div class=\"box box-primary\">\n");
      out.write("                        <div class=\"box-header with-border\">\n");
      out.write("                            <h3 class=\"box-title\">登录日志列表</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box-body\">\n");
      out.write("                            <table class=\"table table-bordered table-hover\" id=\"logTable\">\n");
      out.write("                                <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>登录时间</th>\n");
      out.write("                                    <th>登录IP</th>\n");
      out.write("                                </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody></tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- /.content -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /.content-wrapper -->\n");
      out.write("</div>\n");
      out.write("<!-- jQuery 2.2.0 -->\n");
      out.write("<script src=\"/static/plugins/jQuery/jQuery-2.2.0.min.js\"></script>\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<script src=\"/static/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- AdminLTE App -->\n");
      out.write("<script src=\"/static/dist/js/app.min.js\"></script>\n");
      out.write("<script src=\"/static/plugins/datatables/js/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"/static/plugins/datatables/js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(function(){\n");
      out.write("        var dateTable = $(\"#logTable\").DataTable({\n");
      out.write("            searching:false,\n");
      out.write("            serverSide:true,\n");
      out.write("            ajax:\"/user/log/load\",\n");
      out.write("            ordering:false,\n");
      out.write("            \"autoWidth\": false,\n");
      out.write("            columns:[\n");
      out.write("                {\"data\":\"logintime\"},\n");
      out.write("                {\"data\":\"loginip\"}\n");
      out.write("            ],\n");
      out.write("            \"language\": { //定义中文\n");
      out.write("                \"search\": \"请输入书籍名称:\",\n");
      out.write("                \"zeroRecords\": \"没有匹配的数据\",\n");
      out.write("                \"lengthMenu\": \"显示 _MENU_ 条数据\",\n");
      out.write("                \"info\": \"显示从 _START_ 到 _END_ 条数据 共 _TOTAL_ 条数据\",\n");
      out.write("                \"infoFiltered\": \"(从 _MAX_ 条数据中过滤得来)\",\n");
      out.write("                \"loadingRecords\": \"加载中...\",\n");
      out.write("                \"processing\": \"处理中...\",\n");
      out.write("                \"paginate\": {\n");
      out.write("                    \"first\": \"首页\",\n");
      out.write("                    \"last\": \"末页\",\n");
      out.write("                    \"next\": \"下一页\",\n");
      out.write("                    \"previous\": \"上一页\"\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f0 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f0.setParent(null);
    // /WEB-INF/views/setting/../include/mainHeader.jsp(122,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fprincipal_005f0.setProperty("realname");
    int _jspx_eval_shiro_005fprincipal_005f0 = _jspx_th_shiro_005fprincipal_005f0.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasAnyRoles_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasAnyRoles
    org.apache.shiro.web.tags.HasAnyRolesTag _jspx_th_shiro_005fhasAnyRoles_005f0 = (org.apache.shiro.web.tags.HasAnyRolesTag) _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.get(org.apache.shiro.web.tags.HasAnyRolesTag.class);
    _jspx_th_shiro_005fhasAnyRoles_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasAnyRoles_005f0.setParent(null);
    // /WEB-INF/views/setting/../include/leftSide.jsp(12,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasAnyRoles_005f0.setName("经理,员工");
    int _jspx_eval_shiro_005fhasAnyRoles_005f0 = _jspx_th_shiro_005fhasAnyRoles_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasAnyRoles_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <li class=\"active\"><a href=\"#\"><i class=\"fa fa-home\"></i> <span>首页</span></a></li>\n");
        out.write("                <li><a href=\"#\"><i class=\"fa fa-bullhorn\"></i> <span>公告</span></a></li>\n");
        out.write("                <li><a href=\"#\"><i class=\"fa fa-building-o\"></i> <span>项目管理</span></a></li>\n");
        out.write("                <li><a href=\"#\"><i class=\"fa fa-users\"></i> <span>客户管理</span></a></li>\n");
        out.write("                <li><a href=\"#\"><i class=\"fa fa-bar-chart\"></i> <span>统计</span></a></li>\n");
        out.write("                <li><a href=\"#\"><i class=\"fa fa-calendar-check-o\"></i> <span>代办事项</span></a></li>\n");
        out.write("                <li><a href=\"#\"><i class=\"fa fa-file-text\"></i> <span>文档管理</span></a></li>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_shiro_005fhasAnyRoles_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasAnyRoles_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.reuse(_jspx_th_shiro_005fhasAnyRoles_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.reuse(_jspx_th_shiro_005fhasAnyRoles_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasRole_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasRole
    org.apache.shiro.web.tags.HasRoleTag _jspx_th_shiro_005fhasRole_005f0 = (org.apache.shiro.web.tags.HasRoleTag) _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.get(org.apache.shiro.web.tags.HasRoleTag.class);
    _jspx_th_shiro_005fhasRole_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasRole_005f0.setParent(null);
    // /WEB-INF/views/setting/../include/leftSide.jsp(21,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasRole_005f0.setName("管理员");
    int _jspx_eval_shiro_005fhasRole_005f0 = _jspx_th_shiro_005fhasRole_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasRole_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <li class=\"treeview\">\n");
        out.write("                    <a href=\"#\"><i class=\"fa fa-cogs\"></i> <span>系统管理</span> <i class=\"fa fa-angle-left pull-right\"></i></a>\n");
        out.write("                    <ul class=\"treeview-menu\">\n");
        out.write("                        <li><a href=\"#\">员工管理</a></li>\n");
        out.write("                        <li><a href=\"#\">系统设置</a></li>\n");
        out.write("                    </ul>\n");
        out.write("                </li>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_shiro_005fhasRole_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasRole_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.reuse(_jspx_th_shiro_005fhasRole_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.reuse(_jspx_th_shiro_005fhasRole_005f0);
    return false;
  }
}