/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import conexion.TrabajoDAO;
import domain.Trabajo;
import java.util.List;

/**
 *
 * @author david
 */
public class ManejoTrabajo {
    TrabajoDAO trabajo = new TrabajoDAO();
    
    public void Insertar(String codigoSocio, String tipoEmpresa, String nombreEmpresa, String fechaIngreso, String direccion, int telefono, String funcion, String tipoContrato, String cargo){
        trabajo.insertar(new Trabajo(codigoSocio, tipoEmpresa, nombreEmpresa, fechaIngreso, direccion, telefono, funcion, tipoContrato, cargo));
    }
    
    public List<Trabajo> Listar(){
        return(trabajo.seleccionar());
    }
}
