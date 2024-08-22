public class Ejer10 {
    public static void main(String[] args) {
        var age = 0.0f;
        Console.writeLine("Ingrese su edad para ver si puede ingresar al club nocturno");
        age = Float.parseFloat(Console.readLine());
        if (age > 18){
            Console.writeLine("Si puede entrar al club!");
        } else{
            Console.writeLine("No puede ingresar al club, tiene que ser mayor de 18 años");
        }
    }
}
