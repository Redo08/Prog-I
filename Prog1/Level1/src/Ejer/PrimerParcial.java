public class PrimerParcial { //Me genera un trauma recordar esto
    public static void main(String[] args) {
        var lanzamiento1 = 0;
        var lanzamiento2 = 0;
        var lanzamiento3 = 0;
        var puntajeTotal = 0;
        Console.writeLine("Ingrese los bolos derribados en el primer lanzamiento: ");
        lanzamiento1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese los bolos derribados en el segundo lanzamiento: ");
        lanzamiento2 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese los bolos derribados en el tercer lanzamiento: ");
        lanzamiento3 = Integer.parseInt(Console.readLine());

        if (lanzamiento1 < 0 || lanzamiento1 > 10 || lanzamiento2 < 0 || lanzamiento2 > 10 || lanzamiento3 < 0
                || lanzamiento3 > 10) {
            Console.writeLine("Cada lanzamiento ha de estar en el rango de 0 a 10 bolos");
        } else if (lanzamiento1 != 10 && (lanzamiento1 + lanzamiento2 > 10)) {
            Console.writeLine("La suma de los 2 primeros lanzamientos no puede ser");
            Console.writeLine("mayor a 10, excepto si el primer lanzamiento es una moñona");
        } else {
            puntajeTotal = 0;
            if (lanzamiento1 == 10) {
                puntajeTotal = 10 + lanzamiento2 + lanzamiento3;
            } else if (lanzamiento1 + lanzamiento2 == 10) {
                puntajeTotal = 10 + lanzamiento3;
            } else {
                puntajeTotal = lanzamiento1 + lanzamiento2;
            }
            Console.writeLine("Puntaje total: %d", puntajeTotal);
        }

    }
}
