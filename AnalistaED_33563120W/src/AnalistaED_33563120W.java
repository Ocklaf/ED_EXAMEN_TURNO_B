
import java.util.*;
/**
 * <h1>EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED</h1>
 * <h2>TURNO DE EXAMEN B<h2>
 * @author JOSÉ VICENTE FALCÓ 33563120W
 * @version 1.0 
 */
public class AnalistaED_33563120W {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    /**
     * Constructor con tres parámetros
     * @param nombreCompleto Nombre completo en mayúsculas
     * @param dni DNI Documento Nacional de Identidad con letra y sin espacios
     */
    public AnalistaED_33563120W(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    /**
     * Método getter que Calcula el salario bruto mensual en fucnión del salario base por hora y las horas extras.
     * El precio por hora de la hora extra se determina con la constante FACTOR_HORA_EXTRA
     * @param horasExtra Número de horas extras dedicadas redondeado a la baja (entero)
     * @return Devuelve el salario bruto mensual en euros con dos decimales
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        AnalistaED_33563120W emp = new AnalistaED_33563120W("JOSÉ VICENTE FALCÓ",
                "33563120W");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }
}
