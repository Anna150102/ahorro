/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import domain.Usuario;
import java.sql.*;
import java.util.*;
import static conexion.conexion.*;

/**
 *
 * @author Anna
 */
public class UsuarioDAO {

    private static final String SQL_SELECT = "SELECT * FROM usuarios";
    private static final String SQL_INSERT = "INSERT INTO usuarios (user, clave, codigo_empl, fechainicio, fechafin) VALUES(?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE usuarios SET user = ?, clave = ?, codigo_empl WHERE id_usuarios = ?";
    private static final String SQL_DELETE = "DELETE FROM usuarios WHERE id_usuarios = ?";

    public List<Usuario> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_usuarios = rs.getInt("id_usuarios");
                String user = rs.getString("user");
                String clave = rs.getString("clave");
                String codigo_empl = rs.getString("codigo_empl");
                String fechainicio = rs.getString("fechainicio");
                String fechafin = rs.getString("fechafin");

                usuario = new Usuario(id_usuarios, user, clave, codigo_empl, fechainicio, fechafin);
                usuarios.add(usuario);

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
        return usuarios;
    }

    public int insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getClave());
            stmt.setString(3, usuario.getCodigo_empl());
            stmt.setString(4, usuario.getFechainicio());
            stmt.setString(5, usuario.getFechafin());

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

    public int actualizar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getClave());
            stmt.setString(3, usuario.getCodigo_empl());
            stmt.setInt(4, usuario.getId_usuarios());
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

    public int eliminar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setInt(1, usuario.getId_usuarios());
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
