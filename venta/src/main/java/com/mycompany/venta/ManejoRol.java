/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import conexion.RolDAO;
import domain.Rol;
import java.util.List;

/**
 *
 * @author david
 */
public class ManejoRol {
    RolDAO rolDao = new RolDAO();
    
    public void Insertar(String nombre_Rol){
        Rol rol = new Rol(nombre_Rol);
        rolDao.insertar(rol);
    }
    
    public List<Rol> Listar(){
        return (rolDao.seleccionar());
    }
}
