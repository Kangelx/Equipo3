/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing.ejemplocompleto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

/**
 *
 * @author DAM129
 */
public class Pagos implements Identificable {
    
    private int idPago;
    private LocalDate fecha;
    private double cantidad;
    private int idPres; 
    
    public Pagos(int idPago, LocalDate fecha, double cantidad, int idPres) {
        this.idPago = idPago;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.idPres = idPres;
    }
    
    public Pagos() {
    }

    public int getIdPres() {
        return idPres;
    }

    public void setIdPres(int idPres) {
        this.idPres = idPres;
    }
    
    public int getIdPago() {
        return idPago;
    }
    
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        datos.put("idPago", String.valueOf(idPago));
        datos.put("fecha", fecha.format(formato));
        datos.put("double", String.valueOf(cantidad));
        return datos;
    }
    
}
