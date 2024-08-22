public class Ejer38a {
    public static void main(String[] args) {
        var usernumber = 0;
        var pcnumber = 0;
        var num_intentos = 0;

        pcnumber = (int) (1 + Math.random() * 100);
        Console.writeLine("Adivina el numero entre 1 y 100.");
        usernumber = Integer.parseInt(Console.readLine());
        while (usernumber != pcnumber) {
            while (usernumber < 1 || usernumber > 100) {
                Console.writeLine(
                        "Esos números no estan considerados dentro del rango, recuerda que el rango es de 1 a 100.");
                usernumber = Integer.parseInt(Console.readLine());
            }
            if (usernumber > pcnumber) {
                Console.writeLine("El numero buscado es menor.");
                usernumber = Integer.parseInt(Console.readLine());
            } else {
                Console.writeLine("El numero buscado es mayor.");
                usernumber = Integer.parseInt(Console.readLine());
            }
            num_intentos += 1;
        }
        Console.writeLine("Correcto! Conseguiste el numero correcto %d. Solo te tomo %d intentos", pcnumber,
                num_intentos);

    }
}