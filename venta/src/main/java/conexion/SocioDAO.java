/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import domain.Socio;
import java.sql.*;
import java.util.*;
import static conexion.conexion.*;

/**
 *
 * @author Anna
 */
public class SocioDAO {

    private static final String SQL_SELECT = "SELECT * FROM socio";
    private static final String SQL_INSERT = "INSERT INTO socio(tipoId, identificacion, nombreUsual, relacion, grupoEconomico, exoneradoImpuesto, relacionAseguradora, sucursalOrigen, oficinaOrigen, fechaIngreso, ejecutivo) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM socio WHERE codigoSocio = ?";

    public List<Socio> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Socio Soc = null;
        List<Socio> Socs = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigoSocio = rs.getInt("codigoSocio");
                String tipoId = rs.getString("tipoId");
                String identificacion = rs.getString("identificacion");
                String nombreUsual = rs.getString("nombreUsual");
                String  relacion = rs.getString("relacion");
                String grupoEconomico = rs.getString("grupoEconomico");
                String exoneradoImpuesto = rs.getString("exoneradoImpuesto");
                String relacionAseguradora = rs.getString("relacionAseguradora");
                String sucursalOrigen = rs.getString("sucursalOrigen");
                String oficinaOrigen = rs.getString("oficinaOrigen");
                String fechaIngreso = rs.getString("fechaIngreso");
                String ejecutivo = rs.getString("ejecutivo");

                Soc = new Socio(codigoSocio, tipoId, identificacion, nombreUsual,
                        relacion, grupoEconomico, exoneradoImpuesto, relacionAseguradora, 
                        sucursalOrigen, oficinaOrigen, fechaIngreso, ejecutivo);
                Socs.add(Soc);

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
        return Socs;
    }

    public int insertar(Socio Soc) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, Soc.getTipoId());
            stmt.setString(2, Soc.getIdentificacion());
            stmt.setString(3, Soc.getNombreUsual());
            stmt.setString(4, Soc.getRelacion());
            stmt.setString(5, Soc.getGrupoEconomico());
            stmt.setString(6, Soc.getExoneradoImpuesto());
            stmt.setString(7, Soc.getRelacionAseguradora());
            stmt.setString(8, Soc.getSucursalOrigen());
            stmt.setString(9, Soc.getOficinaOrigen());
            stmt.setString(10, Soc.getFechaIngreso());
            stmt.setString(11, Soc.getEjecutivo());

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
