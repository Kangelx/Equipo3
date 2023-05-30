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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
public class FuncionesPrestamo{
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    

    public Prestamos porId(int idPres) {
        LocalDate fechaFirma=null;
        Prestamos prestamo = null;
        String sql = "SELECT * FROM prestamos WHERE idPres=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, idPres);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    if (rs.getDate("fechaFirma")!=null){
                    fechaFirma = rs.getDate("fechaFirma").toLocalDate();   
                    }
                    prestamo = new Prestamos(rs.getInt("idPres"), rs.getInt("periodo"), rs.getDate("fechaOfer").toLocalDate(), rs.getInt("plazo"), rs.getDouble("interes"), rs.getDouble("cantidad"), fechaFirma, rs.getDouble("cantMens"), rs.getString("uuid"));
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return prestamo;
    }
    

    public boolean guardar(Prestamos p) {
        boolean realizado=false;//BOOLEANO PARA VENTANAS
        String sql = null;
        if (porId(p.getIdPres()) !=null) {
            sql = "UPDATE prestamos SET periodo=?, fechaOfer=?, plazo=?, interes=?, cantidad=?, fechafirma=?, uuid=?, cantMens=?  WHERE idPres=?";
        } else {
            sql = "INSERT INTO prestamos( periodo, fechaOfer, plazo, interes, cantidad, fechaFirma, uuid) VALUES ( ? , ? , ? , ? , ? , ? , ? )";
        }
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            
            if (porId(p.getIdPres()) != null) {
                stmt.setDouble(8, p.getCantMens());
                stmt.setInt(9, p.getIdPres());
            }
            stmt.setInt(1, p.getPeriodo());
            stmt.setDate(2, Date.valueOf(p.getFechaOfer()));
            stmt.setInt(3, p.getPlazo());
            stmt.setDouble(4, p.getInteres());
            stmt.setDouble(5, p.getCantidad());
            if (p.getFechaFirma()==null){
                stmt.setDate(6, null);
            }else{
                stmt.setDate(6, Date.valueOf(p.getFechaFirma()));
            }
            
            stmt.setString(7, p.getUuid());
            
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
    
   public List listar(String uuid) {
       List<Prestamos> lista = new ArrayList();
        Prestamos prestamo = null;
        LocalDate fechaFirma=null;
        String sql = "SELECT * FROM prestamos WHERE uuid=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                while (rs.next()) {
                    if (rs.getDate("fechaFirma")!=null){
                    fechaFirma = rs.getDate("fechaFirma").toLocalDate();   
                    }
                   
                    prestamo = new Prestamos(rs.getInt("idPres"), rs.getInt("periodo"), rs.getDate("fechaOfer").toLocalDate(), rs.getInt("plazo"), rs.getDouble("interes"), rs.getDouble("cantidad"), fechaFirma, rs.getDouble("cantMens"), rs.getString("uuid"));
                    lista.add(prestamo);
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return lista;
    }
   
   public List listarAceptados(String uuid) {
       LocalDate fechaFirma=null;
       List<Prestamos> lista = new ArrayList();
        Prestamos prestamo = null;
        String sql = "SELECT * FROM prestamos WHERE uuid=? and fechaFirma is not null";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                while (rs.next()) {
                    if (rs.getDate("fechaFirma")!=null){
                    fechaFirma = rs.getDate("fechaFirma").toLocalDate();   
                    }
                    prestamo = new Prestamos(rs.getInt("idPres"), rs.getInt("periodo"), rs.getDate("fechaOfer").toLocalDate(), rs.getInt("plazo"), rs.getDouble("interes"), rs.getDouble("cantidad"), fechaFirma, rs.getDouble("cantMens"), rs.getString("uuid"));
                    lista.add(prestamo);
                }
            }
            
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return lista;
    }
   
    public List listarNoAceptados(String uuid) {
        LocalDate fechaFirma=null;
       List<Prestamos> lista = new ArrayList();
        Prestamos prestamo = null;
        String sql = "SELECT * FROM prestamos WHERE uuid=? and fechaFirma is null";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                while (rs.next()) {
                    if (rs.getDate("fechaFirma")!=null){
                    fechaFirma = rs.getDate("fechaFirma").toLocalDate();   
                    }
                    prestamo = new Prestamos(rs.getInt("idPres"), rs.getInt("periodo"), rs.getDate("fechaOfer").toLocalDate(), rs.getInt("plazo"), rs.getDouble("interes"), rs.getDouble("cantidad"), fechaFirma, rs.getDouble("cantMens"), rs.getString("uuid"));
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
