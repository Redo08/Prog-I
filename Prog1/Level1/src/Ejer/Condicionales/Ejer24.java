public class Ejer24 {
    public static void main(String[] args) {
        var age = 0;
        Console.writeLine("Ingrese su edad");
        age = Integer.parseInt(Console.readLine());
        if (age <= 12) {
            Console.writeLine("Usted tiene derecho al descuento del 50%");
        } else if (age > 12 && age <18) {
            Console.writeLine("Usted tiene derecho al descuento de 25%");
        } else {
            Console.writeLine("Usted no tiene derecho a ningun descuento");
        }
    }
}
