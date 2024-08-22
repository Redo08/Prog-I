import java.util.Scanner;

public class Ejer05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float adenina = 0.0f;
        float timina = 0.0f;
        float citosina = 0.0f;
        float guanina = 0.0f;
        double total_bases = 0.0d;
        double total_adenina = 0.0d;
        double total_timina = 0.0d;
        double total_citosina = 0.0d;
        double total_guanina = 0.0d;

        System.out.println("Ingrese el valor de adenina");
        adenina = leer.nextFloat();
        System.out.println("Ingrese el valor de la timina");
        timina = leer.nextFloat();
        System.out.println("Ingrese el valor de la citosina");
        citosina = leer.nextFloat();
        System.out.println("Ingrese el valor de la guanina");
        guanina = leer.nextFloat();
        total_bases = adenina + timina + citosina + guanina;
        total_adenina = (adenina / total_bases) * 100;
        total_timina = (timina / total_bases) * 100;
        total_citosina = (citosina / total_bases) * 100;
        total_guanina = (guanina / total_bases) * 100;
        System.out.println("El porcentaje total de adenina es " + total_adenina);
        System.out.println("El porcentaje total de timina es " + total_timina);
        System.out.println("El procentaje total de citosina es " + total_citosina);
        System.out.println("El porcentaje total de guanina es " + total_guanina);
        leer.close();

    }

}
