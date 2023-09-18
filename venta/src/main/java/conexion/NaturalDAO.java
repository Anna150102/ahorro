/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import domain.Natural;
import java.sql.*;
import java.util.*;
import static conexion.conexion.*;
/**
 *
 * @author Anna
 */
public class NaturalDAO {
 private static final String SQL_SELECT = "SELECT * FROM naturall";
    private static final String SQL_INSERT = "INSERT INTO naturall(codigoSocio, apellidoPaterno, apellidoMaterno, nombres, nacionalidad, profesion, nivelEducacional, estadoCivil, fechaNacimiento, tipoVivienda, numeroDependencia, estado, sectorEconomico, actividadPrincipal, actividadSecundaria, ocupacion) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM naturall WHERE id_natural = ?"; 
    
    public List<Natural> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Natural Nat = null;
        List<Natural> Nats = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_natural = rs.getInt("id_natural");
                String codigoSocio = rs.getString("codigoSocio");
                String apellidoPaterno = rs.getString("apellidoPaterno");
                String apellidoMaterno = rs.getString("apellidoMaterno");
                String  nombres = rs.getString(" nombres");
                String nacionalidad = rs.getString("nacionalidad");
                String  profesion = rs.getString(" profesion");
                String nivelEducacional = rs.getString("nivelEducacional");
                String estadoCivil = rs.getString("estadoCivil");
                String fechaNacimiento = rs.getString("fechaNacimiento");
                String tipoVivienda = rs.getString("tipoVivienda");
                String numeroDependencia = rs.getString("numeroDependencia");
                String estado = rs.getString("estado");
                String sectorEconomico = rs.getString("sectorEconomico");
                String actividadPrincipal = rs.getString("actividadPrincipal");
                String actividadSecundaria = rs.getString("actividadSecundaria");
                String ocupacion = rs.getString("ocupacion");

               Nat = new Natural(id_natural, codigoSocio, apellidoPaterno,
                       apellidoMaterno, nombres, nacionalidad, profesion, nivelEducacional,
                       estadoCivil, fechaNacimiento, tipoVivienda, numeroDependencia, estado,
                       sectorEconomico, actividadPrincipal, actividadSecundaria, ocupacion);
                Nats.add(Nat);

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
        return Nats;
    }

    public int insertar(Natural Nat) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, Nat.getCodigoSocio());
            stmt.setString(2, Nat.getApellidoPaterno());
            stmt.setString(3, Nat.getApellidoMaterno());
            stmt.setString(4, Nat.getNombres());
            stmt.setString(5, Nat.getNacionalidad());
            stmt.setString(6, Nat.getProfesion());
            stmt.setString(7, Nat.getNivelEducacional());
            stmt.setString(8, Nat.getEstadoCivil());
            stmt.setString(9, Nat.getFechaNacimiento());
            stmt.setString(10, Nat.getTipoVivienda());
            stmt.setString(11, Nat.getNumeroDependencia());
            stmt.setString(12, Nat.getEstado());
            stmt.setString(13, Nat.getSectorEconomico());
            stmt.setString(14, Nat.getActividadPrincipal());
            stmt.setString(15, Nat.getActividadSecundaria());
            stmt.setString(16, Nat.getOcupacion());
            

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


