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
    public boolean crearArticulo(Articulo a){
    ModeloArticulos moda=new ModeloArticulos();
    return moda.crear_articulo(a);
    
    }
}
 