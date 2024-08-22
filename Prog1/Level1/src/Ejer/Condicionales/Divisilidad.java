public class Divisilidad {
    // La forma de saber si un número es divisible por otro, es poniendolo a dividir
    // por residuo (%) y que eso de 0, osea que el número de exacto
    public static void main(String[] args) {
        var year = 0;
        Console.writeLine("Ingrese el año");
        year = Integer.parseInt(Console.readLine());
        if (year % 4 == 0) {
            Console.writeLine("El año es bisiesto");
        } else {
            Console.writeLine("El año no es bisiesto");
        }
    }
}
