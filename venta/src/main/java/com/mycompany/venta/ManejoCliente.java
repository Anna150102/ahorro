/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import conexion.PersonaDAO;
import conexion.RolDAO;
import conexion.UsuarioDAO;
import domain.Cliente;
import domain.Rol;
import domain.Usuario;
import java.util.*;

/**
 *
 * @author Anna
 */
public class ManejoCliente {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        UsuarioDAO UsuarioDao = new UsuarioDAO();
        RolDAO RolDao = new RolDAO();
      
      //insertando nuevo objeto
      
//      Cliente clienteNueva = new Cliente("Denis David", "123456");
//      personaDao.insertar(clienteNueva);
      
//Modificar cliente 
////      Cliente clientemodificar = new Cliente(2, "Josanh Alejandro", "281280999");
//      personaDao.actualizar(clientemodificar);
//      

////ELIMINAR cliente 
//     Cliente clienteeliminar = new Cliente(2);
//     personaDao.eliminar(clienteeliminar);
//// 

////insertando nuevo usuario
//Usuario usuarioNuevo = new Usuario("Josanh Alejandro", "123456", "280999", "240892","253584");
//UsuarioDao.insertar(usuarioNuevo);

//        List<Cliente> clientes = personaDao.seleccionar();
//      
//      clientes.forEach(cliente ->{System.out.println("cliente = "+ cliente);});
//    }

//insertando nuevo rol
//Rol rolNuevo = new Rol ("comun");
//RolDao.insertar(rolNuevo);

//
//List<Rol> roles = RolDao.seleccionar();
//roles.forEach(rol -> {System.out.println("Rol = "+ rolNuevo);});
}
}
