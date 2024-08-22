import java.util.Scanner;

public class Ejer04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float note1 = 0.0f;
        float note2 = 0.0f;
        float note3 = 0.0f;
        float percentage1 = 0.0f;
        float percentage2 = 0.0f;
        float percentage3 = 0.0f;
        double weighted_average = 0.0d;

        System.out.println("Ingrese el valor de la primera nota");
        note1 = leer.nextFloat();
        System.out.println("Ingrese el valor de la segunda nota");
        note2 = leer.nextFloat();
        System.out.println("Ingrese el valor de la tercera nota");
        note3 = leer.nextFloat();
        System.out.println("Ingrese el valor del primer porcentaje");
        percentage1 = leer.nextFloat();
        System.out.println("Ingrese el valor del segundo porcentaje");
        percentage2 = leer.nextFloat();
        System.out.println("Ingrese el valor del tercer porcentaje");
        percentage3 = leer.nextFloat();
        weighted_average = (note1 * percentage1 + note2 * percentage2 + note3 * percentage3)
                / (percentage1 + percentage2 + percentage3);
        System.out.printf("El promedio ponderado es: %f", weighted_average);
        leer.close();

    }
}
