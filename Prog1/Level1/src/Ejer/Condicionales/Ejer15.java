public class Ejer15 {
    public static void main(String[] args) {
        var MaxEmission = 0.0f;
        var  EmissionEmited = 0.0f;
        Console.writeLine("Ingrese el valor maximo de emisiones permitidas en la zona");
        MaxEmission = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el valor de las emisiones emitidas por el vehiculo");
        EmissionEmited = Float.parseFloat(Console.readLine());
        if (EmissionEmited < MaxEmission) {
            Console.writeLine("Las emisiones emitidas por el vehiculo cumplen con las regulaciones");
        } else {
            Console.writeLine("El vehiculo sobrepasa las regulaciones, no puede pasar por aqui");
        }
    }
}
