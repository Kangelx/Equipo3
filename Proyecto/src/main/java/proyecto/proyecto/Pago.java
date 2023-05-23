/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

/**
 *
 * @author DAM129
 */
public class Pago implements Identificable{
    private int idPago;
    private int idPrestamo;
    private LocalDate fechaPago;
    private double cantPagado;

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        datos.put("idPago", String.valueOf(idPago));
        datos.put("idPrestamo", String.valueOf(fechaPago.format(formato)));
        datos.put("cantidadPago",String.valueOf(cantPagado));
        return datos;
    }
    
    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getCantPagado() {
        return cantPagado;
    }

    public void setCantPagado(double cantPagado) {
        this.cantPagado = cantPagado;
    }

    
    
    
}
