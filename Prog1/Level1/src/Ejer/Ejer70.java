public class Ejer70 {
    public static void showOption1(){
        var num1 = 0;
        var num2 = 0;
        Console.writeLine("Ingrese un numero entero: ");
        num2 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el divisor: ");
        num1 = Integer.parseInt(Console.readLine());
        if(Funcionesh.isDivisor(num1, num2)){
            Console.writeLine("El numero %d si es divisor de %d", num1, num2);
        } else {
            Console.writeLine("El numero %d NO es divisor de %d", num1, num2);
        }
    }
    public static void showOption2(){
        var num1 = 0;
        var num2 = 0;
        Console.writeLine("Ingrese un numero entero positivo: ");
        num2 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el multiplo: ");
        num1 = Integer.parseInt(Console.readLine());
        if(Funcionesh.isMultiple(num1, num2)){
            Console.writeLine("El numero %d si es multiplo de %d", num1, num2);
        } else {
            Console.writeLine("El numero %d NO es multiplo de %d", num1, num2);
        }
    }
    public static void showOption3(){
        var num = 0;
        Console.writeLine("Ingrese el numero entero: ");
        num = Integer.parseInt(Console.readLine());
        if(Funcionesh.isEven(num)){
            Console.writeLine("El numero %d es par", num);
        } else {
            Console.writeLine("El numero %d NO es par", num);
        }
    }
    public static void showOption4(){
        var num = 0;
        Console.writeLine("Ingrese el numero entero: ");
        num = Integer.parseInt(Console.readLine());
        if(Funcionesh.isOdd(num)){
            Console.writeLine("El numero %d es impar", num);
        } else {
            Console.writeLine("El numero %d NO es impar", num);
        }
    }
    public static void showOption5(){
        var num = 0;
        Console.writeLine("Ingrese el numero entero: ");
        num = Integer.parseInt(Console.readLine());
        if(Funcionesh.isPositive(num)){
            Console.writeLine("El numero %d es positivo", num);
        } else {
            Console.writeLine("El numero %d NO es positivo", num);
        }
    }
    public static void showOption6(){
        var num = 0;
        Console.writeLine("Ingrese el numero entero: ");
        num = Integer.parseInt(Console.readLine());
        if(Funcionesh.isNegative(num)){
            Console.writeLine("El numero %d es negativo", num);
        } else {
            Console.writeLine("El numero %d NO es negativo", num);
        }
    }
    public static void showOption7(){
        var great = 0;
        var num = 0;
        Console.writeLine("Ingrese un numero entero positivo: ");
        num = Integer.parseInt(Console.readLine());
        great = num;
        do{
            great = Funcionesh.greater(great, num);
            Console.writeLine("Ingrese otro numero entero positivo: ");
            num = Integer.parseInt(Console.readLine());
        } while (Funcionesh.isPositive(num));
        Console.writeLine("El numero mayor es %d", great);
    }
    public static void showOption8(){
        var menor = 0;
        var num = 0;
        Console.writeLine("Ingrese un número entero positivo: ");
        num = Integer.parseInt(Console.readLine());
        menor = num;
        do{
            menor = Funcionesh.smaller(num, menor);
            Console.writeLine("Ingrese otro numero entero positivo: ");
            num = Integer.parseInt(Console.readLine());
        } while (Funcionesh.isPositive(num));
        Console.writeLine("El numero menor es %d", menor);
    }
    public static void showOption9(){
        var num = 0;
        var factorial = 0;
        Console.writeLine("Ingrese un numero positivo entero: ");
        num = Integer.parseInt(Console.readLine());
        factorial = Funcionesh.factorial(num);
        Console.writeLine("El factorial de %d es: %d", num, factorial);
    }
    public static void showOptionA(){
        var num = 0;
        var doubleFactorial = 0;
        Console.writeLine("Ingrese un numero positivo entero: ");
        num = Integer.parseInt(Console.readLine());
        doubleFactorial = Funcionesh.doubleFactorial(num);
        Console.writeLine("El factorial de %d es: %d", num, doubleFactorial);
    }
    public static void showOptionB(){
        var num = 0;
        var posdivisors = 0;
        Console.writeLine("Ingrese un numero entero: ");
        num = Integer.parseInt(Console.readLine());
        posdivisors = Funcionesh.countPosDivisors(num);
        Console.writeLine("La cantidad de divisores positivos de %d, es: %d", num, posdivisors);
    }
    public static void showOptionC(){
        var num = 0;
        var negdivisors = 0;
        Console.writeLine("Ingrese un numero entero: ");
        num = Integer.parseInt(Console.readLine());
        negdivisors = Funcionesh.countNegDivisors(num);
        Console.writeLine("La cantidad de divisores negativos de %d, es: %d", num, negdivisors);
    }
    public static void showOptionD(){
        var num = 0;
        var divisors = 0;
        Console.writeLine("Ingrese un numero entero: ");
        num = Integer.parseInt(Console.readLine());
        divisors = Funcionesh.countDivisors(num);
        Console.writeLine("La cantidad de divisores de %d, es: %d", num, divisors);
    }
    public static void showOptionE(){
        var num = 0;
        var sumposdivisors = 0;
        Console.writeLine("Ingrese un numero entero: ");
        num = Integer.parseInt(Console.readLine());
        sumposdivisors = Funcionesh.sumPosDivisors(num);
        Console.writeLine("La suma de divisores positivos de %d, es: %d", num, sumposdivisors);
    }
    public static void showOptionF(){
        var num = 0;
        var sumNegdivisors = 0;
        Console.writeLine("Ingrese un numero entero: ");
        num = Integer.parseInt(Console.readLine());
        sumNegdivisors = Funcionesh.sumNegDivisors(num);
        Console.writeLine("La suma de divisores negativos de %d, es: %d", num, sumNegdivisors);
    }
    public static void showOptionG(){
        var num = 0;
        var sumdivisors = 0;
        Console.writeLine("Ingrese un numero entero: ");
        num = Integer.parseInt(Console.readLine());
        sumdivisors = Funcionesh.sumDivisors(num);
        Console.writeLine("La suma de divisores de %d, es: %d", num, sumdivisors);
    }
    public static void showOptionH(){
        var num = 0;
        Console.writeLine("Ingrese un numero para saber si es compuesto: ");
        num = Integer.parseInt(Console.readLine());
        if(Funcionesh.isComposite(num)){
            Console.writeLine("El numero %d es compuesto", num);
        } else {
            Console.writeLine("El numero %d NO es compuesto", num);
        }
    }
    public static void showOptionI(){
        var num = 0;
        Console.writeLine("Ingrese un numero para saber si es primo: ");
        num = Integer.parseInt(Console.readLine());
        if(Funcionesh.isPrime(num)){
            Console.writeLine("El numero %d es primo", num);
        } else {
            Console.writeLine("El numero %d NO es primo", num);
        }
    }
    public static void showOptionJ(){
        var num = 0;
        var primorial = 0;
        Console.writeLine("Ingrese un numero para ver su primorial: ");
        num = Integer.parseInt(Console.readLine());
        primorial = Funcionesh.Primorial(num);
        Console.writeLine("El primorial de %d es: %d", num, primorial);
    }
    public static void showOptionK(){
        var num = 0;
        Console.writeLine("Ingrese un numero para ver si es perfecto: ");
        num = Integer.parseInt(Console.readLine());
        if(Funcionesh.isPerfect(num)){
            Console.writeLine("El numero %d es perfecto", num);
        } else {
            Console.writeLine("El numero %d NO es perfecto", num);
        }
    }
    public static void showOptionL(){
        var num1 = 0;
        var num2 = 0;
        Console.writeLine("Ingrese un numero: ");
        num1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese otro numero: ");
        num2 = Integer.parseInt(Console.readLine());
        if(Funcionesh.areFriends(num1, num2)){
            Console.writeLine("Los numeros %d y %d son amigos!", num1, num2);
        } else {
            Console.writeLine("Los numeros %d y %d NO son amigos", num1, num2);
        }
    }
    public static void showOptionM(){
        var limInf = 0;
        var limSup = 0;
        var random = 0;
        Console.writeLine("Ingrese el limite inferior para un numero random: ");
        limInf = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el limite superior para un numero random: ");
        limSup = Integer.parseInt(Console.readLine());
        random = Funcionesh.random(limInf, limSup);
        Console.writeLine("El numero random es: %d", random);
    }
    public static void showMenu(){
        var option = '?';
        do{
            Console.writeLine();
            Console.writeLine("+---------------------------------------+");
            Console.writeLine("|             MENU PRINCIPAL            |");
            Console.writeLine("+---------------------------------------+");
            Console.writeLine("|                                       |");
            Console.writeLine("|          1. Opción es divisor         |");
            Console.writeLine("|          2. Opción es multiplo        |");
            Console.writeLine("|          3. Opción es par             |");
            Console.writeLine("|          4. Opción es impar           |");
            Console.writeLine("|          5. Opción es positivo        |");
            Console.writeLine("|          6. Opción es negativo        |");
            Console.writeLine("|          7. Opción mayor              |");
            Console.writeLine("|          8. Opción menor              |");
            Console.writeLine("|          9. Opción factorial          |");
            Console.writeLine("|          A. Opción doble-Factorial    |");
            Console.writeLine("|          B. Opción countPosDivisors   |");
            Console.writeLine("|          C. Opción countNegDivisors   |");
            Console.writeLine("|          D. Opción countDivisors      |");
            Console.writeLine("|          E. Opción sumPosDivisors     |");
            Console.writeLine("|          F. Opción sumNegDivisors     |");
            Console.writeLine("|          G. Opción sumDivisors        |");
            Console.writeLine("|          H. Opción es compuesto       |");
            Console.writeLine("|          I. Opción es primo           |");
            Console.writeLine("|          J. Opción es primorial       |");
            Console.writeLine("|          K. Opción es perfecto        |");
            Console.writeLine("|          L. Opción son amigos         |");
            Console.writeLine("|          M. Opción es random          |");
            Console.writeLine("|                                       |");
            Console.writeLine("|             S. Salir                  |");
            Console.writeLine("+---------------------------------------+"); 
            Console.writeLine();
            Console.writeLine("Seleccione una opción y presione la tecla [Enter]");


            option = Console.readLine().toUpperCase().charAt(0);
            if (option == '1'){
                showOption1();
            }
            else if(option == '2'){
                showOption2();
            }
            else if(option == '3'){
                showOption3();
            }
            else if(option == '4'){
                showOption4();
            }
            else if(option == '5'){
                showOption5();
            }
            else if(option == '6'){
                showOption6();
            }
            else if(option == '7'){
                showOption7();
            }
            else if (option == '8'){
                showOption8();
            } 
            else if (option == '9'){
                showOption9();
            }
            else if (option == 'A'){
                showOptionA();
            }
            else if (option == 'B'){
                showOptionB();
            }
            else if (option == 'C'){
                showOptionC();
            }
            else if (option == 'D'){
                showOptionD();
            }
            else if (option == 'E'){
                showOptionE();
            }
            else if (option == 'F'){
                showOptionF();
            }
            else if (option == 'G'){
                showOptionG();
            }
            else if (option == 'H'){
                showOptionH();
            }
            else if (option == 'I'){
                showOptionI();
            }
            else if (option == 'J'){
                showOptionJ();
            }
            else if (option == 'K'){
                showOptionK();
            }
            else if (option == 'L'){
                showOptionL();
            }
            else if (option == 'M'){
                showOptionM();
            }
            else if(option != 'S'){
                Console.writeLine("Esa función no esta disponible");
            }
        }while(option != 'S');
    } 

    public static void main(String[] args) {
        showMenu();
    }

}
