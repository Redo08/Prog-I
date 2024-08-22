public class ejercicio38b{
    public static void main(String[] args) {
        var usernumber = 0;
        var pcnumber = 0;
        var numIntentos =  1;
        pcnumber = (int) (1 + Math.random() * (15));
        Console.writeLine("Adivina el numero entre 1 y 15, solo tienes 3 intentos");
        
        while(usernumber != pcnumber && numIntentos <= 3){
            
            usernumber = -1;
            while(usernumber < 1 || usernumber > 15){
                Console.writeLine("Intento %d:", numIntentos);
                usernumber = Integer.parseInt(Console.readLine());
                if (usernumber < 1 || usernumber>15)
                    Console.writeLine("El numero es erroneo, intente de nuevo");
            }
            
            
            numIntentos += 1;
        }
        if(usernumber == pcnumber){
            Console.writeLine("Lo lograste!");
        }
        else {
            Console.writeLine("Fallaste");
        }
    }
}