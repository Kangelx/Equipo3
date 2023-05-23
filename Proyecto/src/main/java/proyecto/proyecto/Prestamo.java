/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author DAM129
 */
public class Prestamo implements Identificable{
    private int idPrestamo;
    private int idBeneficiario;
    private double cantidad;
    private int duracion;
    private int tipoInteres;
    private double cantidadMensual;
    private int diasAceptar;
    private EstadoSoli estado;
    private LocalDate fechaOferta;
    private LocalDate fechaFirma;
    private ArrayList<Pago> pagos;

    public Prestamo(int idPrestamo, int idBeneficiario, double cantidad, int duracion, int tipoInteres, double cantidadMensual, int diasAceptar, EstadoSoli estado, LocalDate fechaOferta, LocalDate fechaFirma, ArrayList<Pago> pagos) {
        this.idPrestamo = idPrestamo;
        this.idBeneficiario = idBeneficiario;
        this.cantidad = cantidad;
        this.duracion = duracion;
        this.tipoInteres = tipoInteres;
        this.cantidadMensual = cantidadMensual;
        this.diasAceptar = diasAceptar;
        this.estado = estado;
        this.fechaOferta = fechaOferta;
        this.fechaFirma = fechaFirma;
        this.pagos = pagos;
    }

    public Prestamo() {
    }
    
    

    public LinkedHashMap<String, String> datosObjeto(){
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        datos.put("idPrestamo", String.valueOf(idPrestamo));
        datos.put("idBeneficiario", String.valueOf(idBeneficiario));
        datos.put("cantidad", String.valueOf(cantidad));
        datos.put("duracion", String.valueOf(duracion));
        datos.put("tipo interes", String.valueOf(tipoInteres));
        datos.put("cantidadMensual", String.valueOf(cantidadMensual));
        datos.put("diasAceptar", String.valueOf(diasAceptar));
        datos.put("estadoSolicitud", estado.name());
        datos.put("fechaOferta", fechaOferta.format(formato));
        datos.put("fechaFirma", fechaFirma.format(formato));
        for (Pago pago : pagos) {
            datos.putAll(pago.datosObjeto());
        }
        
        return datos;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(int idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(int tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getCantidadMensual() {
        return cantidadMensual;
    }

    public void setCantidadMensual(double cantidadMensual) {
        this.cantidadMensual = cantidadMensual;
    }

    public int getDiasAceptar() {
        return diasAceptar;
    }

    public void setDiasAceptar(int diasAceptar) {
        this.diasAceptar = diasAceptar;
    }

    public EstadoSoli getEstado() {
        return estado;
    }

    public void setEstado(EstadoSoli estado) {
        this.estado = estado;
    }

    public LocalDate getFechaOferta() {
        return fechaOferta;
    }

    public void setFechaOferta(LocalDate fechaOferta) {
        this.fechaOferta = fechaOferta;
    }

    public LocalDate getFechaFirma() {
        return fechaFirma;
    }

    public void setFechaFirma(LocalDate fechaFirma) {
        this.fechaFirma = fechaFirma;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }
    
    
    
    
    
    
}
