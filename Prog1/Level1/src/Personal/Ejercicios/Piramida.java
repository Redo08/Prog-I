public class Piramida {
    public static void main(String[] args) {
        var number = 0;
        var limite = 0;
        Console.writeLine("Ingrese la longitud de la piramide"); // Piramide normal hacia arriba
        number = Integer.parseInt(Console.readLine());
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            Console.writeLine();
        }
        Console.writeLine("Listo seguimos con la otra piramide");


        Console.writeLine("Ingrese longitud"); // Piramide invertida
        number = Integer.parseInt(Console.readLine());

        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            Console.writeLine();
        }

        Console.writeLine("Ingrese numero"); // Intento de piramide al reves (Intento fallido)
        number = Integer.parseInt(Console.readLine());
        for (int i = 0; i <= number; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = number; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        Console.writeLine("Ingrese numero");
        number = Integer.parseInt(Console.readLine());
        for (int i = 0; i <= number; i++) {
            for (int k = 0; k < number - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Console.writeLine("Ingrese un numero: ");
        number = Integer.parseInt(Console.readLine());
        limite =  (Funcionesh.isEven(number)? number/2: number/2 +1);
        for (int i = 0; i < limite ; i++) {
            for(int j = i; limite >= j; j++){
                Console.write(" ");
            }
            for (int k = 0; k < (Funcionesh.isEven(number)? 2 + (i*2):1 + (i*2)); k++) {
                Console.write('*');
            }
            Console.writeLine();
        }
        Console.writeLine("Ingrese el numero");
        number = Integer.parseInt(Console.readLine());
        limite =  (Funcionesh.isEven(number)? number/2: number/2 +1);
        for (int i = limite; i > 0; i--){
            for(int k = i; k <= limite; k++){
                Console.write(" ");
            }
            for (int k = 2; k < (Funcionesh.isEven(number)? 2 + (i*2):1 + (i*2)); k++) {
                System.out.print("*");
            }
            Console.writeLine();
        }
    }
}

