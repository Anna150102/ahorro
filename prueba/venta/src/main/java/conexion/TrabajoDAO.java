/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.conexion.close;
import static conexion.conexion.getConnection;
import domain.Trabajo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anna
 */
public class TrabajoDAO {
   private static final String SQL_SELECT = "SELECT * FROM trabajo";
    private static final String SQL_INSERT = "INSERT INTO trabajo(codigoSocio, tipoEmpresa, nombreEmpresa, fechaIngreso, direccion, telefono, funcion, tipoContrato, cargo) VALUES(?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM trabajo WHERE id_trabajo = ?";

    public List<Trabajo> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Trabajo Trab = null;
        List<Trabajo>Trabs = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_trabajo = rs.getInt("id_trabajo");
                String codigoSocio = rs.getString("codigoSocio");
                 String tipoEmpresa = rs.getString("tipoEmpresa");
                  String nombreEmpresa = rs.getString("nombreEmpresa");
                   String fechaIngreso = rs.getString("fechaIngreso");
                    String direccion = rs.getString("direccion");
                     int telefono = rs.getInt("telefono");
                      String funcion = rs.getString("funcion");
                       String tipoContrato = rs.getString("tipoContrato");
                        String cargo = rs.getString("cargo");

                Trab = new Trabajo(id_trabajo, codigoSocio, tipoEmpresa, nombreEmpresa, fechaIngreso, direccion, telefono, funcion, tipoContrato, cargo);
               Trabs.add(Trab);

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
        return Trabs;
    } 
    
    public int insertar(Trabajo Trab) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, Trab.getCodigoSocio());
            stmt.setString(2, Trab.getTipoEmpresa());
            stmt.setString(3, Trab.getNombreEmpresa());
            stmt.setString(4, Trab.getFechaIngreso());
            stmt.setString(5, Trab.getDireccion());
            stmt.setInt(6, Trab.getTelefono());
            stmt.setString(7, Trab.getFuncion());
            stmt.setString(8, Trab.getTipoContrato());
             stmt.setString(9, Trab.getCargo());

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
