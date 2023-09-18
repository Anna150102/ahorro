/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import conexion.TransaccionDAO;
import domain.Transaccion;
import java.util.List;

/**
 *
 * @author david
 */
public class ManejoTransaccion {
    
    TransaccionDAO newTransaccion = new TransaccionDAO();
    public void Insertar(String descripcion){
        newTransaccion.insertar(new Transaccion(descripcion));
        
    }
    
    public List<Transaccion> Listar(){
        return(newTransaccion.seleccionar());
    }
}
