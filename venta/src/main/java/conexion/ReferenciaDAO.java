/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.conexion.close;
import static conexion.conexion.getConnection;
import domain.Referencia;
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
public class ReferenciaDAO {

    private static final String SQL_SELECT = "SELECT * FROM refencia";
    private static final String SQL_INSERT = "INSERT INTO refencia(codigoSocio, tipoRefencia, nombre, nombreTrabajo, mail, telefono, observacion) VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM refencia WHERE id_referencia = ?";

    public List<Referencia> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Referencia Refe = null;
        List<Referencia> Refes = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_referencia = rs.getInt("id_Rol");
                String codigoSocio = rs.getString("codigoSocio");
                String tipoRefencia = rs.getString("tipoRefencia");
                String nombre = rs.getString("nombre");
                String nombreTrabajo = rs.getString("nombreTrabajo");
                String mail = rs.getString("mail");
                int telefono = rs.getInt("telefono");
                String observacion = rs.getString("observacion");

                Refe = new Referencia(id_referencia,codigoSocio, tipoRefencia, nombre, nombreTrabajo, mail, telefono, observacion);
                Refes.add(Refe);

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
        return Refes;
    }

 public int insertar(Referencia Refe) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, Refe.getCodigoSocio());
            stmt.setString(2, Refe.getTipoRefencia());
            stmt.setString(3, Refe.getNombre());
            stmt.setString(4, Refe.getNombreTrabajo());
            stmt.setString(5, Refe.getMail());
            stmt.setInt(6, Refe.getTelefono());
            stmt.setString(7, Refe.getObservacion());

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