import java.util.Scanner;

public class Ejer03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        var radius = 0.0f;
        var height = 0.0f;
        var volume = 0.0d;
        System.out.println("Ingrese el valor del radio del cilindro");
        radius = leer.nextFloat();
        System.out.println("Ingrese el valor de la altura del cilindro");
        height = leer.nextFloat();
        volume = Math.PI * height * Math.pow(radius, 2);
        System.out.println("El volumen del cilindro es: " + volume);
        leer.close();
    }
}
