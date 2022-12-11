package Practica3;

public class Casa {
    double Amplitud;
    double Altura;
    double IVA;
    double IVAreducido;
    String direccion;
    a Habitacion;
    b CuartoBaño;

    public Casa() {
        Amplitud = 5.3;
        Altura = 7.2;
        IVA = 21;
        IVAreducido = 16;
        direccion = "Calle Los Naranjos, 47, 3ºA. 11600 Ubrique (Cádiz)";
        Habitacion = new a();
        CuartoBaño = new b();
    }

    private int precioIVA;
    private int precioIVAreducido

    switch(precio){
        case "IVA":
            int IVA = 21;
            break;
        case"IVAreducido":
            int IVAreducido = 16;
            break;
            double precio = precioIVA * precioIVAreducido / 100;
    }


    public void setSuperficie(double valorSuperficie) {
        superficie = valorSuperficie;
    }

    public void setDireccion(String valorDireccion) {
        direccion = valorDireccion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public String getDireccion() {
        return direccion;
    }


}