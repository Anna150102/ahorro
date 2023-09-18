/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Anna
 */
public class Telefono {
    private int id_telefono;
    private String codigoSocio;
    private String tipoTelefono	;
    private int numero;
    private String extension;

    public Telefono() {
    }

    public Telefono(int id_telefono) {
        this.id_telefono = id_telefono;
    }

    public Telefono(String codigoSocio, String tipoTelefono, int numero, String extension) {
        this.codigoSocio = codigoSocio;
        this.tipoTelefono = tipoTelefono;
        this.numero = numero;
        this.extension = extension;
    }

    public Telefono(int id_telefono, String codigoSocio, String tipoTelefono, int numero, String extension) {
        this.id_telefono = id_telefono;
        this.codigoSocio = codigoSocio;
        this.tipoTelefono = tipoTelefono;
        this.numero = numero;
        this.extension = extension;
    }

    

    public int getId_telefono() {
        return id_telefono;
    }

    public void setId_telefono(int id_telefono) {
        this.id_telefono = id_telefono;
    }

    public String getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(String codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    
}
