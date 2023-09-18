/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Anna
 */
public class Direccion {
    private int id_direccion;
    private String codigoSocio;
    private String tipoDireccion;
    private String pais;
    private String departamento;
    private String ciudad;
    private String barrioComarca;
    private String direccionDomiciliar;
    private String tipoPropiedad;

    public Direccion() {
    }

    public Direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public Direccion(String codigoSocio, String tipoDireccion, String pais, String departamento, String ciudad, String barrioComarca, String direccionDomiciliar, String tipoPropiedad) {
        this.codigoSocio = codigoSocio;
        this.tipoDireccion = tipoDireccion;
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.barrioComarca = barrioComarca;
        this.direccionDomiciliar = direccionDomiciliar;
        this.tipoPropiedad = tipoPropiedad;
    }

    public Direccion(int id_direccion, String codigoSocio, String tipoDireccion, String pais, String departamento, String ciudad, String barrioComarca, String direccionDomiciliar, String tipoPropiedad) {
        this.id_direccion = id_direccion;
        this.codigoSocio = codigoSocio;
        this.tipoDireccion = tipoDireccion;
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.barrioComarca = barrioComarca;
        this.direccionDomiciliar = direccionDomiciliar;
        this.tipoPropiedad = tipoPropiedad;
    }

    public Direccion(int id_trabajo, String codigoSocio, String tipoEmpresa, String nombreEmpresa, String fechaIngreso, String direccion, int telefono, String funcion, String tipoContrato, String cargo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(String codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(String tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrioComarca() {
        return barrioComarca;
    }

    public void setBarrioComarca(String barrioComarca) {
        this.barrioComarca = barrioComarca;
    }

    public String getDireccionDomiciliar() {
        return direccionDomiciliar;
    }

    public void setDireccionDomiciliar(String direccionDomiciliar) {
        this.direccionDomiciliar = direccionDomiciliar;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }
    
    
    
}
