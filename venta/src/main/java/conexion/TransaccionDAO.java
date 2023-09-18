/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import domain.Rol;
import java.sql.*;
import java.util.*;
import static conexion.conexion.*;
import domain.Transaccion;
/**
 *
 * @author Anna
 */
public class TransaccionDAO {
  private static final String SQL_SELECT = "SELECT * FROM transaccion";
    private static final String SQL_INSERT = "INSERT INTO transaccion(descripcion) VALUES(?)";
    private static final String SQL_UPDATE = "UPDATE transaccion SET descripcion= ? WHERE codigoTran = ?";
    private static final String SQL_DELETE = "DELETE FROM transaccion WHERE codigoTran = ?";

    public List<Transaccion> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Transaccion tran = null;
        List<Transaccion> trans = new ArrayList<>();

        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigoTran = rs.getInt("codigoTran");
                String descripcion = rs.getString("descripcion");

                tran = new Transaccion(codigoTran, descripcion);
                trans.add(tran);

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
        return trans;
    }

    public int insertar(Transaccion tran) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, tran.getDescripcion());

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

