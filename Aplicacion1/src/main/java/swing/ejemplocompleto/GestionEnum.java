/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing.ejemplocompleto;

/**
 *
 * @author DAM129
 */
public class GestionEnum {
    //CLASES PARA TRANSFORMAR EL STRING QUE DA LA BASE DE DATOS AL ENUMERADO
    // CASADO SOLTERO VIUDO
    public static SitCivil transSitCivil(String entrada){
        SitCivil salida=null;
        if (entrada.equalsIgnoreCase("casado")){
            salida = SitCivil.CASADO;
        }else if(entrada.equalsIgnoreCase("soltero")){
            salida = SitCivil.SOLTERO;
        }else{
            salida = SitCivil.VIUDO;
        }
        
        return salida;
    }
//    DESEMPLEADO EMPLEADO PENSIONISTA RENTISTA
    public static SitLaboral transSitLaboral(String entrada){ 
        SitLaboral salida=null;
        if (entrada.equalsIgnoreCase("desempleado")){
            salida = SitLaboral.DESEMPLEADO;
        }else if (entrada.equalsIgnoreCase("empleado")){
            salida = SitLaboral.EMPLEADO;
        }else if (entrada.equalsIgnoreCase("pensionista")){
            salida = SitLaboral.PENSIONISTA;
        }else{
            salida = SitLaboral.RENTISTA;
        }
        return salida;
            
    }
    // GANANCIALES SEPARACION_DE_BIENES
    public static TipoRegimen transRegimen(String entrada){
        TipoRegimen salida = null;
        if (entrada.equalsIgnoreCase("gananciales")){
            salida = TipoRegimen.GANANCIALES;
        }else{
            salida = TipoRegimen.SEPARACION_DE_BIENES;
        }
        return salida;
    }
    
    public static TipoCuenta transTipoCuenta(String entrada){
        TipoCuenta salida;
        if ( entrada.equalsIgnoreCase("")){
            salida = TipoCuenta.AHORRO;
        }else{
            salida = TipoCuenta.CORRIENTE;
        }
        return salida;
    }
    
}
