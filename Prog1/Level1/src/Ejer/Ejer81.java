public class Ejer81 {
    public static void showSquare(char relleno) {
        var num = 0;
        Console.writeLine("Ingrese el tamaño del lado: ");
        num = Integer.parseInt(Console.readLine());
        if (relleno == 'S') {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    Console.write(" *");
                }
                Console.writeLine("");
            }
        } else {
            for (int i = 0; i < num; i++) {
                if (i == 0 || i == num - 1) {
                    for (int j = 0; j < num; j++) {
                        Console.write("*");
                    }
                } else {
                    Console.write("*");
                    for (int j = 0; j < num - 2; j++) {
                        Console.write(" ");
                    }
                    Console.write("*");
                }
                Console.writeLine("");
            }
        }
    }

    public static void showTriangleR(char relleno) {
        var height = 0;
        // var base = 0;
        Console.writeLine("Ingrese la altura del triangulo: ");
        height = Integer.parseInt(Console.readLine());
        // Console.writeLine("Ingrese la base del triangulo: "); Que define a un
        // triangulo rectangulo?
        // base = Integer.parseInt(Console.readLine());
        if (relleno == 'S') {
            for (int i = 0; i <= height; i++) {
                for (int j = 0; i > j; j++) {
                    Console.write(" *");
                }
                Console.writeLine("");

            }
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == height - 1 || j == i) {
                        Console.write("*");
                    } else {
                        Console.write(" ");
                    }
                }
                Console.writeLine("");
            }
        }
    }

    public static void showRectangle(char relleno) {
        var height = 0;
        var width = 0;
        Console.writeLine("Ingrese la altura del rectangulo: ");
        height = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese la anchura del rectangulo: ");
        width = Integer.parseInt(Console.readLine());
        if (relleno == 'S') {

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    Console.write(" *");
                }
                Console.writeLine("");
            }
        } else {
            for (int i = 0; i < height; i++) {

                if (i == 0 || i == height - 1) {
                    for (int j = 0; j < width; j++) {
                        Console.write("*");
                    }
                } else {
                    Console.write("*");
                    for (int j = 0; j < width - 2; j++) {
                        Console.write(" ");
                    }
                    Console.write("*");
                }
                Console.writeLine("");

            }
        }
    }

    public static void showTrinagleI(char relleno) {
        var lado = 0;
        var width = 0;
        var mayor = 0;
        var menor = 0;
        Console.writeLine("Ingrese el lado del triangulo: ");
        lado = Integer.parseInt(Console.readLine());
        /*Console.writeLine("Ingrese la base del triangulo: ");
        width = Integer.parseInt(Console.readLine());*/
        if (relleno == 'S') {
            for (int i = 0; i < lado; i++) {
                for (int k = 0;  k < lado - i; k++) {
                    Console.write(" ");
                }
                for (int j = 0; j < (i*2) - 1; j++) {
                    Console.write("*");
                }
                Console.writeLine("");
            }
        } else {
            for (int i = 0; i < lado; i++) {
                for (int k = 0; k <= lado - i; k++) {
                    if(k == lado-i){
                    Console.write(" ");
                    } else {
                        Console.write(" ");
                    }
                }
                for (int j = 0; j < (i*2) -1 ; j++) {
                    if (j == 0 || i == lado - 1 || j == i) {
                        Console.write("*");
                    } else {
                        Console.write(" ");
                    }
                }

                Console.writeLine("");
            }
        }
    }

    public static void showRombo(char relleno) {
        var num = 0;
        Console.writeLine("Ingrese el valor de un lado del rombo");
        num = Integer.parseInt(Console.readLine());
        if (relleno == 'S') {

            for (int i = 0; i < 5; i++) {
                for (int k = 5; k > i; k--) {
                    Console.write(" ");
                }
                for (int j = 0; j < i; j++) {
                    Console.write(" *");
                }
                Console.writeLine("");
            }

            for (int i = 5; 0 < i; i--) {
                for (int k = 5; k > i; k--) {
                    Console.write(" ");
                }
                for (int j = 0; j < i; j++) {
                    Console.write(" *");
                }
                Console.writeLine("");
            }
        } else {

            for (int i = 0; i < num; i++) {
                for (int k = 0; k < num - i; k++) {
                    Console.write(" ");
                }
                for (int j = 1; j < i; j++) {
                    if (j == 1 || j == 2 * i - 1) {
                        Console.write("*");
                    } else {
                        Console.write(" ");
                    }
                }
                Console.writeLine("");
            }

            for (int i = num; 0 < i; i--) {
                for (int k = 0; k < num - i; k++) {
                    Console.write(" ");
                }
                for (int j = 1; j < i; j++) {
                    if (j == 1 || j == 2*i -1) {
                        Console.write("*");
                    } else {
                        Console.write(" ");
                    }
                }
                Console.writeLine("");
            }
        }

    }

    public static void main(String[] args) {
        var lector = '?';
        var relleno = 's';

        do {
            Console.writeLine();
            Console.writeLine("+---------------------------------------+");
            Console.writeLine("|             MENU PRINCIPAL            |");
            Console.writeLine("+---------------------------------------+");
            Console.writeLine("|                                       |");
            Console.writeLine("|        1. Opción Cuadrado             |");
            Console.writeLine("|        2. Opción Triangulo Rectangulo |");
            Console.writeLine("|        3. Opción Rectangulo           |");
            Console.writeLine("|        4. Opción Triangulo Isoceles   |");
            Console.writeLine("|        5. Opción Rombo                |");
            Console.writeLine("|        6. Opción Hexagono             |");
            Console.writeLine("|        7. Opción Octagono             |");
            Console.writeLine("|        8. Salir                       |");
            Console.writeLine("|                                       |");
            Console.writeLine("+---------------------------------------+");
            lector = Console.readLine().toUpperCase().charAt(0);
            if (lector != '8') {
                Console.writeLine("Quiere relleno o no? (S/N)");
                relleno = Console.readLine().toUpperCase().charAt(0);
            }
            if (lector == '1') {
                showSquare(relleno);
            } else if (lector == '2') {
                showTriangleR(relleno);
            } else if (lector == '3') {
                showRectangle(relleno);
            } else if (lector == '4') {
                showTrinagleI(relleno);
            } else if (lector == '5') {
                showRombo(relleno);
            }
            /*
             * else if (lector == '6') {
             * showHexagon();
             * } else if (lector == '7') {
             * showOctagon();
             * }
             */
        } while (lector != '8');
    }
}