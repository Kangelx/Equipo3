/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto;

/**
 *
 * @author DAM129
 */
public class Cuenta implements Identificable{
    private String iban;
    private TipoCuenta tipoCuenta;
    private double saldo;
    private double nominaUltimoMes;
    private double mediaIngresos;

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

    public double getNominaUltimoMes() {
        return nominaUltimoMes;
    }

    public void setNominaUltimoMes(double nominaUltimoMes) {
        this.nominaUltimoMes = nominaUltimoMes;
    }

    public double getMediaIngresos() {
        return mediaIngresos;
    }

    public void setMediaIngresos(double mediaIngresos) {
        this.mediaIngresos = mediaIngresos;
    }
    
    
}
