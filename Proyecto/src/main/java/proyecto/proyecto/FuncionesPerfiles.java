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
public class FuncionesPerfiles implements Repositorio<Perfiles>{
    
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    @Override
    public Perfiles porId(String uuid) {
        Perfiles perfil = null;
        String sql = "SELECT *  FROM usuarios WHERE uuid=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    perfil = new Perfiles(rs.getString("usuario"), rs.getString("uuid"), rs.getString("contrasena"), GestionEnum.transSitCivil(rs.getString("situacionCivil")), GestionEnum.transSitLaboral(rs.getString("situacionLaboral")), rs.getBoolean("moroso"), rs.getBoolean("procesoJudicial"), rs.getString("uuidPareja"), GestionEnum.transRegimen(rs.getString("regimen")));
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return perfil;
    }
    
    @Override
    public boolean guardar(Perfiles p) {
        boolean realizado=false;           //BOOLEANO PARA VENTANAS
        String sql = null;
        if (porId(p.getUuid()) != null) {
            sql = "UPDATE Perfiles SET usuario=?, uuid=?, contrasena=?, situacionCivil=?, situacionLaboral=?, moroso=?, procesoJudicial=?, uuidPareja=?, regimen=? WHERE uuid=?";
        } else {
            sql = "INSERT INTO Perfiles(usuario, uuid, contrasena, situacionCivil, situacionLaboral, moroso, procesoJudicial, uuidPareja, regimen) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            if (porId(p.getUuid()) != null) {
                stmt.setString(10, p.getUuid());
            }
            stmt.setString(1, p.getUsuario());
            stmt.setString(2, p.getUuid());
            stmt.setString(3, p.getContraseña());
            stmt.setString(4, p.getSituacionCivil().name());
            stmt.setString(5, p.getSituacionLaboral().name());
            stmt.setString(6, String.valueOf(p.isMoroso()));
            stmt.setString(7, String.valueOf(p.isProcesoJudicial()));
            stmt.setString(8, p.getUuidPareja());
            stmt.setString(9, p.getRegimen().name());
            
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
        boolean realizado=false;//BOOLEANO PARA VENTANAS
        String sql = "DELETE FROM perfiles WHERE uuid=?";
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
