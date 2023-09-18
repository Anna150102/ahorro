/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author 33010
 */
public class Movimiento {

    private int codigoMov;
    private String fecha;
    private String codigoTran;
    private String codigoSocio;
    private String valor;
    private String tipo;
    private String cotizacion;

    public Movimiento(int codigoMov) {
        this.codigoMov = codigoMov;
    }

    public Movimiento() {
    }

    public Movimiento(String fecha, String codigoTran, String codigoSocio, String valor, String tipo, String cotizacion) {
        this.fecha = fecha;
        this.codigoTran = codigoTran;
        this.codigoSocio = codigoSocio;
        this.valor = valor;
        this.tipo = tipo;
        this.cotizacion = cotizacion;
    }

    public Movimiento(int codigoMov, String fecha, String codigoTran, String codigoSocio, String valor, String tipo, String cotizacion) {
        this.codigoMov = codigoMov;
        this.fecha = fecha;
        this.codigoTran = codigoTran;
        this.codigoSocio = codigoSocio;
        this.valor = valor;
        this.tipo = tipo;
        this.cotizacion = cotizacion;
    }

    public int getCodigoMov() {
        return codigoMov;
    }

    public void setCodigoMov(int codigoMov) {
        this.codigoMov = codigoMov;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigoTran() {
        return codigoTran;
    }

    public void setCodigoTran(String codigoTran) {
        this.codigoTran = codigoTran;
    }

    public String getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(String codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }
    
    
}
