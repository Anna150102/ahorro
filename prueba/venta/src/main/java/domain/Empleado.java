/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Anna
 */
public class Empleado {

    private int id_Empleado;
    private String nombre;
    private String identificacion;
    private String sexo;
    private String estadoCivil;
    private String profesion;
    private String nacionalidad;
    private String fechaNacimiento;
    private String fechaIngreso;
    private String fechaSalida;
    private String mailInterno;
    private String mailPersonal;

    public Empleado() {
    }

    public Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public Empleado(String nombre, String identificacion, String sexo, String estadoCivil, String profesion, String nacionalidad, String fechaNacimiento, String fechaIngreso, String fechaSalida, String mailInterno, String mailPersonal) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.mailInterno = mailInterno;
        this.mailPersonal = mailPersonal;
    }

    public Empleado(int id_Empleado, String nombre, String identificacion, String sexo, String estadoCivil, String profesion, String nacionalidad, String fechaNacimiento, String fechaIngreso, String fechaSalida, String mailInterno, String mailPersonal) {
        this.id_Empleado = id_Empleado;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.mailInterno = mailInterno;
        this.mailPersonal = mailPersonal;
    }

    public int getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getMailInterno() {
        return mailInterno;
    }

    public void setMailInterno(String mailInterno) {
        this.mailInterno = mailInterno;
    }

    public String getMailPersonal() {
        return mailPersonal;
    }

    public void setMailPersonal(String mailPersonal) {
        this.mailPersonal = mailPersonal;
    }

}
