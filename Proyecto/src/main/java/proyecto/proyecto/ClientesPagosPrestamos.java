/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto;

import java.util.LinkedHashMap;

/**
 *
 * @author DAM129
 */
public class ClientesPagosPrestamos implements Identificable {

    private String uuidcli;
    private int idPag;
    private int idPrestamo;

    public ClientesPagosPrestamos(String uuidcli, int idPag, int idPrestamo) {
        this.uuidcli = uuidcli;
        this.idPag = idPag;
        this.idPrestamo = idPrestamo;
    }

    public ClientesPagosPrestamos() {
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        datos.put("uuidCli", uuidcli);
        datos.put("idPag", String.valueOf(idPag));
        datos.put("idPrestamo", String.valueOf(idPrestamo));
        return datos;
    }

    public String getUuidcli() {
        return uuidcli;
    }

    public void setUuidcli(String uuidcli) {
        this.uuidcli = uuidcli;
    }

    public int getIdPag() {
        return idPag;
    }

    public void setIdPag(int idPag) {
        this.idPag = idPag;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

}
