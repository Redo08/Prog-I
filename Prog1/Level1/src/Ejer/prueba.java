import java.util.Arrays;

public class prueba {
    public static void main(String[] args) {
        var index1 = 0;
        var index2 = 0;
        float total2 = 0f;
        boolean bool = true;
        int[] carlos = new int[] {};
        int[] hola = new int[] {};
        int[] total = new int[] {};
        Console.writeLine("Ingrese la longitud primer arreglo: ");
        index1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese la longitud del segundo arreglo: ");
        index2 = Integer.parseInt(Console.readLine());
        // Console.writeLine("Ingrese un valor, Mayor a menor o Menor a mayor (M/N)");
        // if (Console.readLine().toUpperCase().charAt(0) == 'M') {
        // bool = true;
        // } else {
        // bool = false;
        // }
        carlos = new int[index1];
        hola = new int[index2];

        for (var k = 0; k < index1; k++) {
            Console.writeLine("Ingrese los valores del primer arreglo (max rango 1000): ");
            carlos[k] = Integer.parseInt(Console.readLine());
        }

        for (var k = 0; k < index2; k++) {
            Console.writeLine("Ingrese los valores del segundo arreglo: ");
            hola[k] = Integer.parseInt(Console.readLine());
        }

        total = MathFunc.union(carlos, hola);
        Console.writeLine("Veces repetidas del numero no arreglo");
        Console.writeLine(Arrays.toString(total));
    }
}
