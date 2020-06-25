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
            htmlcode += "   <tr>\n"
                    + "         <td>" + a.getCodigo_A() + "</td>\n"
                    + "         <td>" + a.getNombre() + "</td>\n"
                    + "         <td>" + a.getStock() + "</td>\n"
                    + "         <td>" + a.getEstado() + "</td>\n"
                    + "         <td>" + a.getCosto_Unidad() + "</td>\n"
                    + "         <td>" + a.getStock_maximo() + "</td>"
                    + "         <td>\n"
                    + "         <button type=\"button\" class=\"btn btn-outline-info text-white\" data-toggle=\"modal\" data-target=\"#EditModal\">Editar</button>\n"
                    + "         <button type=\"button\" class=\"btn btn-outline-info text-white\">Eliminar</button>\n"
                    + "         </td>"
                    + "     </tr>";
        }

        return htmlcode;
    }
    
    
    /*
    public boolean deletArtic(){
    
        
        
    }*/
}

