public class Ejer02Console {
    public static void main(String[] args) {
        var inital_velocity = 0.0f;
        var time = 0.0f;
        var aceleration = 0.0f;
        var mrua = 0.0d;
        Console.writeLine("Ingrese el valor de la velocidad inicial");
        inital_velocity = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor del tiempo");
        time = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor de la aceleración");
        aceleration = Float.parseFloat(Console.readLine());
        mrua = (inital_velocity * time) + (((1/2f) * aceleration) * Math.pow(time, 2));
        Console.writeLine("El movimiento rectilineo uniformemente acelerado es: %f", mrua);
    }
}
