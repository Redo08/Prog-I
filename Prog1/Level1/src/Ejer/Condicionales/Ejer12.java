public class Ejer12 {
    public static void main(String[] args) {
        var Weight = 0.0f;
        var MaxWeight = 0.0f;
        Console.writeLine("Ingrese el valor del peso maximo que soporta el ascensor");
         MaxWeight = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor del peso actual del elevador");
        Weight = Float.parseFloat(Console.readLine());
        if (Weight > MaxWeight) {
            Console.writeLine("El peso del elevador actualmente supera el maximo permitido");
        } else {
            Console.writeLine("El peso del elevador esta dentro de las regulaciones");
        }
    }
}
