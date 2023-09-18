/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import domain.Rol;
import java.sql.*;
import java.util.*;
import static conexion.conexion.*;

/**
 *
 * @author Anna
 */

public class RolDAO {

    private static final String SQL_SELECT = "SELECT * FROM rol";
    private static final String SQL_INSERT = "INSERT INTO rol(nombre_Rol) VALUES(?)";
    private static final String SQL_UPDATE = "UPDATE rol SET nombre_Rol= ? WHERE id_Rol = ?";
    private static final String SQL_DELETE = "DELETE FROM rol WHERE id_Rol = ?";

    public List<Rol> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Rol rol = null;
        List<Rol> roles = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_Rol = rs.getInt("id_Rol");
                String nombre_Rol = rs.getString("nombre_Rol");

                rol = new Rol(id_Rol, nombre_Rol);
                roles.add(rol);

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
        return roles;
    }

    public int insertar(Rol rol) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, rol.getNombre_Rol());

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
