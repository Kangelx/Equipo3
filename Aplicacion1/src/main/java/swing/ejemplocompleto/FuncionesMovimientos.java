/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing.ejemplocompleto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DAM129
 */
public class FuncionesMovimientos {
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    
    public Movimientos porId(int id) {
        Movimientos movimiento = null;
        String sql = "SELECT * FROM movimientos WHERE idOperacion=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    movimiento = new Movimientos(rs.getInt("idOperacion"), rs.getDouble("cantidad"), rs.getString("concepto"), rs.getString("uuidDestinatario"), rs.getString("uuidEmisor"), rs.getString("iban"));
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return movimiento;
    }
    
    
    public boolean guardar(Movimientos m) {
        boolean realizado=false;//BOOLEANO PARA VENTANAS
        String sql = null;

        sql = "INSERT INTO usuarios( cantidad, concepto, ibanDestinatario, ibanEmisor, iban) VALUES ( ?, ?, ?, ?, ?)";

        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            stmt.setDouble(1, m.getCantidad());
            stmt.setString(2, m.getConcepto());
            stmt.setString(3, m.getIbanDestinatario());
            stmt.setString(4, m.getIbanEmisor());
            stmt.setString(5, m.getIban());
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
        String sql = "DELETE FROM movimientos WHERE idOperacion=?";
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
    
    
}
