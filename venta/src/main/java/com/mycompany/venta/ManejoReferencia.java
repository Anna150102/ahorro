/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import conexion.ReferenciaDAO;
import domain.Referencia;
import java.util.List;

/**
 *
 * @author david
 */
public class ManejoReferencia {
    
    ReferenciaDAO newReferencia = new ReferenciaDAO();
    
    public void Insertar(String codigoSocio, String tipoRefencia, String nombre, String nombreTrabajo, String mail, int telefono, String observacion){
        newReferencia.insertar(new Referencia(codigoSocio, tipoRefencia,  nombre,  nombreTrabajo,  mail,telefono,  observacion));
    }
    
    public List<Referencia> Listar(){
        return(newReferencia.seleccionar());
    }
}
