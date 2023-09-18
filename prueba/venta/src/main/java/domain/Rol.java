/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Anna
 */
public class Rol {

    private int id_Rol;
    private String nombre_Rol;

    public Rol(int id_Rol, String nombre_Rol) {
        this.id_Rol = id_Rol;
        this.nombre_Rol = nombre_Rol;
    }

    public Rol(String nombre_Rol) {
        this.nombre_Rol = nombre_Rol;
    }

    public int getId_Rol() {
        return id_Rol;
    }

    public void setId_Rol(int id_Rol) {
        this.id_Rol = id_Rol;
    }

    public String getNombre_Rol() {
        return nombre_Rol;
    }

    public void setNombre_Rol(String nombre_Rol) {
        this.nombre_Rol = nombre_Rol;
    }

}
