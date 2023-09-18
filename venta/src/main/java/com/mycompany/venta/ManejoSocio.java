/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import conexion.SocioDAO;
import domain.Socio;
import java.util.List;

/**
 *
 * @author david
 */
public class ManejoSocio {
    SocioDAO socio = new SocioDAO();
    
    public void Insertar(String tipoId, String identificacion, String nombreUsual, String relacion, String grupoEconomico, String exoneradoImpuesto, String relacionAseguradora, String sucursalOrigen, String oficinaOrigen, String fechaIngreso, String ejecutivo){
        socio.insertar(new Socio(tipoId, identificacion, nombreUsual, relacion, grupoEconomico, exoneradoImpuesto, relacionAseguradora, sucursalOrigen, oficinaOrigen, fechaIngreso, ejecutivo));
    }
    
    public List<Socio> Listar(){
        return(socio.seleccionar());
    }
}
