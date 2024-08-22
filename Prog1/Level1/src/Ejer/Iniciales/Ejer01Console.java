public class Ejer01Console {
    public static void main(String[] args) {
        var principal = 0.0f;
        var int_anual = 0.0f;
        var time = 0.0f;
        var outcome = 0.0;
        Console.writeLine("Ingerse el valor del principal");
        principal = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor del interes anual");
        int_anual = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor del tiempo");
        time = Float.parseFloat(Console.readLine());
        outcome = principal * Math.pow((1 + int_anual/100), time);
        Console.writeLine("El valor del interes compuesto es: %f", outcome);
    }
}
