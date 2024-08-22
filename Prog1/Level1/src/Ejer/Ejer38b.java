public class Ejer38b {
    public static void main(String[] args) {
        var usernumber = 0;
        var pcnumber = 0;
        var num_intentos = 0;

        pcnumber = (int) (1 + Math.random() * 15);

        
        while(num_intentos < 3 && usernumber != pcnumber){
            Console.writeLine(
                "Hola! en este juego tendras 3 intentos para encontrar el numero buscado, el numero va desde 1 a 15.");
            usernumber = Integer.parseInt(Console.readLine());
            while(usernumber < 1 || usernumber > 15){
                Console.writeLine("Ese numero esta mal, vuelve a ponerlo dentro del rango de 1 a 15.");
                usernumber = Integer.parseInt(Console.readLine());
            }
            num_intentos +=1;
        }
        if(usernumber != pcnumber){
            Console.writeLine("Perdiste, el numero buscado era: %d", pcnumber);
        } else {
            Console.writeLine("Ganaste! solo te tomo %d intentos", num_intentos);
        }
    }
}