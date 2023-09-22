/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author 33010
 */
public class Transaccion {
     private int codigoTran;
    private String descripcion;

    public Transaccion() {
    }

    public Transaccion(int codigoTran) {
        this.codigoTran = codigoTran;
    }

    public Transaccion(int codigoTran, String descripcion) {
        this.codigoTran = codigoTran;
        this.descripcion = descripcion;
    }

    public Transaccion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigoTran() {
        return codigoTran;
    }

    public void setCodigoTran(int codigoTran) {
        this.codigoTran = codigoTran;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
