/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Anna
 */
public class Trabajo {

    private int id_trabajo;
    private String codigoSocio;
    private String tipoEmpresa;
    private String nombreEmpresa;
    private String fechaIngreso;
    private String direccion;
    private int telefono;
    private String funcion;
    private String tipoContrato;
    private String cargo;

    public Trabajo() {
    }

    public Trabajo(int id_trabajo) {
        this.id_trabajo = id_trabajo;
    }

    public Trabajo(String codigoSocio, String tipoEmpresa, String nombreEmpresa, String fechaIngreso, String direccion, int telefono, String funcion, String tipoContrato, String cargo) {
        this.codigoSocio = codigoSocio;
        this.tipoEmpresa = tipoEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaIngreso = fechaIngreso;
        this.direccion = direccion;
        this.telefono = telefono;
        this.funcion = funcion;
        this.tipoContrato = tipoContrato;
        this.cargo = cargo;
    }

    public Trabajo(int id_trabajo, String codigoSocio, String tipoEmpresa, String nombreEmpresa, String fechaIngreso, String direccion, int telefono, String funcion, String tipoContrato, String cargo) {
        this.id_trabajo = id_trabajo;
        this.codigoSocio = codigoSocio;
        this.tipoEmpresa = tipoEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaIngreso = fechaIngreso;
        this.direccion = direccion;
        this.telefono = telefono;
        this.funcion = funcion;
        this.tipoContrato = tipoContrato;
        this.cargo = cargo;
    }

    public int getId_trabajo() {
        return id_trabajo;
    }

    public void setId_trabajo(int id_trabajo) {
        this.id_trabajo = id_trabajo;
    }

    public String getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(String codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
