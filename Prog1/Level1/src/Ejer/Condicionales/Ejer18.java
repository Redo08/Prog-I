public class Ejer18 {
    public static void main(String[] args) {
        var Clock1 = 0.0f;
        var Clock2 = 0.0f;
        Console.writeLine("Ingrese la hora del primer reloj");
        Clock1 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la hora del segundo reloj");
        Clock2 = Float.parseFloat(Console.readLine());
        if (Clock1 != Clock2) {
            Console.writeLine("Los relojes estan desincronizados");
        } else {
            Console.writeLine("Los relojes estan sincronizados");
        }

    }
}
