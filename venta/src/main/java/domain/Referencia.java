/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Anna 
 */
public class Referencia {

    private int id_referencia;
    private String codigoSocio;
    private String tipoRefencia;
    private String nombre;
    private String nombreTrabajo;
    private String mail;
    private int telefono;
    private String observacion;

    public Referencia() {
    }

    public Referencia(int id_referencia) {
        this.id_referencia = id_referencia;
    }

    public Referencia(String codigoSocio, String tipoRefencia, String nombre, String nombreTrabajo, String mail, int telefono, String observacion) {
        this.codigoSocio = codigoSocio;
        this.tipoRefencia = tipoRefencia;
        this.nombre = nombre;
        this.nombreTrabajo = nombreTrabajo;
        this.mail = mail;
        this.telefono = telefono;
        this.observacion = observacion;
    }

    public Referencia(int id_referencia, String codigoSocio, String tipoRefencia, String nombre, String nombreTrabajo, String mail, int telefono, String observacion) {
        this.id_referencia = id_referencia;
        this.codigoSocio = codigoSocio;
        this.tipoRefencia = tipoRefencia;
        this.nombre = nombre;
        this.nombreTrabajo = nombreTrabajo;
        this.mail = mail;
        this.telefono = telefono;
        this.observacion = observacion;
    }

    public int getId_referencia() {
        return id_referencia;
    }

    public void setId_referencia(int id_referencia) {
        this.id_referencia = id_referencia;
    }

    public String getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(String codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getTipoRefencia() {
        return tipoRefencia;
    }

    public void setTipoRefencia(String tipoRefencia) {
        this.tipoRefencia = tipoRefencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
}
