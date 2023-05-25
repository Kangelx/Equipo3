/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto;

import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

/**
 *
 * @author DAM129
 */
public class Movimientos implements Identificable {

    private int idOperacion;
    private double cantidad;
    private String concepto;
    private String uuidDestinatario;
    private String uuidEmisor;
    private String iban;

    public Movimientos(int idOperacion, double cantidad, String concepto, String uuidDestinatario, String uuidEmisor, String iban) {
        this.idOperacion = idOperacion;
        this.cantidad = cantidad;
        this.concepto = concepto;
        this.uuidDestinatario = uuidDestinatario;
        this.uuidEmisor = uuidEmisor;
        this.iban = iban;
    }

    public Movimientos() {
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        datos.put("idOperacion", String.valueOf(idOperacion));
        datos.put("cantidad", String.valueOf(cantidad));
        datos.put("concepto", concepto);
        datos.put("uuidDestinatario", uuidDestinatario);
        datos.put("uuidEmisor", uuidEmisor);
        datos.put("iban", iban);
        return datos;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUuidDestinatario() {
        return uuidDestinatario;
    }

    public void setUuidDestinatario(String uuidDestinatario) {
        this.uuidDestinatario = uuidDestinatario;
    }

    public String getUuidEmisor() {
        return uuidEmisor;
    }

    public void setUuidEmisor(String uuidEmisor) {
        this.uuidEmisor = uuidEmisor;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

}