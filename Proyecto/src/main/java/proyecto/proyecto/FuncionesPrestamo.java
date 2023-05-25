/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author angel
 */
public class FuncionesPrestamo implements Repositorio<Prestamos>{
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    @Override
    public Prestamos porId(int id) {
        Prestamos prestamo = null;
        String sql = "SELECT id, username, password, email FROM usuarios WHERE id=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    usuario = new Usuario(rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("id"));
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return usuario;
    }
    
    @Override
    public void guardar(Usuario t) {
        String sql = null;
        if (porId(t.getId()) != null) {
            sql = "UPDATE usuarios SET username=?,password=? , email=? WHERE id=?";
        } else {
            sql = "INSERT INTO usuarios(username, password, email) VALUES (?, md5(?), ?)";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            if (porId(t.getId()) != null) {
                stmt.setInt(4, t.getId());
            }
            stmt.setString(1, t.getUsername());
            stmt.setString(2, t.getPassword());
            stmt.setString(3, t.getEmail());
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
        String sql = "DELETE FROM usuarios WHERE id=?";
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
