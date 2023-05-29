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
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author DAM129
 */
public class FuncionesMovimientos {
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    
    public Movimientos porId(String iban) {
        Movimientos movimiento = null;
        String sql = "SELECT * FROM movimientos WHERE iban=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, iban);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    movimiento = new Movimientos(rs.getInt("idOperacion"), rs.getDouble("cantidad"), rs.getString("concepto"), rs.getString("ibanDestinatario"), rs.getString("ibanEmisor"), rs.getString("iban"), rs.getDate("fecha").toLocalDate());
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
        sql = "INSERT INTO movimientos( cantidad, concepto, ibanDestinatario, ibanEmisor, iban, fecha) VALUES ( ?, ?, ?, ?, ?, ?)";

        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            stmt.setDouble(1, m.getCantidad());
            stmt.setString(2, m.getConcepto());
            stmt.setString(3, m.getIbanDestinatario());
            stmt.setString(4, m.getIbanEmisor());
            stmt.setString(5, m.getIban());
            stmt.setDate(6, Date.valueOf(m.getFecha()));
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
