package Ejercicio1;

public class Entrenador {
    private char licencia;
    private String email;
    public static Double pagarIncentivo;
    private static Double sueldo;
     Integer random;

    public static void pagarIncentivo(double pagarIncentivo, double sueldo){
        random=pagarIncentivo(0,100);
        sueldo=sueldo;
pagarIncentivo=(sueldo * 20) /100 < random;

    }
    public static void pagarfiniquito(){

    }

}
