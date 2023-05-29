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
public class FuncionesCuentas implements Repositorio<Cuentas>{
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    @Override
    public Cuentas porId(String iban) {
        Cuentas cuenta = null;
        String sql = "SELECT * FROM cuentas WHERE iban=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, iban);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    cuenta = new Cuentas(rs.getString("iban"), GestionEnum.transTipoCuenta(rs.getString("tipoCuenta")), rs.getDouble("saldo"), rs.getDouble("nominaUltimo"), rs.getDouble("nominaMedAnual"));
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return cuenta;
    }
    
    @Override
    public boolean guardar(Cuentas c) {
        boolean realizado=false;//BOOLEANO PARA VENTANAS
        String sql = null;
        if (porId(c.getIban()) != null) {
            sql = "UPDATE usuarios SET iban=?, tipocuenta=?, saldo=?, nominaUltimo=?, nominaMedAnual=? WHERE iban=?";
        } else {
            sql = "INSERT INTO usuarios(iban, tipoCuenta, saldo, nominaUltimo, nominaMedAnual) VALUES (?,?,?,?,?)";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            if (porId(c.getIban()) != null) {
                stmt.setString(6, c.getIban());
            }
            stmt.setString(1, c.getIban());
            stmt.setString(2, c.getTipoCuenta().name());
            stmt.setDouble(3, c.getSaldo());
            stmt.setDouble(4, c.getNominaUltimo());
            stmt.setDouble(5, c.getNominaMedAnual());
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
    
    @Override
    public boolean eliminar(String iban) {
        boolean realizado=false;//BOOLEANO PARA VENTANAS
        String sql = "DELETE FROM cuentas WHERE iban=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, iban);
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
