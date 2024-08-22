public class Ejer03Console {
    public static void main(String[] args) {
        var radius = 0.0f;
        var height = 0.0f;
        var volume = 0.0d;
        Console.writeLine("Ingrese el valor del radio");
        radius = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor de la altura");
        height = Float.parseFloat(Console.readLine());
        volume = Math.PI * Math.pow(radius, 2) * height;
        Console.writeLine("El valor del volumen es: %f", volume);

    }
}
