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
public class Clientes implements Identificable {

    private String uuid;
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String localidad;
    private LocalDate fechaNac;
    private String iban;

    public Clientes(String uuid, String dni, String nombre, String apellidos, String telefono, String direccion, String localidad, LocalDate fechaNac, String iban) {
        this.uuid = uuid;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fechaNac = fechaNac;
        this.iban = iban;
    }

    

    public Clientes() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        datos.put("uuid", uuid);
        datos.put("dni", dni);
        datos.put("nombre", nombre);
        datos.put("apellidos", apellidos);
        datos.put("telefono", telefono);
        datos.put("direccion", direccion);
        datos.put("localidad", localidad);
        datos.put("fechaNac", fechaNac.format(formato));
        datos.put("iban", iban);
        return datos;
    }

}
