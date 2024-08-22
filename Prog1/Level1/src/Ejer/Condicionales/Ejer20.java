public class Ejer20 {
    public static void main(String[] args) {
        var side1 = 0f;
        var side2 = 0f;
        var side3 = 0f;
        Console.writeLine("Ingrese el valor del primer lado");
        side1 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor del segundo lado");
        side2 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor del tercer lado");
        side3 = Float.parseFloat(Console.readLine());
        if (side1 == side2 && side2 == side3) {
            Console.writeLine("El triangulo es equilatero");
        } else if (side1 == side2 || side2 == side3 || side1 == side3 && side2 != side3 || side1 != side3
                || side1 != side2) {
            Console.writeLine("El triangulo es isósceles");
        } else if (side1 != side2 && side2 != side3) {
            Console.writeLine("El triangulo es escaleno");
        }
    }
}
