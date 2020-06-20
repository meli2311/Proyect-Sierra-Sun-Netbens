/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Include.Articulo;
import java.sql.PreparedStatement;


public class ModeloArticulos extends Conexion {

    public boolean crear_articulo(Articulo a) {
        PreparedStatement pst=null;
        boolean flag = false;
        try {
            String sql = "call insArtic(?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, a.getNombre());
            pst.setInt(2, a.getStock());
            pst.setString(3, a.getEstado());
            pst.setInt(4, a.getCosto_Unidad());
            pst.setInt(5, a.getStock_maximo());
            
            if (pst.executeUpdate() == 1) {
                flag=true;
            }
        } catch (Exception e) {
            
        }finally{
            try {
                if (getConnection() != null) getConnection().close();
                if (pst != null)  pst.close();
            } catch (Exception e) {
            }
        }

        return flag;
    }
    
    public static void main(String[] args) {
        ModeloArticulos mp=new ModeloArticulos();
        System.out.println(mp.crear_articulo(new Articulo(0, "aca nombre", 0, "aca estado", 0, 0)));
        
    }
}
