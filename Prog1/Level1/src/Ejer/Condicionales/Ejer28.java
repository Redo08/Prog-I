public class Ejer28 {
    public static void main(String[] args) {
        var Usernumber = 0;
        int min = 1;
        int max = 100;
        int pcnumber = (int) (Math.random() * (max - min + 1) + min);
        //Generar un número aleatorio entre dos valores dados:
        // int numero = (int) (Math.random () * (max - min + 1)) + min;
        Console.writeLine("Bienvenido al juego de al azar, trata de adivinar el número, del 1 al 100");
        while (Usernumber != pcnumber) {
            Usernumber = 0;
            Console.writeLine("Ingrese un número");
            Usernumber = Integer.parseInt(Console.readLine());
            if (Usernumber == pcnumber) {
                Console.writeLine("Ese es el número!");
            } else if (Usernumber < pcnumber) {
                Console.writeLine("El número buscado es mayor");
            } else if (Usernumber > pcnumber) {
                Console.writeLine("El número buscado es menor");
            }
        }
    }
}
