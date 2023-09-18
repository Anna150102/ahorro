/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Anna
 * 
 */
public class Natural {

    private int id_natural ;
    private String codigoSocio;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String nacionalidad;
    private String profesion;
    private String nivelEducacional;
    private String estadoCivil;
    private String fechaNacimiento;
    private String tipoVivienda;
    private String numeroDependencia;
    private String estado;
    private String sectorEconomico;
    private String actividadPrincipal;
    private String actividadSecundaria;
    private String ocupacion;

    public Natural() {
    }

    public Natural(int id_natural) {
        this.id_natural = id_natural;
    }

    public Natural(String codigoSocio, String apellidoPaterno, String apellidoMaterno, String nombres, String nacionalidad, String profesion, String nivelEducacional, String estadoCivil, String fechaNacimiento, String tipoVivienda, String numeroDependencia, String estado, String sectorEconomico, String actividadPrincipal, String actividadSecundaria, String ocupacion) {
        this.codigoSocio = codigoSocio;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.nacionalidad = nacionalidad;
        this.profesion = profesion;
        this.nivelEducacional = nivelEducacional;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoVivienda = tipoVivienda;
        this.numeroDependencia = numeroDependencia;
        this.estado = estado;
        this.sectorEconomico = sectorEconomico;
        this.actividadPrincipal = actividadPrincipal;
        this.actividadSecundaria = actividadSecundaria;
        this.ocupacion = ocupacion;
    }

    public Natural(int id_natural, String codigoSocio, String apellidoPaterno, String apellidoMaterno, String nombres, String nacionalidad, String profesion, String nivelEducacional, String estadoCivil, String fechaNacimiento, String tipoVivienda, String numeroDependencia, String estado, String sectorEconomico, String actividadPrincipal, String actividadSecundaria, String ocupacion) {
        this.id_natural = id_natural;
        this.codigoSocio = codigoSocio;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.nacionalidad = nacionalidad;
        this.profesion = profesion;
        this.nivelEducacional = nivelEducacional;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoVivienda = tipoVivienda;
        this.numeroDependencia = numeroDependencia;
        this.estado = estado;
        this.sectorEconomico = sectorEconomico;
        this.actividadPrincipal = actividadPrincipal;
        this.actividadSecundaria = actividadSecundaria;
        this.ocupacion = ocupacion;
    }

    public int getId_natural() {
        return id_natural;
    }

    public void setId_natural(int id_natural) {
        this.id_natural = id_natural;
    }

    public String getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(String codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNivelEducacional() {
        return nivelEducacional;
    }

    public void setNivelEducacional(String nivelEducacional) {
        this.nivelEducacional = nivelEducacional;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public String getNumeroDependencia() {
        return numeroDependencia;
    }

    public void setNumeroDependencia(String numeroDependencia) {
        this.numeroDependencia = numeroDependencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public String getActividadPrincipal() {
        return actividadPrincipal;
    }

    public void setActividadPrincipal(String actividadPrincipal) {
        this.actividadPrincipal = actividadPrincipal;
    }

    public String getActividadSecundaria() {
        return actividadSecundaria;
    }

    public void setActividadSecundaria(String actividadSecundaria) {
        this.actividadSecundaria = actividadSecundaria;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    

}
