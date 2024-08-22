import java.util.Scanner;

public class Ejer01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        var principal = 0.0f;
        var int_anual = 0.0f;
        var time = 0.0f;
        var outcome = 0.0d;
        System.out.println("Ingrese el valor del Principal");
        principal = leer.nextFloat();
        System.out.println("Ingrese el valor del interes anual");
        int_anual = leer.nextFloat();
        System.out.println("Ingrese el valor del tiempo transcurrido");
        time = leer.nextFloat();
        outcome = principal * Math.pow((1 + int_anual/100), time);
        System.out.println("El interes compuesto es de " + outcome);
        leer.close();

    }
}