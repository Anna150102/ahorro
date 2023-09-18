/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import conexion.EmpleadoDAO;
import domain.Empleado;
import java.util.List;

/**
 *
 * @author david
 */
public class ManejoEmpleado {
    EmpleadoDAO empleadoDao = new EmpleadoDAO();
    
    public void Insertar(String nombre, String identificacion, String sexo, String estadoCivil, String profesion, String nacionalidad, String fechaNacimiento, String fechaIngreso, String fechaSalida, String mailInterno, String mailPersonal){
        Empleado empleadoNuevo = new Empleado(nombre, identificacion, sexo, estadoCivil, profesion, nacionalidad, fechaNacimiento, fechaIngreso, fechaSalida, mailInterno, mailPersonal);
        empleadoDao.insertar(empleadoNuevo);
    }
    
    public List<Empleado> Listar(){
        return(empleadoDao.seleccionar());
    }
}
