/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.conexion.close;
import static conexion.conexion.getConnection;
import domain.Direccion;

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
public class DireccionDAO {

    private static final String SQL_SELECT = "SELECT * FROM Direccion";
    private static final String SQL_INSERT = "INSERT INTO Direccion(codigoSocio, tipoDireccion, pais, departamento, ciudad, barrioComarca, direccionDomiciliar, tipoPropiedad) VALUES(?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM Direccion WHERE id_direccion = ?";

    public List<Direccion> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Direccion Dir = null;
        List<Direccion> Dirs = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_direccion = rs.getInt("id_direccion");
                String codigoSocio = rs.getString("codigoSocio");
                String tipoDireccion = rs.getString("tipoDireccion");
                String pais = rs.getString("pais");
                String departamento = rs.getString("departamento");
                String ciudad = rs.getString(" ciudad");
                String barrioComarca = rs.getString("telefono");
                String direccionDomiciliar = rs.getString("direccionDomiciliar");
                String tipoPropiedad = rs.getString("tipoPropiedad");

                Dir = new Direccion(id_direccion, codigoSocio, tipoDireccion, pais, departamento, ciudad, barrioComarca, direccionDomiciliar, tipoPropiedad);
                Dirs.add(Dir);

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
        return Dirs;
    }

    public int insertar(Direccion Dir) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, Dir.getCodigoSocio());
            stmt.setString(2, Dir.getTipoDireccion());
            stmt.setString(3, Dir.getPais());
            stmt.setString(4, Dir.getDepartamento());
            stmt.setString(5, Dir.getCiudad());
            stmt.setString(6, Dir.getBarrioComarca());
            stmt.setString(7, Dir.getDireccionDomiciliar());
            stmt.setString(8, Dir.getTipoPropiedad());

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
