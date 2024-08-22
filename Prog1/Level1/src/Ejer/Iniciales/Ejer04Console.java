public class Ejer04Console {
    public static void main(String[] args) {
        var n1 = 0.0f;
        var n2 = 0.0f;
        var n3 = 0f;
        var p1 = 0.0f;
        var p2 = 0f;
        var p3 = 0f;
        var total = 0.0d;
        Console.writeLine("Ingrese el valor de las 3 notas de manera ordenada");
        n1 = Float.parseFloat(Console.readLine());
        n2 = Float.parseFloat(Console.readLine());
        n3 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor de los promedios de las 3 notas de forma ordenada");
        p1 = Float.parseFloat(Console.readLine());
        p2 = Float.parseFloat(Console.readLine());
        p3 = Float.parseFloat(Console.readLine());
        total = (n1 * p1 + n2 * p2 + n3 * p3)/ (p1 + p2 + p3);
        Console.writeLine("El promedio ponderado es de: %f", total);
    }
    
}
