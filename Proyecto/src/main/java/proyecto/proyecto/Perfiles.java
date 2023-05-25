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
public class Perfiles implements Identificable {

    private String usuario;
    private String uuid;
    private String contrasena;
    private SitCivil situacionCivil;
    private SitLaboral situacionLaboral;
    private boolean moroso;
    private boolean procesoJudicial;
    private String uuidPareja;
    private TipoRegimen regimen;

    public Perfiles(String usuario, String uuid, String contraseña, SitCivil situacionCivil, SitLaboral situacionLaboral, boolean moroso, boolean procesoJudicial, String uuidPareja, TipoRegimen regimen) {
        this.usuario = usuario;
        this.uuid = uuid;
        this.contrasena = contraseña;
        this.situacionCivil = situacionCivil;
        this.situacionLaboral = situacionLaboral;
        this.moroso = moroso;
        this.procesoJudicial = procesoJudicial;
        this.uuidPareja = uuidPareja;
        this.regimen = regimen;
    }

    public Perfiles() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

    public SitCivil getSituacionCivil() {
        return situacionCivil;
    }

    public void setSituacionCivil(SitCivil situacionCivil) {
        this.situacionCivil = situacionCivil;
    }

    public SitLaboral getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(SitLaboral situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    public boolean isProcesoJudicial() {
        return procesoJudicial;
    }

    public void setProcesoJudicial(boolean procesoJudicial) {
        this.procesoJudicial = procesoJudicial;
    }

    public String getUuidPareja() {
        return uuidPareja;
    }

    public void setUuidPareja(String uuidPareja) {
        this.uuidPareja = uuidPareja;
    }

    public TipoRegimen getRegimen() {
        return regimen;
    }

    public void setRegimen(TipoRegimen regimen) {
        this.regimen = regimen;
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> datos = new LinkedHashMap();
        datos.put("usuario", usuario);
        datos.put("uuid", uuid);
        datos.put("contraseña", contrasena);
        datos.put("situacionCivil", situacionCivil.name());
        datos.put("situacionLaboral", situacionLaboral.name());
        datos.put("moroso", String.valueOf(moroso));
        datos.put("procesoJudicial", String.valueOf(procesoJudicial));
        datos.put("uuidPareja", uuidPareja);
        datos.put("regimen", regimen.name());
        return datos;
    }

}
