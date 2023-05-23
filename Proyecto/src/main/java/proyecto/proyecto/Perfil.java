/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto;

/**
 *
 * @author DAM129
 */
public class Perfil implements Identificable{
    private int idCliente;
    private String passwd;
    private SitCivil sitCivil;
    private SitLaboral sitLaboral;
    private boolean ProblemasLegales;
    private boolean gananciales;
    private String idConyuge;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public SitCivil getSitCivil() {
        return sitCivil;
    }

    public void setSitCivil(SitCivil sitCivil) {
        this.sitCivil = sitCivil;
    }

    public SitLaboral getSitLaboral() {
        return sitLaboral;
    }

    public void setSitLaboral(SitLaboral sitLaboral) {
        this.sitLaboral = sitLaboral;
    }

    public boolean isProblemasLegales() {
        return ProblemasLegales;
    }

    public void setProblemasLegales(boolean ProblemasLegales) {
        this.ProblemasLegales = ProblemasLegales;
    }

    public boolean isGananciales() {
        return gananciales;
    }

    public void setGananciales(boolean gananciales) {
        this.gananciales = gananciales;
    }

    public String getIdConyuge() {
        return idConyuge;
    }

    public void setIdConyuge(String idConyuge) {
        this.idConyuge = idConyuge;
    }
    
    
}
