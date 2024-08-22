public class Ejer06Console {
    public static void main(String[] args) {
        var cost = 0f;
        var selling_price = 0f;
        var profit = 0.0d;
        Console.writeLine("Ingrese el valor del costo");
        cost = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor del precio de venta");
        selling_price = Float.parseFloat(Console.readLine());
        profit = (selling_price - cost)/selling_price * 100;
        Console.writeLine("El margen de ganancias es de: %f", profit);
    }
}
