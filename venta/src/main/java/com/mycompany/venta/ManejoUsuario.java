/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import conexion.UsuarioDAO;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author david
 */
public class ManejoUsuario {
    UsuarioDAO usuarioDao = new UsuarioDAO();
    
    public void Insertar(String user, String clave, String codigo_empl, String fechainicio, String fechafin){
        Usuario usuario = new Usuario(user, clave, codigo_empl, fechainicio, fechafin);
        usuarioDao.insertar(usuario);
    }
    
    public List<Usuario> Listar(){
        return(usuarioDao.seleccionar());
    }
    
    public void Eliminar(int id){
       Usuario user = new Usuario();
       user.setId_usuarios(id);
       usuarioDao.eliminar(user);
    }
}
