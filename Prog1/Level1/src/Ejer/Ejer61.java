class Ejer61 extends Terminal {
    public static void main(String[] args) {
        var ppts = 0;
        var bpts = 0;
        var player = 0;
        var bot = 0;
        var dice1 = 0;
        var dice2 = 0;
        var botansw = 0;
        var playansw = '?';

        printLine("Bienvenido a PIG");
        printLine();
        printLine("REGLAS");
        printLine("1- El jugador humano y la computadora compiten para ser el primero en alcanzar o");
        printLine("superar una puntuación total predeterminada, generalmente 100 puntos.");
        printLine();
        printLine("2- La computadora inicia cada turno lanzando dos dados. Luego, el jugador humano");
        printLine("toma su turno, lanzando también dos dados. En cada turno, tanto el jugador humano");
        printLine("como la computadora pueden lanzar los dados tantas veces como deseen, acumulando");
        printLine("los puntos de cada lanzamiento a su puntuación de turno.");
        printLine();
        printLine("3- Si el jugador (humano o computadora) lanza al menos un 1 en cualquiera de los");
        printLine("dos dados, pierde todos los puntos acumulados en ese turno y su turno termina");
        printLine("inmediatamente.");
        printLine();
        printLine("4- Si el jugador lanza dos 1s, pierde todos los puntos acumulados en el juego");
        printLine("hasta ese momento, y su turno también termina.");
        printLine();
        printLine("5- Después de cada lanzamiento, el jugador debe decidir si sigue lanzando para");
        printLine("acumular más puntos o si detiene su turno para conservar los puntos obtenidos hasta ese");
        printLine("momento.");
        printLine();
        printLine("6- El juego termina cuando el jugador humano o la computadora alcanzan o superan");
        printLine("el total de puntos objetivo. Sin embargo, se debe esperar a que se complete la");
        printLine("ronda actual antes de determinar al ganador.");
        printLine();
        printLine("Presione INTRO para inciar el juego.");
        scanLine();

        while (player < 100 && bot < 100) {

            printLine();
            printLine("TURNO DE LA MÁQUINA");
            printLine();

            do {
                dice1 = (int) (1 + Math.random() * 6);
                dice2 = (int) (1 + Math.random() * 6);
                printLine("Los dados sacaron: %d y %d. Total: %d", dice1, dice2, (dice1 + dice2));

                if (dice1 == 1 && dice2 == 1) {
                    bpts = 0;
                    bot = 0;
                    botansw = 0;
                    printLine("Pareja de 1. Bot pierde toda su puntuación.");
                    printLine("Puntuación Bot: %d", bot);

                    if (bot == 0) {
                        bot = 0;
                    }

                } else if (dice1 == 1 || dice2 == 1) {
                    bpts = 0;
                    bot += bpts;
                    botansw = 0;
                    printLine("Dado caido en 1. Bot pierde la puntuación de este turno.");
                    printLine("Puntuación Bot: %d", bot);

                    if (bot == 0) {
                        bot = 0;
                    }

                } else {
                    bpts = (dice1 + dice2);
                    bot += bpts;
                    printLine("Puntuación Bot: %d", bot);

                    if (bot >= 100) {
                        botansw = 0;
                        printLine();
                        printLine("Has perdido contra la máquina.");
                    } else {
                        printLine();
                        printLine("¿Desea hacer otro lanzamiento? S/N");
                        botansw = (int) (Math.random() * 2);

                        if (botansw == 0) {
                            printLine("No");

                        } else {
                            printLine("Si");
                        }
                    }

                }
            } while (botansw == 1);

            printLine();
            printLine("TURNO DEL JUGADOR");
            printLine();
            printLine("Presione INTRO para lanzar los dados.");
            scanLine();

            do {
                dice1 = (int) (1 + Math.random() * 6);
                dice2 = (int) (1 + Math.random() * 6);
                printLine("Los dados sacaron %d y %d. Total: %d", dice1, dice2, (dice1 + dice2));

                if (dice1 == 1 && dice2 == 1) {
                    ppts = 0;
                    player = 0;
                    playansw = 'N';
                    printLine("Pareja de 1. Jugador pierde toda su puntuación.");
                    printLine("Puntuación del Jugador: %d", player);
                    printLine();
                    printLine("Presione INTRO para continuar.");
                    scanLine();

                } else if (dice1 == 1 || dice2 == 1) {
                    ppts = 0;
                    player += ppts;
                    playansw = 'N';
                    printLine("Dado caido en 1. Jugador pierde la puntuación de este turno.");
                    printLine("Puntuación del Jugador: %d", player);
                    printLine();
                    printLine("Presione INTRO para continuar.");
                    scanLine();

                } else {
                    ppts = (dice1 + dice2);
                    player += ppts;
                    printLine("Puntuación del Jugador: %d", player);

                    if (player >= 100) {
                        playansw = 0;
                        printLine();
                        printLine("Has ganado a la máquina.");

                    } else {
                        printLine();
                        printLine("¿Desea hacer otro lanzamiento? S/N");
                        playansw = scanLine().toUpperCase().charAt(0);

                        if (playansw == 'N') {
                            printLine("No");

                        } else {
                            printLine("Si");
                        }
                    }

                }

            } while (playansw == 'S');

        }

    }
}