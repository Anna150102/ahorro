/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import domain.Rol;
import java.sql.*;
import java.util.*;
import static conexion.conexion.*;
import domain.Cuenta;

/**
 *
 * @author Anna
 */
public class CuentaDAO {

    private static final String SQL_SELECT = "SELECT * FROM cuenta";
    private static final String SQL_INSERT = "INSERT INTO cuenta(codigoSocio, fechaApertura, oficialCuenta, estado, saldo, fechaUltimoMov) VALUES(?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM cuenta WHERE cuentaId = ?";

    public List<Cuenta> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cuenta cuenta = null;
        List<Cuenta> cuentas = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int cuentaId = rs.getInt("cuentaId");
                String codigoSocio = rs.getString("codigoSocio");
                String fechaApertura = rs.getString("fechaApertura");
                String oficialCuenta = rs.getString("oficialCuenta");
                String estado = rs.getString("estado");
                String saldo = rs.getString("saldo");
                String fechaUltimoMov = rs.getString("fechaUltimoMov");

                cuenta = new Cuenta(cuentaId, codigoSocio, fechaApertura, oficialCuenta, estado, saldo, fechaUltimoMov);
                cuentas.add(cuenta);

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
        return cuentas;
    }

    public int insertar(Cuenta cuenta) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, cuenta.getCodigoSocio());
            stmt.setString(2, cuenta.getFechaApertura());
            stmt.setString(3, cuenta.getOficialCuenta());
            stmt.setString(4, cuenta.getEstado());
            stmt.setString(5, cuenta.getSaldo());
            stmt.setString(6, cuenta.getFechaUltimoMov());

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
