public class Ejer14 {
    public static void main(String[] args) {
        var MaxHeight = 0.0f;
        var VehicleHeight = 0.0f;
        Console.writeLine("Ingrese el valor de la altura maxima permitida por el puente para que pasen los vehiculos");
        MaxHeight = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor de la altura del vehiculo");
        VehicleHeight = Float.parseFloat(Console.readLine());
        if (VehicleHeight < MaxHeight) {
            Console.writeLine("El vehiculo puede pasar sin problemas por debajo del puente");
        } else {
            Console.writeLine("El vehiculo no puede pasar por debajo del puente, es muy alto");
        }
    }
}