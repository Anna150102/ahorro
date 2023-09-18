/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Anna
 */
public class Socio {

    private int codigoSocio;
    private String tipoId;
    private String identificacion;
    private String nombreUsual;
    private String relacion;
    private String grupoEconomico;
    private String exoneradoImpuesto;
    private String relacionAseguradora;
    private String sucursalOrigen;
    private String oficinaOrigen;
    private String fechaIngreso;
    private String ejecutivo;

    public Socio() {
    }

    public Socio(int codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public Socio(String tipoId, String identificacion, String nombreUsual, String relacion, String grupoEconomico, String exoneradoImpuesto, String relacionAseguradora, String sucursalOrigen, String oficinaOrigen, String fechaIngreso, String ejecutivo) {
        this.tipoId = tipoId;
        this.identificacion = identificacion;
        this.nombreUsual = nombreUsual;
        this.relacion = relacion;
        this.grupoEconomico = grupoEconomico;
        this.exoneradoImpuesto = exoneradoImpuesto;
        this.relacionAseguradora = relacionAseguradora;
        this.sucursalOrigen = sucursalOrigen;
        this.oficinaOrigen = oficinaOrigen;
        this.fechaIngreso = fechaIngreso;
        this.ejecutivo = ejecutivo;
    }

    public Socio(int codigoSocio, String tipoId, String identificacion, String nombreUsual, String relacion, String grupoEconomico, String exoneradoImpuesto, String relacionAseguradora, String sucursalOrigen, String oficinaOrigen, String fechaIngreso, String ejecutivo) {
        this.codigoSocio = codigoSocio;
        this.tipoId = tipoId;
        this.identificacion = identificacion;
        this.nombreUsual = nombreUsual;
        this.relacion = relacion;
        this.grupoEconomico = grupoEconomico;
        this.exoneradoImpuesto = exoneradoImpuesto;
        this.relacionAseguradora = relacionAseguradora;
        this.sucursalOrigen = sucursalOrigen;
        this.oficinaOrigen = oficinaOrigen;
        this.fechaIngreso = fechaIngreso;
        this.ejecutivo = ejecutivo;
    }

    public int getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(int codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreUsual() {
        return nombreUsual;
    }

    public void setNombreUsual(String nombreUsual) {
        this.nombreUsual = nombreUsual;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getGrupoEconomico() {
        return grupoEconomico;
    }

    public void setGrupoEconomico(String grupoEconomico) {
        this.grupoEconomico = grupoEconomico;
    }

    public String getExoneradoImpuesto() {
        return exoneradoImpuesto;
    }

    public void setExoneradoImpuesto(String exoneradoImpuesto) {
        this.exoneradoImpuesto = exoneradoImpuesto;
    }

    public String getRelacionAseguradora() {
        return relacionAseguradora;
    }

    public void setRelacionAseguradora(String relacionAseguradora) {
        this.relacionAseguradora = relacionAseguradora;
    }

    public String getSucursalOrigen() {
        return sucursalOrigen;
    }

    public void setSucursalOrigen(String sucursalOrigen) {
        this.sucursalOrigen = sucursalOrigen;
    }

    public String getOficinaOrigen() {
        return oficinaOrigen;
    }

    public void setOficinaOrigen(String oficinaOrigen) {
        this.oficinaOrigen = oficinaOrigen;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(String ejecutivo) {
        this.ejecutivo = ejecutivo;
    }
    
    
}
