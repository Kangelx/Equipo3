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


/**
 *
 * @author angel
 */
public class FuncionesClientes implements Repositorio<Clientes>{
    
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    @Override
    public Clientes porId(String uuid) {
        Clientes cliente = null;
        String sql = "SELECT uuid, dni, nombre, apellidos, telefono, direccion, localidad, fechaNac, iban FROM clientes WHERE uuid=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    cliente = new Clientes(rs.getString("uuid"), rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("telefono"), rs.getString("direccion"), rs.getString("localidad"), rs.getDate("fechaNac").toLocalDate(), rs.getString("iban"));
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return cliente;
    }
    
    @Override
    public boolean guardar(Clientes c) {
        boolean realizado=true;         //BOOLEANO PARA VENTANAS
        String sql = null;
        if (porId(c.getUuid() )!= null) {
            sql = "UPDATE clientes SET uuid=?, dni=?, nombre=?, apellidos=?, telefono=?, direccion=?, localidad=?, fechaNac=?, iban=? WHERE uuid=?";
        } else {
            sql = "INSERT INTO clientes(uuid, dni, nombre, apellidos, telefono, direccion, localidad, fechaNac, iban) VALUES (?,?,?,?,?,?,?,?,?)";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            if (porId(c.getUuid()) != null) {
                stmt.setString(10, c.getUuid());
            }
            
            stmt.setString(1, c.getUuid());
            stmt.setString(2, c.getDni());
            stmt.setString(3, c.getNombre());
            stmt.setString(4, c.getApellidos());
            stmt.setString(5, c.getTelefono());
            stmt.setString(6, c.getDireccion());
            stmt.setString(7, c.getLocalidad());
            stmt.setDate(8, Date.valueOf(c.getFechaNac()));
            stmt.setString(9, c.getIban());
            
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
    public boolean eliminar(String uuid) {
        boolean realizado=false;        //BOOLEANO VENTANAS
        String sql = "DELETE FROM clientes WHERE uuid=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
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
