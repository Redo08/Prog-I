public class Asteriscos {
    public static void main(String[] args) {

        // Piramide 1

        var num = 0;
        Console.writeLine("Ingrese la altura de la piramide: ");
        num = Integer.parseInt(Console.readLine());
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                Console.write("  ");
            }
            for (int k = 0; k < i; k++) {
                Console.write(" *");
            }
            Console.writeLine("");
        }

        // Piramide 2

        Console.writeLine("La altura de la piramide es: ");
        num = Integer.parseInt(Console.readLine());
        for (int i = num; 0 < i; i--) {
            for (int j = 0; j < i; j++) {
                Console.write(" *");
            }
            Console.writeLine("");
        }


        //Piramide girada

        var contador = 0;
        Console.writeLine("Ingrese la altura: ");
        num = Integer.parseInt(Console.readLine());
        while (contador < 2) {
            if (contador == 0) {
                for (int i = 0; i <= num; i++) {
                    for (int j = 0; j < i; j++) {
                        Console.write(" *");
                    }
                    Console.writeLine("");
                }
            } else {
                for (int i = num - 1; 0 < i; i--){
                    for (int j = 0; j < i; j++){
                        Console.write(" *");
                    }
                    Console.writeLine("");
                }
            }
            contador += 1;
        }



        //Rectangulo hueco

        var n = 0;
        var m = 0;
        Console.writeLine("Ingrese el valor del ancho");
        n = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el valor de la altura");
        m = Integer.parseInt(Console.readLine());
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if( i == 1 || i == 2){
                    Console.write(" *");
                    for (int k = 0; k < 12; k++){
                        Console.write(" ");
                    }
                    Console.write(" *");
                    j = n;
                } else {
                    Console.write(" *");
                }
            }
            Console.writeLine("");
        }
    }
}
