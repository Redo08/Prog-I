public class Ejer11 {
    public static void main(String[] args) {
        var age = 0.0f;
        Console.writeLine("Ingrese su edad para ver si puede tener el descuento para entrar al cine");
        age = Float.parseFloat(Console.readLine());
        if (age > 100){
            Console.writeLine("Su edad no esta disponible en la vida de un humano");
        } else if (age > 60){
            Console.writeLine("Por su edad si aplica para el descuento para ingresar al cine");
        } else {
            Console.writeLine("No aplica al descuento, no tiene la edad requerida");
        }
        
    }
}

