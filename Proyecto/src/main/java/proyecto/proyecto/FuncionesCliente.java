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
 * @author angel
 */
public class FuncionesCliente implements Repositorio<Cliente>{
    
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    @Override
    public Cliente porId(int id) {
        Cliente cliente = null;
        String sql = "SELECT uuid, dni, localidad, direccion, nombre, apellidos, telefono, fechaNacimiento FROM cliente WHERE uuid=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    cliente = new Cliente(rs.getInt("uuid"), rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("telefono"), rs.getString("direccion"), rs.getString("localidad"), rs.getDate(sql).toLocalDate());
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return cliente;
    }
    
    @Override
    public void guardar(Cliente c) {
        String sql = null;
        if (porId(c.getId()) != null) {
            sql = "UPDATE cliente SET dni=?,localidad=? , fechaNacimiento=? , apellidos=?, nombre=?, telefono=?, direccion=? WHERE uuid=?";
        } else {
            sql = "INSERT INTO cliente(dni, localidad, fechaNacimiento, apellidos, nombre, telefono, direccion) VALUES (?,?,?,?,?,?,?)";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            if (porId(c.getId()) != null) {
                stmt.setInt(8, c.getId());
            }
            
            stmt.setString(1, c.getDni());
            stmt.setString(2, c.getLocalidad());
            stmt.setDate(3, Date.valueOf(c.getFechanac()));
            stmt.setString(4, c.getApellidos());
            stmt.setString(5, c.getNombre());
            stmt.setString(6, c.getTelefono());
            stmt.setString(7, c.getDireccion());
            
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
    
    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM cliente WHERE uuid=?";
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
