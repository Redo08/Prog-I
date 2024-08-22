public class Ejer27 {
    public static void main(String[] args) {
        var num1 = 0;
        var num2 = 0;
        var num3 = 0;

        Console.writeLine("Ingrese 3 números enteros, para verificar cual es el más grande");
        num1 = Integer.parseInt(Console.readLine());
        num2 = Integer.parseInt(Console.readLine());
        num3 = Integer.parseInt(Console.readLine());
        if (num1 > num2 && num1 > num3) {
            Console.writeLine("El numero mayor es: %d", num1);
        } else if (num1 < num3 && num2 < num3) {
            Console.writeLine("El numero mayor es: %d", num3);
        } else if (num1 < num2 && num3 < num2) {
            Console.writeLine("El numero mayor es: %d", num2);
        }
    }
}
