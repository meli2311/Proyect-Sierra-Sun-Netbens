/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Include.Articulo;
import Modelo.ModeloArticulos;

/**
 *
 * @author Renzo
 */
public class CArticulos {

    public boolean crearArticulo(Articulo a) {
        ModeloArticulos moda = new ModeloArticulos();
        return moda.crear_articulo(a);

    }

    public String getViewArticol() {
        String htmlcode = "";

        ModeloArticulos modeArt = new ModeloArticulos();

        for (Articulo a : modeArt.getAllArtic()) {
            htmlcode += "                     <tr>\n"
                    + "                      <td>" + a.getCodigo_A() + "</td>\n"
                    + "                      <td>" + a.getNombre() + "</td>\n"
                    + "                      <td>" + a.getStock() + "</td>\n"
                    + "                      <td>" + a.getEstado() + "</td>\n"
                    + "                      <td>" + a.getCosto_Unidad() + "</td>\n"
                    + "                      <td>" + a.getStock_maximo() + "</td>"
                    + "                      <td>\n"
                    + "                        <button type=\"button\" class=\"btn btn-outline-info text-white\" data-toggle=\"modal\" data-target=\"#EditModal\">Editar</button>\n"
                    + "                        <div class=\"modal fade\" id=\"EditModal\" tabindex=\"-1\" role=\"dialog\">\n"
                    + "                          <div class=\"modal-dialog \">\n"
                    + "                            <div class=\"modal-content  bg-dark\">\n"
                    + "                              <div class=\"modal-header\">\n"
                    + "                                <h5 class=\"modal-title text-white\" id=\"exampleModalLabel\">Editar</h5>\n"
                    + "                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n"
                    + "                                  <span aria-hidden=\"true\">&times;</span>\n"
                    + "                                </button>\n"
                    + "                              </div>\n"
                    + "                              <div class=\"modal-body\">\n"
                    + "                                <form class=\"needs-validation text-white\" novalidate>\n"
                    + "                                  <div class=\"form-row\">\n"
                    + "                                    <div class=\"col-md-6 mb-3\">\n"
                    + "                                      <label for=\"validationCustom01\">Nombre del Articulo</label>\n"
                    + "                                      <input type=\"text\" class=\"form-control\" id=\"Nombres\" name=\"Nombre\" required>\n"
                    + "                                      <div class=\"valid-feedback\">\n"
                    + "                                        Correcto\n"
                    + "                                      </div>\n"
                    + "                                      <div class=\"invalid-feedback\">\n"
                    + "                                        Indique el nombre\n"
                    + "                                      </div>\n"
                    + "                                    </div>\n"
                    + "                                    <div class=\"col-md-6 mb-3\">\n"
                    + "                                      <label for=\"validationCustom03\">Estado</label>\n"
                    + "                                      <input type=\"text\" class=\"form-control\" id=\"Estados\" name=\"Estado\" required>\n"
                    + "                                      <div class=\"invalid-feedback\">\n"
                    + "                                        Describa el estado del producto.\n"
                    + "                                      </div>\n"
                    + "                                    </div>\n"
                    + "                                  </div>\n"
                    + "                                  <div class=\"form-row\">\n"
                    + "                                    <div class=\"col-md-6 mb-3\">\n"
                    + "                                      <label for=\"validationCustom03\">Costo unitario</label>\n"
                    + "                                      <input type=\"text\" class=\"form-control\" id=\"Costos_Unidad\" name=\"Costo_Unidad\" required>\n"
                    + "                                      <div class=\"invalid-feedback\">\n"
                    + "                                        Indicque el costo.\n"
                    + "                                      </div>\n"
                    + "                                    </div>\n"
                    + "                                    <div class=\"col-md-3 mb-3\">\n"
                    + "                                      <label for=\"validationCustom04\">Stock</label>\n"
                    + "                                      <select class=\"custom-select\" id=\"Stocks\" name=\"Stock\" required>\n"
                    + "                                        <option selected disabled value=\"\">Elegir</option>\n"
                    + "                                        <%for (int i = 1; i <= 1000; i++) {%>"
                    + "                                        <option selected value=\"<%= i%>\"><%= i%></option>\n"
                    + "                                        <%}%>\n"
                    + "                                      </select>\n"
                    + "                                      <div class=\"invalid-feedback\">\n"
                    + "                                        Indique el stock.\n"
                    + "                                      </div>\n"
                    + "                                    </div>\n"
                    + "                                    <div class=\"col-md-3 mb-3\">\n"
                    + "                                      <label for=\"validationCustom04\">Stock Maximo</label>\n"
                    + "                                      <select class=\"custom-select\" id=\"Stocks_maximo\" name=\"Stock_maximo\" required>\n"
                    + "                                        <option selected disabled value=\"\">Elegir</option>\n"
                    + "                                        <%for (int i = 1; i <= 1000; i++) {%>"
                    + "                                        <option selected value=\"<%= i%>\"><%= i%></option>\n"
                    + "                                        <%}%>\n"
                    + "                                      </select>\n"
                    + "                                      <div class=\"invalid-feedback\">\n"
                    + "                                        Indique el stock maximo.\n"
                    + "                                      </div>\n"
                    + "                                    </div>\n"
                    + "                                  </div>\n"
                    + "                                  <button class=\"btn btn-outline-info \" type=\"submit\">Actualizar</button>\n"
                    + "                                </form>\n"
                    + "                              </div>\n"
                    + "                              <div class=\"modal-footer\">\n"
                    + "                                <button type=\"button\" class=\"btn btn-outline-info \" data-dismiss=\"modal\">Cerrar</button>\n"
                    + "                                <button type=\"button\" class=\"btn btn-outline-info \">Enviar mensaje</button>\n"
                    + "                              </div>\n"
                    + "                            </div>\n"
                    + "                          </div>\n"
                    + "                        </div>\n"
                    + "                       <button type=\"button\" class=\"btn btn-outline-info text-white\">Eliminar</button>\n"
                    + "                      </td>"
                    + "                   </tr>";
        }

        return htmlcode;
    }
}

