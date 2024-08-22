import java.util.Scanner;

public class Ejer06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float cost = 0.0f;
        float selling_price = 0.0f;
        double profit_margin = 0.0d;

        System.out.println("Ingrese el valor del costo");
        cost = leer.nextFloat();
        System.out.println("Ingrese el valor del precio de venta");
        selling_price = leer.nextFloat();
        profit_margin = (selling_price - cost)/selling_price * 100; 
        System.out.println("El margen de beneficio es " + profit_margin);
        leer.close();
    }
}
