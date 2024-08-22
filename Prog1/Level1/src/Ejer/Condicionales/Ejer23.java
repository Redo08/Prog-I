public class Ejer23 {
    public static void main(String[] args) {
        var month = 0;
        var year = 0;
        Console.writeLine("Ingrese un mes en forma númerica (del 1 al 12)");
        month = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el año");
        year = Integer.parseInt(Console.readLine());

        if (month == 1) {
            Console.writeLine("El mes de Enero tiene 31 días en el año %d", year);
        } else if (month == 2 && (year % 4 == 0 || (year % 100 == 0 ) && (year % 400 == 0))){
            Console.writeLine("El mes de Febrero tiene 29 días en el año %d", year);
        } else if (month == 2 ) {
            Console.writeLine("El mes de Febrero tiene 28 días en el año %d", year);
        } else if (month == 3) {
            Console.writeLine("El mes de Marzo tiene 31 días en el año %d", year);
        } else if (month == 4) {
            Console.writeLine("El mes de Abril tiene 30 días en el año %d", year);
        } else if (month == 5) {
            Console.writeLine("El mes de Mayo tiene 31 días en el año %d", year);
        } else if (month == 6) {
            Console.writeLine("El mes de Junio tiene 30 días en el año %d", year);
        } else if (month == 7) {
            Console.writeLine("El mes de Julio tiene 31 días en el año %d", year);
        } else if (month == 8) {
            Console.writeLine("El mes de Agosto tiene 31 días en el año %d", year);
        } else if (month == 9) {
            Console.writeLine("El mes de Septiembre tiene 30 días en el año %d", year);
        } else if (month == 10) {
            Console.writeLine("El mes de Octubre tiene 31 días en el año %d", year);
        } else if (month == 11) {
            Console.writeLine("El mes de Noviembre tiene 30 días en el año %d", year);
        } else if (month == 12) {
            Console.writeLine("El mes de Diciembre tiene 31 días en el año %d", year);
        } else {
            Console.writeLine("Ese mes no existe");
        }
    }
}
