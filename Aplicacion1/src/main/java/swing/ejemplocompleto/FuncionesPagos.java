/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing.ejemplocompleto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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
    
    public boolean guardar(Pagos p) {
        boolean realizado=false;//BOOLEANO PARA VENTANAS
        String sql = null;
        
        sql = "INSERT INTO pagos( fecha, cantidad, idPres) VALUES (?,?,?)";

        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            stmt.setDate(1, Date.valueOf(p.getFecha()));
            stmt.setDouble(2, p.getCantidad());
            stmt.setInt(3, p.getIdPres());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado/modificado un solo registro");
            } else {
                System.out.println("Fila insertada: " + salida);
            }
            realizado=true;
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return realizado;
    }
    
    public boolean eliminar(int id) {
        boolean realizado=false;//BOOLEANO PARA VENTANAS
        String sql = "DELETE FROM pagos WHERE idPago=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha borrado un solo registro");
            }
            realizado=true;
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return realizado;
    }
    
    public List listar(String idPres) {
       List<Pagos> lista = new ArrayList();
        Pagos pago = null;
        String sql = "SELECT * FROM pagos WHERE idPres=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, idPres);
            try ( ResultSet rs = stmt.executeQuery();) {
                while (rs.next()) {
                    pago = new Pagos(rs.getInt("idPago"), rs.getDate("fecha").toLocalDate(), rs.getDouble("cantidad"), rs.getInt("idPres"));
                    lista.add(pago);
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return lista;
    }
    
    
}
