public class Ejercicio61 {
    public static void main(String[] args) {
        var pcamount = 0;
        var currentamount = 0;
        var useramount = 0;
        var dice1 = 0;
        var dice2 = 0;
        var condicional = 1;
        var condicional_humano = '?';
        Console.writeLine(
                "Bienvenido al juego pig, aqui el objetivo es llegar a 100 o más, lanzas 2 dados y si sacas 1 en un dado pierdes lo conseguido en ese turno, si sacas en los 2 dados 1, pierdes todos los puntos obtenidos. Puedes lanzar cuantas veces quieras, el computador inicia.");
        while (useramount < 100 && pcamount < 100) {
            condicional = 1;
            Console.writeLine("-------------------------------------------");
            Console.writeLine("Va el computador");
            Console.writeLine("-------------------------------------------");
            while (condicional == 1) {
                dice1 = (int) (1 + Math.random() * 6);
                dice2 = (int) (1 + Math.random() * 6);
                currentamount = dice1 + dice2;
                Console.writeLine("Los dados lanzados del computador dan: %d y %d", dice1, dice2);
                if (dice1 == 1 && dice2 == 1) {
                    pcamount = 0;
                    Console.writeLine("Perdiste todos los puntos PC! Sacaste 1 en los 2 dados D:");
                    Console.writeLine("-------------------------------------------");
                    condicional = 0;
                } else if (dice1 == 1 || dice2 == 1) {
                    pcamount -= currentamount;
                    Console.writeLine("Perdiste los puntos de tu turno PC D:");
                    Console.writeLine("-------------------------------------------");
                    condicional = 0;
                } else {
                    pcamount += currentamount;
                    Console.writeLine("En total llevas PC: %d", pcamount);
                    Console.writeLine("Quieres volver a lanzar PC? (S/N)");
                    Console.writeLine("-------------------------------------------");
                    condicional = (int) (Math.random() * 2);
                    if (condicional == 0) {
                        Console.writeLine("Escogiste N PC");
                        Console.writeLine("-------------------------------------------");
                    } else {
                        Console.writeLine("Escogiste S PC");
                        Console.writeLine("-------------------------------------------");
                    }
                }
                Console.writeLine("En total llevas PC puntos: %d", pcamount);

            }
            Console.writeLine("Ahora sigues tu usuario");
            Console.writeLine("-------------------------------------------");
            condicional_humano = 'S';
            while (condicional_humano == 'S') {
                dice1 = (int) (1 + Math.random() * 6);
                dice2 = (int) (1 + Math.random() * 6);
                currentamount = dice1 + dice2;
                Console.writeLine("Los dados lanzados dan: %d y %d", dice1, dice2);
                if (dice1 == 1 && dice2 == 1) {
                    useramount = 0;
                    Console.writeLine("Perdiste todos los puntos! Sacaste 1 en los 2 dados D:");
                    Console.writeLine("-------------------------------------------");
                    condicional_humano = 'N';
                } else if (dice1 == 1 || dice2 == 1) {
                    useramount -= currentamount;
                    Console.writeLine("Perdiste los puntos de tu turno D:");
                    Console.writeLine("-------------------------------------------");
                    condicional_humano = 'N';
                } else {
                    useramount += currentamount;
                    Console.writeLine("En total llevas: %d", useramount);
                    Console.writeLine("Quieres volver a lanzar? (S/N)");
                    Console.writeLine("-------------------------------------------");
                    condicional_humano = Console.readLine().toUpperCase().charAt(0);
                    if (condicional_humano == 'S') {
                        Console.writeLine("Escogiste S, Volveras a lanzar los dados");
                        Console.writeLine("-------------------------------------------");
                    } else {
                        Console.writeLine("Escogiste N, se acaba tu turno");
                        Console.writeLine("-------------------------------------------");
                    }
                }
                Console.writeLine("En total llevas Usuario puntos: %d", useramount);
            }

        }
        if (useramount > pcamount) {
            Console.writeLine("El ganador es: %d", useramount);
        } else {
            Console.writeLine("El ganador es: %d", pcamount);
        }
    }
}
