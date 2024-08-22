public class Ejer13 {
    public static void main(String[] args) {
        var MinHeight = 0.0f;
        var PassangerHeight = 0.0f;
        Console.writeLine("Ingrese la altura minima para ingresar a la atracción");
        MinHeight = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la altura del pasajero");
        PassangerHeight = Float.parseFloat(Console.readLine());
        if (PassangerHeight > MinHeight) {
            Console.writeLine("La altura del pasajero es segura para ingresar a la atracción");
        } else {
            Console.writeLine("El pasajero no cuenta con la altura necesaria para ingresar a la atracción");
        }
        
    }
}
