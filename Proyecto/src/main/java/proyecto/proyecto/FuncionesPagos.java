/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author DAM129
 */
public class FuncionesPagos {
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    public Pagos porId(int id) {
        Pagos pago = null;
        String sql = "SELECT * FROM pagos WHERE idPago=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    pago =new Pagos(rs.getInt("idPago"), rs.getDate("fecha").toLocalDate(), rs.getDouble("cantidad"), rs.getInt("idPres"));
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return pago;
    }
    
    public void guardar(Pagos p) {
        String sql = null;
        if (porId(p.getIdPago()) != null) {
            sql = "UPDATE pagos SET idPago=?, fecha=?, cantidad=?, idPres=? WHERE idPago=?";
        } else {
            sql = "INSERT INTO pagos(idPago, fecha, cantidad, idPres) VALUES (?,?,?,?)";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            if (porId(p.getIdPago()) != null) {
                stmt.setInt(5, p.getIdPago());
            }
            stmt.setInt(1, p.getIdPago());
            stmt.setDate(2, Date.valueOf(p.getFecha()));
            stmt.setDouble(3, p.getCantidad());
            stmt.setInt(4, p.getIdPres());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado/modificado un solo registro");
            } else {
                System.out.println("Fila insertada: " + salida);
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void eliminar(int id) {
        String sql = "DELETE FROM pagos WHERE idPago=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha borrado un solo registro");
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
