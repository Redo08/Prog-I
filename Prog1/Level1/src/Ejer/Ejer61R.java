public class Ejer61R {
    public static void main(String[] args) {
        var dice1 = 0;
        var dice2 = 0;
        var pcamount = 0;
        var useramout = 0;
        var currentamount = 0;
        var condicional = 1;
        var condicional_humano = '?';
        
        Console.writeLine("Bienvenido al juego pig, aqui el objetivo es llegar a 100 o más puntos");
        Console.writeLine("Lanzas 2 dados y si sacas 1 en alguno de los 2 pierdes lo conseeguido en el turno");
        Console.writeLine("Si sacas dos 1, pierdes todos los puntos.");
        Console.writeLine("Para iniciar oprime [ENTER]");
        Console.readLine();
        
        while(useramout < 100 && pcamount < 100){
            condicional = 1;
            Console.writeLine("---------------------------------------");
            Console.writeLine("Va el computador");
            Console.writeLine("---------------------------------------");
            while(condicional == 1){
                dice1 = (int) (1 + Math.random() * 6);
                dice2 = (int) (1 + Math.random() * 6);
                currentamount = dice1 + dice2;
                Console.writeLine("Los dados lanzados por la consola dan: %d y %d", dice1, dice2);
                if (dice1 == 1 && dice2 == 1){
                    Console.writeLine("La consola saco doble 1, por lo que perdera todo el acumulado");
                    Console.writeLine("---------------------------------------");
                    Console.readLine();
                    pcamount = 0;
                    condicional = 0;
                }
                else if (dice1 == 1 || dice2 == 1){
                    Console.writeLine("La consola saco 1 en uno de los dados, por lo que perdera lo ganado en el turno");
                    Console.writeLine("---------------------------------------");
                    Console.readLine();
                    currentamount = 0;
                    pcamount += currentamount;
                    condicional = 0;
                } 
                else {
                    pcamount += currentamount;
                    Console.writeLine("En total llevas PC: %d", pcamount);
                    Console.writeLine("Quieres volver a lanzar PC? (S/N)");
                    Console.writeLine("---------------------------------------");
                    condicional = (int) ( Math.random() * 2);
                    if (condicional == 0){
                        Console.writeLine("Escogiste N PC");
                        Console.writeLine("---------------------------------------");
                        Console.readLine();
                    } 
                    else {
                        Console.writeLine("Escogiste S PC");
                        Console.writeLine("---------------------------------------");
                        Console.readLine();
                    }
                }
                Console.writeLine("El puntaje total que lleva la consola es: %d", pcamount);
            }
            Console.writeLine("Ahora sigues tu Usuario");
            Console.writeLine("---------------------------------------");
            condicional_humano = 'S';
            while (condicional_humano == 'S'){
                dice1 = (int) (1 + Math.random() * 6);
                dice2 = (int) (1 + Math.random() * 6);
                currentamount = dice1 + dice2;
                Console.writeLine("Los dados lanzados por el Usuario dan: %d y %d", dice1, dice2);
                if(dice1 == 1 && dice2 == 1){
                    Console.writeLine("Sacaste doble 1, por lo que vas a perder todo el puntaje acumulado");
                    Console.writeLine("---------------------------------------");
                    Console.readLine();
                    useramout = 0;
                    condicional_humano = 'N';
                }
                else if (dice1 == 1 || dice2 == 1){
                    Console.writeLine("Sacaste 1 en uno de los 2 dados, por lo que perderas el puntaje del turno");
                    Console.writeLine("---------------------------------------");
                    Console.readLine();
                    currentamount = 0;
                    useramout += currentamount;
                    condicional_humano = 'N';
                }
                else {
                    useramout += currentamount;
                    Console.writeLine("En total llevas: %d", useramout);
                    Console.writeLine("Quieres volver a lanzar? (S/N)");
                    Console.writeLine("---------------------------------------");
                    condicional_humano = Console.readLine().toUpperCase().charAt(0);
                    if (condicional_humano == 'S'){
                        Console.writeLine("Escogiste S, volveras a lanzar los dados");
                        Console.writeLine("---------------------------------------");
                        Console.readLine();
                    }
                    else {
                        Console.writeLine("Escogiste N, se acaba tu turno");
                        Console.writeLine("---------------------------------------");
                        Console.readLine();
                    }
                }
                Console.writeLine("El puntaje total que lleva es: %d", useramout);
            }
        }
        if(useramout > pcamount){
            Console.writeLine("El ganador es el usuario con %d puntos", useramout);
        }
        else {
            Console.writeLine("El ganador es la consola con %d puntos", pcamount);
        }

    }
}
