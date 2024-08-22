public class Ejer26 {
    public static void main(String[] args) {
        var price = 0.0f;
        var quantity = 0;
        var TotalPrice = 0.0f;

        Console.writeLine("Ingrese el precio del articulo");
        price = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la cantidad de articulos");
        quantity = Integer.parseInt(Console.readLine());

        if (quantity <= 10) {
            Console.writeLine("El precio es %f ya que no hay descuento", price);
        }
         else if (quantity > 10 && quantity <= 20) {
            TotalPrice = (float) (price - (price * 0.1));
            Console.writeLine("El precio es %f ya que tiene un descuento del 10%", TotalPrice);
        } 
        else {
            TotalPrice = (float) (price - (price * 0.2));
            Console.writeLine("El precio es %f ya que tiene un descuento del 20%", TotalPrice);
        }

    }
}
