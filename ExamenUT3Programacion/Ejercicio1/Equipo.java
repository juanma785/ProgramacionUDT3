package Ejercicio1;

public class Equipo extends Persona {

    private static String nombre;


    private enum color{
        Azul;
        Amarillo;
        Verde;
        Rojo;
        Blanco;

    }
    private static Integer partidosGanados;
    private static Integer partidosPerdidos;
    private static Integer partidosEmpatados;
    private static Integer calidad;

    public static void actualizarCalidad(Integer calidad,Integer partidosGanados,Integer partidosEmpatados, Integer partidosPerdidos) {
       partidosGanados=partidosGanados;
        calidad = partidosGanados * 2 + partidosEmpatados - partidosPerdidos;

        }

    public static String getColor(String color) {
        return color;
    }
}

