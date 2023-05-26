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
public class FuncionesPrestamo implements Repositorio<Prestamos>{
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    @Override
    public Prestamos porId(String uuid) {
        Prestamos prestamo = null;
        String sql = "SELECT * FROM prestamos WHERE uuid=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    prestamo = new Prestamos(rs.getInt("idPres"), rs.getInt("periodo"), rs.getDate("fechaOfer").toLocalDate(), rs.getInt("plazo"), rs.getDouble("interes"), rs.getDouble("cantidad"), rs.getDate("fechaFirma").toLocalDate(), rs.getDouble("cantMens"), rs.getString("uuid"));
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return prestamo;
    }
    
    @Override
    public boolean guardar(Prestamos p) {
        boolean realizado=false;//BOOLEANO PARA VENTANAS
        String sql = null;
        if (porId(p.getUuid()) != null) {
            sql = "UPDATE prestamos SET idPres=?, periodo=?, fechaOfer=?, plazo=?, interes=?, cantidad=?, fechafirma=?, cantMens=?, uuid=? WHERE uuid=?";
        } else {
            sql = "INSERT INTO prestamos(idPres, periodo, fechaOfer, plazo, interes, cantidad, fecaFirma, cantMens, uuid) VALUES (?, ? , ? , ? , ? , ? , ? , ? , ? )";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            if (porId(p.getUuid()) != null) {
                stmt.setString(10, p.getUuid());
            }
            stmt.setInt(1, p.getIdPres());
            stmt.setInt(2, p.getPeriodo());
            stmt.setDate(3, Date.valueOf(p.getFechaOfer()));
            stmt.setInt(4, p.getPlazo());
            stmt.setDouble(5, p.getInteres());
            stmt.setDouble(6, p.getCantidad());
            stmt.setDate(7, Date.valueOf(p.getFechaFirma()));
            stmt.setDouble(8, p.getCantMens());
            stmt.setString(9, p.getUuid());
            
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
        String sql = "DELETE FROM prestamos WHERE uuid=?";
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
