public class Ejer16 {
    public static void main(String[] args) {
        var Team1 = 0;
        var Team2 = 0;
        Console.writeLine("Ingrese la cantidad de puntos del equipo 1");
        Team1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese la cantidad de puntos del equipo 2");
        Team2 = Integer.parseInt(Console.readLine());
        if (Team1 == Team2) {
            Console.writeLine("Los equipos van empatados, deben ir a tiempo extra");
        } else {
            Console.writeLine("Los equipos no van empatados, no deben ir a tiempo extra");
        }
    }
}
