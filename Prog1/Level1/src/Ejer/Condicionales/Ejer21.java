
public class Ejer21 {
    public static void main(String[] args) {
        var priceA = 0.0f;
        var TotalA = 0.0d;
        var priceB = 0.0f;
        var TotalB = 0.0d;
        var priceC = 0.0f;
        var TotalC = 0.0d;
        var desicion = '?';

        Console.writeLine("Escribe la categoria del Articulo, recuerda que las categorias son A, B y C");
        desicion = Console.readLine().toUpperCase().charAt(0);
        if (desicion == 'A') {
            Console.writeLine("Ingrese el precio del articulo");
            priceA = Float.parseFloat(Console.readLine());
            TotalA = priceA - (priceA * 0.1);
            Console.writeLine("El precio total queda en : %f ya que tiene un descuento del 10%", TotalA);
        } else if (desicion == 'B') {
            Console.writeLine("Ingrese el precio del articulo");
            priceB = Float.parseFloat(Console.readLine());
            TotalB = priceB - (priceB * 0.2);
            Console.writeLine("El precio total queda en: %f ya que tiene un descuento del 20%", TotalB);
        } else if (desicion == 'C') {
            Console.writeLine("Ingrese el precio del articulo");
            priceC = Float.parseFloat(Console.readLine());
            TotalC = priceC - (priceC * 0.3);
            Console.writeLine("El precio total queda en: %f ya que tiene un descuento del 30%", TotalC);
        } else {
            Console.writeLine("Categoria no encontrada");
        }
    }
}
