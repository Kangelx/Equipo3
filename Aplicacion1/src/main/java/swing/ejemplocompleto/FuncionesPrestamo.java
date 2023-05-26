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
 * @author angel
 */
public class FuncionesPrestamo implements Repositorio<Prestamos>{
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    @Override
    public Prestamos porId(String idPres) {
        Prestamos prestamo = null;
        String sql = "SELECT * FROM prestamos WHERE idPres=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, idPres);
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
            sql = "UPDATE prestamos SET periodo=?, fechaOfer=?, plazo=?, interes=?, cantidad=?, fechafirma=?, cantMens=?, uuid=? WHERE idPres=?";
        } else {
            sql = "INSERT INTO prestamos( periodo, fechaOfer, plazo, interes, cantidad, fecaFirma, cantMens, uuid) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? )";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            if (porId(p.getUuid()) != null) {
                stmt.setInt(9, p.getIdPres());
            }
            stmt.setInt(1, p.getPeriodo());
            stmt.setDate(2, Date.valueOf(p.getFechaOfer()));
            stmt.setInt(3, p.getPlazo());
            stmt.setDouble(4, p.getInteres());
            stmt.setDouble(5, p.getCantidad());
            stmt.setDate(6, Date.valueOf(p.getFechaFirma()));
            stmt.setDouble(7, p.getCantMens());
            stmt.setString(8, p.getUuid());
            
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
    public boolean eliminar(String idPres) {
        boolean realizado=false;//BOOLEANO PARA VENTANAS
        String sql = "DELETE FROM prestamos WHERE idPres=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, idPres);
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
       List<Prestamos> lista = new ArrayList();
        Prestamos prestamo = null;
        String sql = "SELECT * FROM prestamos WHERE idPres=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, idPres);
            try ( ResultSet rs = stmt.executeQuery();) {
                while (rs.next()) {
                    prestamo = new Prestamos(rs.getInt("idPres"), rs.getInt("periodo"), rs.getDate("fechaOfer").toLocalDate(), rs.getInt("plazo"), rs.getDouble("interes"), rs.getDouble("cantidad"), rs.getDate("fechaFirma").toLocalDate(), rs.getDouble("cantMens"), rs.getString("uuid"));
                    lista.add(prestamo);
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return lista;
    }
   
   public List listarAceptados(String idPres) {
       List<Prestamos> lista = new ArrayList();
        Prestamos prestamo = null;
        String sql = "SELECT * FROM prestamos WHERE idPres=? and fechaFirma is not null";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, idPres);
            try ( ResultSet rs = stmt.executeQuery();) {
                while (rs.next()) {
                    prestamo = new Prestamos(rs.getInt("idPres"), rs.getInt("periodo"), rs.getDate("fechaOfer").toLocalDate(), rs.getInt("plazo"), rs.getDouble("interes"), rs.getDouble("cantidad"), rs.getDate("fechaFirma").toLocalDate(), rs.getDouble("cantMens"), rs.getString("uuid"));
                    lista.add(prestamo);
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return lista;
    }
}
