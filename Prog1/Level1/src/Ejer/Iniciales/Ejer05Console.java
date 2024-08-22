public class Ejer05Console {
    public static void main(String[] args) {
        var adenina = 0f;
        var guanina = 0f;
        var citosina = 0f;
        var timina = 0f;
        var Total_bases = 0f;
        var percentage_adenina = 0.0f;
        var percentage_guanina = 0.0f;
        var percentage_citosina = 0.0f;
        var percentage_timina = 0.0f;

        Console.writeLine("Ingrese el valor de la adenina");
        adenina = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor de la guanina");
        guanina = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor de la citosina");
        citosina = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor de la timina");
        timina = Float.parseFloat(Console.readLine());
        Total_bases = adenina + guanina + citosina + timina;
        percentage_adenina = (adenina / Total_bases) * 100;
        percentage_guanina = (guanina / Total_bases) * 100;
        percentage_citosina = (citosina / Total_bases) * 100;
        percentage_timina = (timina / Total_bases) * 100;
        Console.writeLine("El porcentaje de adenina es: %f, el de guanina %f, el de citosina %f, el de timina %f",
                percentage_adenina, percentage_guanina, percentage_citosina, percentage_timina);
    }
}
