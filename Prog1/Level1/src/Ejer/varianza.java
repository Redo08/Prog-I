public class varianza {
    public static void main(String[] args) {
        float[] numeros = new float[]{};
        double varianza = 0;
        var valores = 0;
        Console.writeLine("Ingrese los longitud del arreglo: ");
        valores = Integer.parseInt(Console.readLine());
        numeros = new float[valores];
        for(var k = 0; k < valores; k++){
            Console.writeLine("Ingrese los valores del arreglO: ");
            numeros[k] = Float.parseFloat(Console.readLine());
        }
        varianza = MathFunc.desvEst(numeros);
        Console.writeLine("La desviacion de el arreglo es: %f", varianza);

    }
}
