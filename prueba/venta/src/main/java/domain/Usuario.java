/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Anna
 */
public class Usuario {

    private int id_usuarios;
    private String user;
    private String clave;
    private String codigo_empl;
    private String fechainicio;
    private String fechafin;

    public Usuario(int id_usuarios, String user, String clave, String codigo_empl) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Usuario(String user, String clave, String codigo_empl, String fechainicio, String fechafin) {
        this.user = user;
        this.clave = clave;
        this.codigo_empl = codigo_empl;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuarios=" + id_usuarios + ", user=" + user + ", clave=" + clave + ", codigo_empl=" + codigo_empl + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + '}';
    }

    public Usuario(String user, String clave, String codigo_empl) {
        this.user = user;
        this.clave = clave;
        this.codigo_empl = codigo_empl;
    }

    public Usuario(int id_usuarios, String user, String clave, String codigo_empl, String fechainicio, String fechafin) {
        this.id_usuarios = id_usuarios;
        this.user = user;
        this.clave = clave;
        this.codigo_empl = codigo_empl;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public Usuario() {
    }

    public int getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCodigo_empl() {
        return codigo_empl;
    }

    public void setCodigo_empl(String codigo_empl) {
        this.codigo_empl = codigo_empl;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public void add(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
