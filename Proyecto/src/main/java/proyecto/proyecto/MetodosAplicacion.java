/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author DAM129
 */
public class MetodosAplicacion {

    public boolean registrarUsuario(Clientes c, Perfiles p, Cuentas cu) {
        boolean acabado = true;
        FuncionesClientes clientes = new FuncionesClientes();
        FuncionesPerfiles perfiles = new FuncionesPerfiles();
        FuncionesCuentas cuentas = new FuncionesCuentas();
        if (!clientes.guardar(c) || !perfiles.guardar(p) || !cuentas.guardar(cu)) {
            acabado = false; //si no se realiza el guardado de clientes, perfiles o cuentas, devuelve falso el metodo
        }
        return acabado;
    }

    private int limpio(String uuid) { //SI ESTA LIMPIO, DEVUELVE 1 SI ES DESEMPLEADO, ESTUDIANTE O ES RESPONSABLE DE HOGAR, Y DEVUELVE 2 SI ES RENTISTA, EMPLEADO O PENSIONISTA
        int resul = 0;
        FuncionesPerfiles perfiles = new FuncionesPerfiles();
        Perfiles perfil = perfiles.porId(uuid);
        if (!perfil.isMoroso() && !perfil.isProcesoJudicial()) { // si no tiene morosidad ni asuntos judiciales, realiza lo siguiente
            SitLaboral aux = perfil.getSituacionLaboral();
            if (aux == SitLaboral.DESEMPLEADO || aux == SitLaboral.ESTUDIANTE || aux == SitLaboral.RESPONSABLE_DEL_HOGAR) {
                resul = 1;
            } else {
                resul = 2;
            }
        }

        return resul;

    }

    private double calculoPrestamo(Cuentas cuenta) {
        //margen de prestamo 1
        final double minPrestamo1 = 1000;
        final double maxPrestamo1 = 2000;
        final double prestamo1 = 5000;
        // margen de prestamo 2
        final double minPrestamo2 = 2000;
        final double maxPrestamo2 = 3000;
        final double prestamo2 = 10000;
        // prestamo 3 i es mayor que el prestamo 2
        final double prestamo3 = 15000;
        double prestamo = 0;
        if (cuenta.getNominaMedAnual() > minPrestamo1 && cuenta.getNominaMedAnual() < maxPrestamo1 && cuenta.getNominaUltimo() > minPrestamo1 && cuenta.getNominaUltimo() < maxPrestamo1) {//si la media anual de nominas y la ultima nomina esta entre los parametros especificados, se entrega el presupuesto
            prestamo = prestamo1;
        } else if (cuenta.getNominaMedAnual() > minPrestamo2 && cuenta.getNominaMedAnual() < maxPrestamo2 && cuenta.getNominaUltimo() > minPrestamo1 && cuenta.getNominaUltimo() < maxPrestamo2) {
            prestamo = prestamo2;
        }else{
            prestamo = prestamo3;
        }
        return prestamo;
    }

    //ESTE METODO UTILIZA DOS METODOS A PARTE: CALCULOPRESTAMO Y LIMPIO
    public double ofrecePrestamo(String uuid, int periodo, int plazo, double interes) {
        //CALCULO DE PRESTAMO
        double prestamo = 0;
        FuncionesPerfiles perfiles = new FuncionesPerfiles();
        FuncionesClientes clientes = new FuncionesClientes();
        FuncionesCuentas cuentas = new FuncionesCuentas();
        FuncionesPrestamo prestamos = new FuncionesPrestamo();
        Random r = new Random();
        Prestamos p;
        Perfiles perfil = perfiles.porId(uuid);
        Cuentas cuenta = cuentas.porId(clientes.porId(uuid).getIban());
        if (limpio(uuid) == 1) {//si no cobra, comprueba si tiene pareja y si la pareja puede recibir prestamo, si es asi, lo hace a nombre de la pareja
            if (clientes.porId(perfil.getUuidPareja()) != null && limpio(perfil.getUuidPareja()) == 2) {  //si esta casado, el conyuge es cliente  y la pareja es valida
                double mediaMensual = cuenta.getNominaMedAnual();
                if (mediaMensual > 1000 && cuenta.getNominaUltimo() > 1000) { // puede pedir prestamo
                    prestamo = calculoPrestamo(cuenta);
                }
            }
        } else if (limpio(uuid) == 2) {//si cobra, se procede a calcular el prestamo
            double mediaMensual = cuenta.getNominaMedAnual();
            if (mediaMensual > 1000 && cuenta.getNominaUltimo() > 1000) { // si puede pedir prestamo
                prestamo = calculoPrestamo(cuenta);
            }
        }
        
        //INSERCION EN TABLA PRESTAMOS
        double cantidadMensual= ((prestamo/periodo)+8*prestamo/100);
        p = new Prestamos(0, periodo, LocalDate.now(), plazo, interes, prestamo, null,cantidadMensual , uuid);
        prestamos.guardar(p);
        
        return prestamo;
    }
}
