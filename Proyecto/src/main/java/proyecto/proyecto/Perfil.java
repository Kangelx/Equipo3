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
public class Perfil implements Identificable{
    private int idCliente;
    private String passwd;
    private SitCivil sitCivil;
    private SitLaboral sitLaboral;
    private boolean problemasLegales;
    private boolean gananciales;
    private String idConyuge;
    
    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        datos.put("idCliente", String.valueOf(idCliente));
        datos.put("password", passwd);
        datos.put("situacionCivil", sitCivil.name());
        datos.put("situacionLaboral", sitLaboral.name());
        datos.put("problemasLegales", String.valueOf(problemasLegales));
        datos.put("gananciales", String.valueOf(gananciales));
        datos.put("idConyuge", String.valueOf(idConyuge));
        return datos;
    }

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
        return problemasLegales;
    }

    public void setProblemasLegales(boolean ProblemasLegales) {
        this.problemasLegales = ProblemasLegales;
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
