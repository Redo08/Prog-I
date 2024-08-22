import java.util.Arrays;

public class ArregloStringInt {
    public static void main(String[] args) {
        var nums = new int[] {};
        var values = new String[] {};
        var avg = 0f;
        Console.writeLine("Ingrese los numeros separados por ',': ");
        values = Console.readLine().split(",");
        nums = Funciones.convStrArrayToIntArray(values);
        avg = Funciones.average(nums);
        Console.writeLine("El promedio es: %f", avg);
        System.out.println(Arrays.toString(nums)); // Se utiliza el Arrays.toString(nums) para pasarlo a texto, se tiene
                                                   // que importar java.util.Arrays;
        Console.writeLine("Numeros mayores al promedio: ");
        for (var k = 0; k < nums.length; k++) {
            if (nums[k] > avg) {
                Console.writeLine("%d ", nums[k]);
            }
        }
    }
}
