package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.CArticulos;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Project-Sierra Sun</title>\n");
      out.write("  <!--Required meta tags-->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("  <!--Bootstrap CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"Boostrap\\css\\bootstrap.min.css\">\n");
      out.write("  <!--Custom styles-->\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/css/table-styles.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"Tables\\datatables.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"Tables\\dataTables.bootstrap4.css\">\n");
      out.write("  <!-- Google fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Muli:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"d-flex\" id=\"content-wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    <div id=\"sidebar-container\" class=\"border-right\">\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <img id=\"icon-sidebar\" src=\"assets\\img\\Icon.png\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"menu list-group-flush \">\n");
      out.write("\n");
      out.write("        <a href=\"Index.jsp\" class=\"mtextB text-light p-3 border-0\"><i class=\"fas fa-home lead mr-2\"></i> Inicio</a>\n");
      out.write("        <a href=\"finances.html\" class=\"mtextB text-light p-3 border-0\"><i class=\"fas fa-poll lead mr-2\"></i> Estadísticas</a>\n");
      out.write("        <a href=\"events.html\" class=\"mtextB text-light p-3 border-0\"><i class=\"far fa-calendar-alt lead mr-2\"></i> Eventos</a>\n");
      out.write("\n");
      out.write("        <!--APARTADO DEL BOTON DESPLEGABLE DONDE SE PUEDE INGRESAR Y VISUALIZAR LA BANDEJA DE ENTRADA-->\n");
      out.write("        <div class=\"accordion border-0 \" id=\"accordionExample\" style=\"background-color:rgba(255, 255, 255, 0) !important; \">\n");
      out.write("          <div class=\"card border-0\" style=\"background-color:rgba(255, 255, 255, 0) !important; \">\n");
      out.write("            <div class=\"card-header border-0 padding-0\" id=\"headingOne\">\n");
      out.write("              <h2 class=\"mb-0\">\n");
      out.write("                <button class=\"btn btn-block text-left border-0 padding-0\" id=\"boton-bandeja\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n");
      out.write("                  <a href=\"#\" class=\"mtextB text-light p-3 border-0\"><i class=\"fas fa-envelope-open lead mr-2\"></i> Bandeja de entrada</a>\n");
      out.write("                </button>\n");
      out.write("              </h2>\n");
      out.write("            </div>\n");
      out.write("            <!-- APARTADO DE FUNCIONALIDADES Y BOTONES DE LA BANDEJA DE ENTRADA-->\n");
      out.write("            <div id=\"collapseOne\" class=\"collapse show\" aria-labelledby=\"headingOne\" data-parent=\"#accordionExample\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <a href=\"E-mail.html\" class=\"mtextA text-danger alert alert-danger border-0\"><i class=\"fas fa-tablet-alt\"></i> Recibidos <small><span class=\"badge badge-pill badge-muted text-danger\">25</span></small></a>\n");
      out.write("                <a href=\"#\" class=\"mtext text-light border-0\"><i class=\"far fa-clock\"></i> Pospuestos <span class=\"badge badge-pill badge-muted\">3</span></small></a>\n");
      out.write("                <a href=\"#\" class=\"mtext text-light border-0\"><i class=\"fas fa-envelope\"></i> Redactar Mensaje</a>\n");
      out.write("                <a href=\"#\" class=\"mtext text-light border-0\"><i class=\"fas fa-star\"></i> Destacados</a>\n");
      out.write("                <a href=\"#\" class=\"mtext text-light border-0\"><i class=\"far fa-bell\"></i> Importantes <small><span class=\"badge badge-pill badge-muted\">1</span></small></a>\n");
      out.write("                <a href=\"#\" class=\"mtext text-light border-0\"><i class=\"far fa-paper-plane\"></i> Enviados</a>\n");
      out.write("                <a href=\"#\" class=\"mtext text-light border-0\"><i class=\"fas fa-trash-alt\"></i> Papelera <small><span class=\"badge badge-pill\">8</span></small></a>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <a href=\"requesment.html\" class=\"mtextB text-light p-3 border-0\"><i class=\"fas fa-database lead mr-2\"></i>Requerimientos</a>\n");
      out.write("        <a href=\"settings.html\" class=\"mtextB text-light p-3 border-0\"> <i class=\"\tfas fa-cogs lead mr-2\"></i> Configuración</a>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Sidebar end-->\n");
      out.write("\n");
      out.write("    <!-- Page Content -->\n");
      out.write("    <div id=\"page-content-wrapper\" class=\"table-responsive\" style=\"background: url(assets/img/pageContent.jpg)\n");
      out.write("    !important; background-size: cover !important; background-repeat: no-repeat !important; width:\n");
      out.write("    100% !important; margin: 0 auto !important;\" class=\"w-100 bg-light-blue\">\n");
      out.write("      <!-- Nav bar -->\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-light bg-dark border-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <button class=\"btn btn-outline-info text-white my-2 my-sm-0\" id=\"menu-toggle\"><i class=\"fas fa-bars\"></i> Sidebar</button>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto mt-2 mt-lg-0\">\n");
      out.write("              <li>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                  <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Buscar\" aria-label=\"Search\" style=\"margin-bottom: 0px;\">\n");
      out.write("                  <button class=\"btn btn-outline-info text-white my-2 my-sm-0\" type=\"submit\">Buscar</button>\n");
      out.write("                </form>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link text-white dropdown-toggle btn btn-outline-info \" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                  Usuario\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                  <a class=\"dropdown-item\" href=\"perfil.html\">Mi perfil</a>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Archivos</a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"Login.html\">Cerrar sesión</a>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <!-- Nav bar end -->\n");
      out.write("      <div id=\"content\" class=\"container-fluid\">\n");
      out.write("        <section class=\"py-3\">\n");
      out.write("          <!-- Graphic -->\n");
      out.write("          <div class=\"row\">\n");
      out.write("              <div class=\"card card-chart bg-dark\" id=\"Graphic-card\">\n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <div class=\"row\" style=\"color: white;\">\n");
      out.write("                  <div class=\"col-sm-6\">\n");
      out.write("                    <h5 class=\"card-title\" style=\"color: white\">Titulo</h5>\n");
      out.write("                    <p class=\"card-text\">Graphic</p>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-sm-6\" style=\"padding-right: 0px;\">\n");
      out.write("                    <div class=\"btn-group btn-group-toggle\" data-toggle=\"buttons\">\n");
      out.write("                      <label class=\"btn btn-outline-primary btns-custom btn-simple active active-card\">\n");
      out.write("                        <input type=\"radio\" name=\"options\" id=\"option1\" checked>\n");
      out.write("                        <span class=\"d-none d-sm-block d-md-block d-lg-block d-xl-block\">Opcion1</span>\n");
      out.write("                        <span class=\"d-block d-sm-none\">\n");
      out.write("                          <i class=\"tim-icons\tfas fa-chart-bar\"></i>\n");
      out.write("                        </span>\n");
      out.write("                      </label>\n");
      out.write("                      <label class=\"btn btn-outline-primary btns-custom btn-simple active active-card\">\n");
      out.write("                        <input type=\"radio\" name=\"options\" id=\"option2\">\n");
      out.write("                        <span class=\"d-none d-sm-block d-md-block d-lg-block d-xl-block\">Opcion2</span>\n");
      out.write("                        <span class=\"d-block d-sm-none\">\n");
      out.write("                          <i class=\"tim-icons\tfas fa-chart-line\"></i>\n");
      out.write("                        </span>\n");
      out.write("                      </label>\n");
      out.write("                      <label class=\"btn btn-outline-primary btns-custom btn-simple active active-card\">\n");
      out.write("                        <input type=\"radio\" name=\"options\" id=\"option3\">\n");
      out.write("                        <span class=\"d-none d-sm-block d-md-block d-lg-block d-xl-block\">Opcion3</span>\n");
      out.write("                        <span class=\"d-block d-sm-none\">\n");
      out.write("                          <i class=\"tim-icons\tfas fa-chart-pie\"></i>\n");
      out.write("                        </span>\n");
      out.write("                      </label>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"chart-area\">\n");
      out.write("                  <canvas id=\"lineChartExample\" class=\"\" width=\"1676\" height=\"440\" class=\"chartjs-render-monitor\" style=\"display: block; height: 220px; width: 838px;\">\n");
      out.write("                  </canvas>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- Graphic end-->\n");
      out.write("\n");
      out.write("          <div class=\"row mb-3\" style=\"background:\">\n");
      out.write("\n");
      out.write("            <!-- Table -->\n");
      out.write("            <div class=\"col-xl-7 col-lg-12\">\n");
      out.write("              <div class=\"table-responsive \">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                  <thead class=\"text-white bg-dark\">\n");
      out.write("                    <tr>\n");
      out.write("                      <th colspan=\"2\"><small class=\"font-weight-bold\">Usuarios<small></th>\n");
      out.write("                      <th scope=\"col\"><small class=\"font-weight-bold\">Estatus<small></th>\n");
      out.write("                      <th scope=\"col\"><small class=\"font-weight-bold\">Activo hace<small></th>\n");
      out.write("                    </tr>\n");
      out.write("                  </thead>\n");
      out.write("                  <tbody class=>\n");
      out.write("                    <tr class=\"shadow-sm \">\n");
      out.write("                      <td><i class=\"fas fa-user-circle lead mr-2\"></i></td>\n");
      out.write("                      <td><span class=\"d-block\">Cristian</span><small>cristian@templune.com</small>\n");
      out.write("                      </td>\n");
      out.write("                      <td class=\"align-middle\"><span class=\"badge badge-secondary text-white\" style=\"background: #00ACC1\">Activo</span></td>\n");
      out.write("                      <td class=\"align-middle\"><span class=\"badge badge-secondary\">\n");
      out.write("                          <i class=\"fas fa-circle ml-1\" style='font-size: 10px;'></i> Ahora</span>\n");
      out.write("                      </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"shadow-sm \">\n");
      out.write("                      <td><i class=\"fas fa-user-circle lead mr-2\"></i></td>\n");
      out.write("                      <td><span class=\"d-block\">Diego</span><small>diego@templune.com</small></td>\n");
      out.write("                      <td class=\"align-middle\"><span class=\"badge badge-secondary text-white\" style=\"background: #00ACC1\">Inactivo</span></td>\n");
      out.write("                      <td class=\"align-middle\"><span class=\"badge badge-secondary\">\n");
      out.write("                          <i class=\"far fa-circle ml-1\" style='font-size: 10px;'></i> 1d</span>\n");
      out.write("                      </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"shadow-sm  \">\n");
      out.write("                      <td><i class=\"fas fa-user-circle lead mr-2\"></i></td>\n");
      out.write("                      <td><span class=\"d-block\">Irina</span><small>irina@templune.com</small></td>\n");
      out.write("                      <td class=\"align-middle\"><span class=\"badge badge-secondary text-white\" style=\"background: #00ACC1\">Activo</span></td>\n");
      out.write("                      <td class=\"align-middle\"><span class=\"badge badge-secondary\">\n");
      out.write("                          <i class=\"\tfas fa-circle ml-1\" style='font-size: 10px;'></i> Ahora</span>\n");
      out.write("                      </td>\n");
      out.write("                    </tr>\n");
      out.write("                  </tbody>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Table end -->\n");
      out.write("\n");
      out.write("            <!--message bar-->\n");
      out.write("            <div class=\"col-xl-5 col-lg-12\">\n");
      out.write("              <div class=\"table-responsive \">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                  <thead class=\"text-white bg-dark\">\n");
      out.write("                    <tr>\n");
      out.write("                      <th colspan=\"3\"><small class=\"font-weight-bold\">Mensajes<small></th>\n");
      out.write("                    </tr>\n");
      out.write("                  </thead>\n");
      out.write("                  <tbody>\n");
      out.write("                    <tr class=\"shadow-sm \">\n");
      out.write("                      <td><i class=\"fas fa-user-circle lead mr-2\"></i></td>\n");
      out.write("                      <td><span class=\"d-block\">Cristian Palacios</span><small>Me podrías enviar la cotización de la aplicación.</small></td>\n");
      out.write("                      <td class=\"ml-auto text-white\"><small class=\"ml-auto text-white\">Hace 2 horas</small></td>\n");
      out.write("                    <tr class=\"shadow-sm \">\n");
      out.write("                      <td><i class=\"fas fa-user-circle lead mr-2\"></i></td>\n");
      out.write("                      <td><span class=\"d-block\">Cristian Palacios</span><small>Me podrías enviar la cotización de la aplicación.</small></td>\n");
      out.write("                      <td class=\"ml-auto text-white\"><small class=\"ml-auto text-white\">Hace 2 horas</small></td>\n");
      out.write("                    <tr>\n");
      out.write("                      <td colspan=\"3\"><button class=\"btn btn-outline-info text-white \"><a class=\"text-white\" href=\"E-mail.html\"><small>Ver todos los mensajes</small></a></button></td>\n");
      out.write("                    </tr>\n");
      out.write("                  </tbody>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!--message bar-->\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("          <!-- Table2 -->\n");
      out.write("          <div class=\"row mb-5\" style=\"background:\">\n");
      out.write("              <div class=\"col-lg-12\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-outline-info text-white\" data-toggle=\"modal\" data-whatever=\"Nuevo Articulo\" data-target=\"#NewModal\">Nuevo</button>\n");
      out.write("                  <div class=\"modal fade\" id=\"NewModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("                      <div class=\"modal-dialog \">\n");
      out.write("                          <div class=\"modal-content  bg-dark\">\n");
      out.write("                              <div class=\"modal-header\">\n");
      out.write("                                  <h5 class=\"modal-title text-white\" id=\"exampleModalLabel\">Nuevo</h5>\n");
      out.write("                                  <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                      <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                  </button>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"modal-body\">\n");
      out.write("                                  <!--Form de CRUD-->\n");
      out.write("                                  <form class=\"needs-validation\" method=\"POST\" enctype=\"multipart/form-data\" action=\"CArticol\" name=\"frm_new\" id=\"frmnew\" novalidate>\n");
      out.write("                                      <div class=\"form-row\">\n");
      out.write("                                          <div class=\"col-md-6 mb-3 text-white\">\n");
      out.write("                                              <label for=\"Nombre\">Nombre</label>\n");
      out.write("                                              <input type=\"text\" class=\"form-control\" id=\"Nombre\" name=\"Nombre\" required>\n");
      out.write("                                              <div class=\"valid-feedback\">\n");
      out.write("                                                  Correcto\n");
      out.write("                                              </div>\n");
      out.write("                                              <div class=\"invalid-feedback\">\n");
      out.write("                                                  Indique el nombre\n");
      out.write("                                              </div>\n");
      out.write("                                          </div>\n");
      out.write("                                          <div class=\"col-md-6 mb-3 text-white\">\n");
      out.write("                                              <label for=\"Estado\">Estado</label>\n");
      out.write("                                              <input type=\"text\" class=\"form-control\" id=\"Estado\" name=\"Estado\" required>\n");
      out.write("                                              <div class=\"invalid-feedback\">\n");
      out.write("                                                  Describa el estado del producto.\n");
      out.write("                                              </div>\n");
      out.write("                                          </div>\n");
      out.write("                                      </div>\n");
      out.write("                                      <div class=\"form-row\">\n");
      out.write("                                          <div class=\"col-md-6 mb-3 text-white\">\n");
      out.write("                                              <label for=\"Costo_Unitario\">Costo unitario</label>\n");
      out.write("                                              <input type=\"text\" class=\"form-control\" id=\"Costo_Unitario\" name=\"Costo_Unitario\" required>\n");
      out.write("                                              <div class=\"invalid-feedback\">\n");
      out.write("                                                  Indicque el costo.\n");
      out.write("                                              </div>\n");
      out.write("                                          </div>\n");
      out.write("                                          <div class=\"col-md-3 mb-3 text-white\">\n");
      out.write("                                              <label for=\"Stock\">Stock</label>\n");
      out.write("                                              <input type=\"number\" class=\"form-control\" id=\"Stock\" name=\"Stock\" required>\n");
      out.write("                                              <div class=\"invalid-feedback\">\n");
      out.write("                                                  Indique el stock.\n");
      out.write("                                              </div>\n");
      out.write("                                          </div>\n");
      out.write("                                          <div class=\"col-md-3 mb-3 text-white\">\n");
      out.write("                                              <label for=\"Stock_maximo\">Stock Maximo</label>\n");
      out.write("                                              <input type=\"number\" class=\"form-control\" id=\"Stock_maximo\" name=\"Stock_maximo\" required>\n");
      out.write("                                              <div class=\"invalid-feedback\">\n");
      out.write("                                                  Indique el stock maximo.\n");
      out.write("                                              </div>\n");
      out.write("                                          </div>\n");
      out.write("                                      </div>\n");
      out.write("                                      <button class=\"btn btn-outline-info\" value=\"BtnCrear\" id=\"btnNewArtic\" type=\"submit\">Crear</button>\n");
      out.write("                                  </form>\n");
      out.write("                                  <!--Form de CRUD-->            \n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"modal-footer\">\n");
      out.write("                                  <button function=\"\" type=\"button\" class=\"btn btn-outline-info \" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                  <button type=\"button\" class=\"btn btn-outline-info \">Enviar mensaje</button>\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"table-responsive\">\n");
      out.write("                      <table id=\"table1\" class=\"table table-striped table-bordered bg-dark text-white\">\n");
      out.write("                          <thead class=\"shorting-1\">\n");
      out.write("                              <tr class=\"cell-border\">\n");
      out.write("                                  <th>Id_Articulo</th>\n");
      out.write("                                  <th>Nombre</th>\n");
      out.write("                                  <th>Stock</th>\n");
      out.write("                                  <th>Estado</th>\n");
      out.write("                                  <th>Costo unitario</th>\n");
      out.write("                                  <th>Stock maximo</th>\n");
      out.write("                                  <th>Acciones</th>\n");
      out.write("                              </tr>\n");
      out.write("                          </thead>\n");
      out.write("                          <tbody class=\"bg-dark text-white\">\n");
      out.write("                              ");

                                  CArticulos ca = new CArticulos();
                              
      out.write("\n");
      out.write("                              ");
      out.print( ca.getViewArticol());
      out.write("        \n");
      out.write("\n");
      out.write("                         </tbody>\n");
      out.write("                      </table>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- Table2 end -->\n");
      out.write("                   \n");
      out.write("        </section>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Page Content end -->\n");
      out.write("  </div>\n");
      out.write("<!--Vue.js-->\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/vue/dist/vue.js\"></script>\n");
      out.write("  <!--then Bootstrap JS-->\n");
      out.write("  <script src=\"Boostrap/js/jquery.js\"></script>\n");
      out.write("  <script src=\"Boostrap/js/bootstrap.min.js\"></script>\n");
      out.write("  <!--Chart sj-->\n");
      out.write("  <script src=\"Chartjs\\dist\\Chart.js\"></script>\n");
      out.write("  <script src=\"assets\\js\\main.js\"></script>\n");
      out.write("  <script src=\"assets\\js\\graphics.js\"></script>\n");
      out.write("  <!--Customise scripts-->\n");
      out.write("  <script type=\"text/javascript\" src=\"Tables\\datatables.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"Tables\\dataTables.bootstrap4.js\"></script>\n");
      out.write("  <script src=\"assets/js/tables.js\"></script>\n");
      out.write("  <!--icons-->\n");
      out.write("  <script src='https://kit.fontawesome.com/a076d05399.js'></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
