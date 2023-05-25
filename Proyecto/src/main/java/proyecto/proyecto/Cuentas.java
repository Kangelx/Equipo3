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
public class Cuentas implements Identificable {

    private String iban;
    private TipoCuenta tipoCuenta;
    private double saldo;
    private double nominaUltimo;
    private double nominaMedAnual;

    public Cuentas(String iban, TipoCuenta tipoCuenta, double saldo, double nominaUltimoMes, double mediaIngresos) {
        this.iban = iban;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.nominaUltimo = nominaUltimoMes;
        this.nominaMedAnual = mediaIngresos;
    }

    public Cuentas() {
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        datos.put("iban", iban);
        datos.put("tipoCuenta", tipoCuenta.name());
        datos.put("saldo", String.valueOf(saldo));
        datos.put("nominaUltimo", String.valueOf(nominaUltimo));
        datos.put("nominaMedAnual", String.valueOf(nominaMedAnual));
        return datos;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNominaUltimo() {
        return nominaUltimo;
    }

    public void setNominaUltimo(double nominaUltimo) {
        this.nominaUltimo = nominaUltimo;
    }

    public double getNominaMedAnual() {
        return nominaMedAnual;
    }

    public void setNominaMedAnual(double nominaMedAnual) {
        this.nominaMedAnual = nominaMedAnual;
    }

}
