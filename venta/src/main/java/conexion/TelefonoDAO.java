/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.conexion.close;
import static conexion.conexion.getConnection;
import domain.Telefono;
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
public class TelefonoDAO {

    private static final String SQL_SELECT = "SELECT * FROM telefono";
    private static final String SQL_INSERT = "INSERT INTO telefono(codigoSocio, tipoTelefono, numero, extension) VALUES(?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM telefono WHERE id_telefono = ?";
    
     public List<Telefono> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Telefono Tel = null;
        List<Telefono> Tels = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_telefono = rs.getInt("id_telefono");
                String codigoSocio = rs.getString("codigoSocio");
                String tipoTelefono = rs.getString("tipoTelefono");
                int numero = rs.getInt("numero");
                String extension = rs.getString("extension");

                Tel = new Telefono(id_telefono,codigoSocio, tipoTelefono, numero, extension);
               Tels.add(Tel);

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
        return Tels;
    }

    public int insertar(Telefono Tel) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, Tel.getCodigoSocio());
            stmt.setString(2, Tel.getTipoTelefono());
            stmt.setInt(3, Tel.getNumero());
            stmt.setString(4, Tel.getExtension());
            

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

