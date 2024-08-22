public class Arreglos {
    public static void main(String[] args) {
        int[] numero = new int[] {};
        int size = 0;
        float avg = 0f;
        int sum = 0;

        Console.writeLine("Ingrese la cantidad de datos: ");
        size = Integer.parseInt(Console.readLine());
        numero = new int[size];
        for (var k = 0; k < numero.length; k++) {
            Console.writeLine("Ingrese las notas: ");
            numero[k] = Integer.parseInt(Console.readLine());
            sum += numero[k];
        }
        avg = (float)sum/size;
        Console.writeLine("Promedio %f", avg);
        Console.writeLine("Numeros mayores al promedio: ");
        for (var k = 0; k < numero.length; k++) {
            if (numero[k] > avg) {
                Console.writeLine("%d", numero[k]);
            }
        }

    }
}
