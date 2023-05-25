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
public class Prestamos implements Identificable {

    private int idPres;
    private int periodo;
    private LocalDate fechaOfer;
    private int plazo;
    private double interes;
    private double cantidad;
    private LocalDate fechaFirma;
    private double cantMens;
    private String uuid; //nuevo

    public Prestamos(int idPres, int periodo, LocalDate fechaOfer, int plazo, double interes, double cantidad, LocalDate fechaFirma, double cantMens, String uuid) {
        this.idPres = idPres;
        this.periodo = periodo;
        this.fechaOfer = fechaOfer;
        this.plazo = plazo;
        this.interes = interes;
        this.cantidad = cantidad;
        this.fechaFirma = fechaFirma;
        this.cantMens = cantMens;
        this.uuid = uuid;
    }

    public Prestamos() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    

    public int getIdPres() {
        return idPres;
    }

    public void setIdPres(int idPres) {
        this.idPres = idPres;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public LocalDate getFechaOfer() {
        return fechaOfer;
    }

    public void setFechaOfer(LocalDate fechaOfer) {
        this.fechaOfer = fechaOfer;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaFirma() {
        return fechaFirma;
    }

    public void setFechaFirma(LocalDate fechaFirma) {
        this.fechaFirma = fechaFirma;
    }

    public double getCantMens() {
        return cantMens;
    }

    public void setCantMens(double cantMens) {
        this.cantMens = cantMens;
    }

    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        datos.put("idPres", String.valueOf(idPres));
        datos.put("periodo", String.valueOf(periodo));
        datos.put("fechaOfer", fechaOfer.format(formato));
        datos.put("plazo", String.valueOf(plazo));
        datos.put("interes", String.valueOf(interes));
        datos.put("cantidad", String.valueOf(cantidad));
        datos.put("fechaFirma", fechaFirma.format(formato));
        datos.put("cantMens", String.valueOf(cantMens));
        datos.put("uuid", uuid);
        return datos;
    }

}
