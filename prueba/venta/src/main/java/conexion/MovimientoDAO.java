/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import domain.Rol;
import java.sql.*;
import java.util.*;
import static conexion.conexion.*;
import domain.Movimiento;

/**
 *
 * @author Anna
 */
public class MovimientoDAO {

    private static final String SQL_SELECT = "SELECT * FROM movimiento";
    private static final String SQL_INSERT = "INSERT INTO movimiento(fecha, codigoTran, codigoSocio, valor, tipo, cotizacion) VALUES(?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM movimiento WHERE codigoMov = ?";

    public List<Movimiento> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Movimiento Mov = null;
        List<Movimiento> Movs = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigoMov = rs.getInt("codigoMov");
                String fecha = rs.getString("fecha");
                String codigoTran = rs.getString("codigoTran");
                String codigoSocio = rs.getString("codigoSocio");
                String valor = rs.getString("valor");
                String tipo = rs.getString("tipo");
                String cotizacion = rs.getString("cotizacion");

                Mov = new Movimiento(codigoMov, fecha, codigoTran, codigoSocio, valor, tipo, cotizacion);
                Movs.add(Mov);

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
        return Movs;
    }

    public int insertar(Movimiento Mov) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, Mov.getFecha());
            stmt.setString(2, Mov.getCodigoTran());
            stmt.setString(3, Mov.getCodigoSocio());
            stmt.setString(4, Mov.getValor());
            stmt.setString(5, Mov.getTipo());
            stmt.setString(6, Mov.getCotizacion());
          

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
