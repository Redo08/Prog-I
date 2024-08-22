public class Arreglofunc {
    public static void main(String[] args) {
        int[] num = new int []{};
        var size = 0;
        Console.writeLine("Ingrese la cantidad de datos: ");
        size = Integer.parseInt(Console.readLine());
        num = new int[size];
        for(var k = 0; k <num.length; k++){
            Console.writeLine("Ingrese un número entero: ");
            num[k] = Integer.parseInt(Console.readLine());
        }
        Float avg = Funciones.average(num);
        Console.writeLine("El promedio es: %f", avg);
        Console.writeLine("Numeros mayores al promedio: ");
        for(var k = 0; k < num.length; k++){
            if(num[k] > avg){
                Console.writeLine("%d, ", num[k]);
            }
        }

    }

}
