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
public class Movimientos implements Identificable{
    private int idOperacion;
    private TipoOperacion tipoOperacion;
    private double cantidad;
    private String concepto;
    private String emisor;
    private String receptor;
    
    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        datos.put("idOperacion", String.valueOf(idOperacion));
        datos.put("tipoOperacion", tipoOperacion.name());
        datos.put("cantidad", String.valueOf(cantidad));
        datos.put("concepto", concepto);
        datos.put("emisor", emisor);
        datos.put("receptor", receptor);
        return datos;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
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

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    
    
    
}
