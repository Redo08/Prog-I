public class Ejer17 {
    public static void main(String[] args) {
        var MaxHeat = 0.0f;
        var FridgeHeat = 0.0f;
        Console.writeLine("Ingrese la temperatura maxima recomendada para el sistema de refrigeración");
        MaxHeat = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la temperatura del sistema de refrigeración");
        FridgeHeat = Float.parseFloat(Console.readLine());
        if (FridgeHeat > MaxHeat) {
            Console.writeLine("La temperatura del sistema de refrigeración supera el recomendado");
        } else {
            Console.writeLine("La temperatura esta dentro de los niveles recomendados");
        }
    }
}
