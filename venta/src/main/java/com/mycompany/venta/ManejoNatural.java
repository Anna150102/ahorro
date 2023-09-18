/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import conexion.NaturalDAO;
import domain.Natural;
import java.util.List;

/**
 *
 * @author david
 */
public class ManejoNatural {
    
    NaturalDAO naturalDao = new NaturalDAO();
    
    public void Insertar(String codigoSocio, String apellidoPaterno, String apellidoMaterno, String nombres, String nacionalidad, String profesion, String nivelEducacional, String estadoCivil, String fechaNacimiento, String tipoVivienda, String numeroDependencia, String estado, String sectorEconomico, String actividadPrincipal, String actividadSecundaria, String ocupacion){
        naturalDao.insertar(new Natural(codigoSocio, apellidoPaterno, apellidoMaterno, nombres, nacionalidad, profesion, nivelEducacional, estadoCivil, fechaNacimiento, tipoVivienda, numeroDependencia, estado, sectorEconomico, actividadPrincipal, actividadSecundaria, ocupacion));
    }
 
    public List<Natural> Listar(){
        return(naturalDao.seleccionar());
    }
}
