/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author 33010
 */
public class Cuenta {
    private int cuentaId ;
    private String codigoSocio;
    private String fechaApertura;
    private String oficialCuenta;
    private String estado;
    private String saldo;
    private String fechaUltimoMov;

    public Cuenta() {
    }

    public Cuenta(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public Cuenta(String codigoSocio, String fechaApertura, String oficialCuenta, String estado, String saldo, String fechaUltimoMov) {
        this.codigoSocio = codigoSocio;
        this.fechaApertura = fechaApertura;
        this.oficialCuenta = oficialCuenta;
        this.estado = estado;
        this.saldo = saldo;
        this.fechaUltimoMov = fechaUltimoMov;
    }

    public Cuenta(int cuentaId, String codigoSocio, String fechaApertura, String oficialCuenta, String estado, String saldo, String fechaUltimoMov) {
        this.cuentaId = cuentaId;
        this.codigoSocio = codigoSocio;
        this.fechaApertura = fechaApertura;
        this.oficialCuenta = oficialCuenta;
        this.estado = estado;
        this.saldo = saldo;
        this.fechaUltimoMov = fechaUltimoMov;
    }

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(String codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getOficialCuenta() {
        return oficialCuenta;
    }

    public void setOficialCuenta(String oficialCuenta) {
        this.oficialCuenta = oficialCuenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getFechaUltimoMov() {
        return fechaUltimoMov;
    }

    public void setFechaUltimoMov(String fechaUltimoMov) {
        this.fechaUltimoMov = fechaUltimoMov;
    }
    
    
    
}
