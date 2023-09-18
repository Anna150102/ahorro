/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import domain.Empleado;
import java.sql.*;
import java.util.*;
import static conexion.conexion.*;

/**
 *
 * @author Anna
 */
public class EmpleadoDAO {

    private static final String SQL_SELECT = "SELECT * FROM empleado";
    private static final String SQL_INSERT = "INSERT INTO empleado(nombre, identificacion, sexo, estadoCivil, profesion, nacionalidad, fechaNacimiento, fechaIngreso, fechaSalida, mailInterno, mailPersonal) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE empleado SET nombre = ?, identificacion = ?, sexo = ?, estadoCivil = ?, profesion = ?, nacionalidad = ? , fechaNacimiento = ?, fechaIngreso = ?, fechaSalida = ?, mailInterno = ?, mailPersonal = ? WHERE id_Empleado = ?";
    private static final String SQL_DELETE = "DELETE FROM empleado WHERE id_Empleado = ?";

    public List<Empleado> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Empleado empleado = null;
        List<Empleado> empleados = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_Empleado = rs.getInt("id_Empleado");
                String nombre = rs.getString("nombre");
                String identificacion = rs.getString("identificacion");
                String sexo = rs.getString("sexo");
                String estadoCivil = rs.getString("estadoCivil");
                String profesion = rs.getString("profesion");
                String nacionalidad = rs.getString(" nacionalidad");
                String fechaNacimiento = rs.getString("fechaNacimiento");
                String fechaIngreso = rs.getString("fechaIngreso");
                String fechaSalida = rs.getString("fechaSalida");
                String mailInterno = rs.getString(" mailInterno");
                String mailPersonal = rs.getString("mailPersonal");

                empleado = new Empleado(id_Empleado, nombre, identificacion, sexo, estadoCivil, profesion, nacionalidad, fechaNacimiento, fechaIngreso, fechaSalida, mailInterno, mailPersonal);
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return empleados;
    }

    public int insertar(Empleado empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getIdentificacion());
            stmt.setString(3, empleado.getSexo());
            stmt.setString(4, empleado.getEstadoCivil());
            stmt.setString(5, empleado.getProfesion());
            stmt.setString(6, empleado.getNacionalidad());
            stmt.setString(7, empleado.getFechaNacimiento());
            stmt.setString(8, empleado.getFechaIngreso());
            stmt.setString(9, empleado.getFechaSalida());
            stmt.setString(10, empleado.getMailInterno());
            stmt.setString(11, empleado.getMailPersonal());

            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
