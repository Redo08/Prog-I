public class Funciones {
    public static boolean isDivisor(int num1, int num2) {
        return (num2 % num1 == 0);
    }

    public static boolean isMultiple(int num1, int num2) {
        return isDivisor(num2, num1);
    }

    public static boolean isEven(int num) {
        return isDivisor(2, num);
    }

    public static boolean isOdd(int num) {
        return !isEven(num);
    }

    public static boolean isPositive(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isNegative(int num) {
        if (num < 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int greater(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int smaller(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else
            return num2;
    }

    public static int factorial(int num) {
        int i = num - 1;
        while (i > 0) {
            num = num * i;
            i -= 1;

        }

        return num;
    }

    public static int doubleFactorial(int num) {
        int i = num - 2;
        while (i > 0) {
            num = num * i;
            i -= 2;

        }
        return num;
    }

    public static int countPosDivisors(int num) {
        var limit = (isNegative(num) ? -num / 2 : num / 2);
        var divisores = 1;
        var k = 1;
        while (k <= limit) {
            if (isDivisor(k, num)) {
                divisores += 1;
            }
            k += 1;
        }
        return divisores;
    }

    public static int countNegDivisors(int num) {
        return countPosDivisors(num);
    }

    public static int countDivisors(int num) {
        int suma = (num > 0) ? countPosDivisors(num) + countNegDivisors(-1 * num)
                : countPosDivisors(-1 * num) + countNegDivisors(num);
        return suma;
    }

    public static int sumPosDivisors(int num) {
        var limit = (isNegative(num) ? -num / 2 : num / 2);
        int k = 1;
        var total = (isNegative(num) ? -num : num);
        while (k <= limit) {
            if (Funciones.isDivisor(k, num)) {
                total += k;
            }
            k += 1;
        }
        return total;
    }

    public static int sumNegDivisors(int num) {
        return -sumPosDivisors(num);
    }

    public static int sumDivisors(int num) {
        return sumPosDivisors(num) + (-1 * sumNegDivisors(num));
    }

    public static boolean isComposite(int num) {
        var limit = (isNegative(num) ? -num / 2 : num / 2);
        var divisores = 2;
        var k = 2;
        while (k <= limit) {
            if (Funciones.isDivisor(k, num)) {
                divisores += 1;
            }
            k += 1;
        }
        return (divisores > 2);
    }

    public static boolean isPrime(int num) {
        return (isPositive(num) ? !isComposite(num) : false);
    }

    public static int Primorial(int num) {   //Multiplicación primos menores o iguales a el
        var primorial = 1;
        var i = 2;
        while (i <= num) {
            if (isPrime(i)) {
                primorial *= i;
            }
            i += 1;
        }
        return primorial;
    }

    public static boolean isPerfect(int num) {
        return sumPosDivisors(num) - num == num; // Se resta el num a sus divisores, porque para un numero perfecto no
                                                 // entra el mismo, osea es 1+2+3, NO 1+2+3+6.
    }

    public static boolean areFriends(int num1, int num2) {
        return sumPosDivisors(num2) - num2 == num1 && sumPosDivisors(num1) - num1 == num2;
    }

    public static int random(int limInf, int limSup) {
        var random = (int) (limInf + Math.random() * (limSup - limInf + 1));
        return random;
    }
    public static int suma(int num1, int num2){
        var total = num1 + num2;
        return total;
    }
    public static String convArabicToRoman(int num){
        var numRom = "";
        var salida = "No se permite ese numero";
        var residuo = 0;
        var cociente = 0;

        if (num > 3999 || num <= 0) {
            return salida;
        } else {
            cociente = num / 1000;
            residuo = num % 1000;
            
            if (cociente == 1) {
                numRom += "M";
            } else if (cociente == 2) {
                numRom += "MM";
            } else if (cociente == 3) {
                numRom += "MMM";
            }
            cociente = residuo / 100;
            residuo = residuo % 100;

            if (cociente == 1) {
                numRom += "C";
            } else if (cociente == 2) {
                numRom += "CC";
            } else if (cociente == 3) {
                numRom += "CCC";
            } else if (cociente == 4) {
                numRom += "CD";
            } else if (cociente == 5) {
                numRom += "D";
            } else if (cociente == 6) {
                numRom += "DC";
            } else if (cociente == 7) {
                numRom += "DCC";
            } else if (cociente == 8) {
                numRom += "DCCC";
            } else if (cociente == 9) {
                numRom += "CM";
            }
            cociente = residuo / 10;
            residuo = residuo % 10;

            if (cociente == 1) {
                numRom += "X";
            } else if (cociente == 2) {
                numRom += "XX";
            } else if (cociente == 3) {
                numRom += "XXX";
            } else if (cociente == 4) {
                numRom += "XL";
            } else if (cociente == 5) {
                numRom += "L";
            } else if (cociente == 6) {
                numRom += "LX";
            } else if (cociente == 7) {
                numRom += "LXX";
            } else if (cociente == 8) {
                numRom += "LXXX";
            } else if (cociente == 9) {
                numRom += "XC";
            }
            cociente = residuo;
            if (cociente == 1) {
                numRom += "I";
            } else if (cociente == 2) {
                numRom += "II";
            } else if (cociente == 3) {
                numRom += "III";
            } else if (cociente == 4) {
                numRom += "IV";
            } else if (cociente == 5) {
                numRom += "V";
            } else if (cociente == 6) {
                numRom += "VI";
            } else if (cociente == 7) {
                numRom += "VII";
            } else if (cociente == 8) {
                numRom += "VIII";
            } else if (cociente == 9) {
                numRom += "IX";
            }

            return numRom;

        }

    }
    public static int convRomanToArabic(String roman){
        var numArab = 0;
        var numRomImp = "";
        numRomImp = roman;
        if (numRomImp.startsWith("MMM")){
            numArab += 3000;
            numRomImp = numRomImp.substring(3);
        } 
         else if (numRomImp.startsWith("MM")){
            numArab += 2000;
            numRomImp = numRomImp.substring(2);
        }
        else if (numRomImp.startsWith("M")){
            numArab += 1000;
            numRomImp = numRomImp.substring(1);
        }
        if (numRomImp.startsWith("CM")){
            numArab += 900;
            numRomImp = numRomImp.substring(2);
        }
        else if (numRomImp.startsWith("DCCC")){
            numArab += 800;
            numRomImp = numRomImp.substring(4);
        }
        else if(numRomImp.startsWith("DCC")){
            numArab += 700;
            numRomImp = numRomImp.substring(3);
        }
        else if (numRomImp.startsWith("DC")){
            numArab += 600;
            numRomImp = numRomImp.substring(2);
        }
        else if (numRomImp.startsWith("D")){
            numArab += 500;
            numRomImp = numRomImp.substring(1);
        }
        else if (numRomImp.startsWith("CD")){
            numArab += 400;
            numRomImp = numRomImp.substring(2);
        }
        else if (numRomImp.startsWith("CCC")){
            numArab += 300;
            numRomImp = numRomImp.substring(3);
        }
        else if (numRomImp.startsWith("CC")){
            numArab += 200;
            numRomImp = numRomImp.substring(2);
        }
        else if (numRomImp.startsWith("C")){
            numArab += 100;
            numRomImp = numRomImp.substring(1);
        }
        if (numRomImp.startsWith("XC")){
            numArab += 90;
            numRomImp = numRomImp.substring(2);

        }
        else if (numRomImp.startsWith("LXXX")){
            numArab += 80;
            numRomImp = numRomImp.substring(4);
        }
        else if (numRomImp.startsWith("LXX")){
            numArab += 70;
            numRomImp = numRomImp.substring(3);
        }
        else if (numRomImp.startsWith("LX")){
            numArab += 60;
            numRomImp = numRomImp.substring(2);
        }
        else if (numRomImp.startsWith("L")){
            numArab += 50;
            numRomImp = numRomImp.substring(1);
        } 
        else if (numRomImp.startsWith("XL")){
            numArab += 40;
            numRomImp = numRomImp.substring(2);
        }
        else if (numRomImp.startsWith("XXX")){
            numArab += 30;
            numRomImp = numRomImp.substring(2);
        }
        else if (numRomImp.startsWith("XX")){
            numArab += 20;
            numRomImp = numRomImp.substring(2);
        }
        else if (numRomImp.startsWith("X")){
            numArab += 10;
            numRomImp = numRomImp.substring(1);
        }
        if (numRomImp.startsWith("IX")){
            numArab += 9;
        }
        else if (numRomImp.startsWith("VIII")){
            numArab += 8;
        }
        else if (numRomImp.startsWith("VII")){
            numArab += 7;
        }
        else if (numRomImp.startsWith("VI")){
            numArab += 6;
        }
        else if (numRomImp.startsWith("V")){
            numArab += 5;
        }
        else if (numRomImp.startsWith("IV")){
            numArab += 4;
        }
        else if (numRomImp.startsWith("III")){
            numArab += 3;
        }
        else if (numRomImp.startsWith("II")){
            numArab += 2;
        }
        else if (numRomImp.startsWith("I")){
            numArab += 1;
        }

        
        
        return numArab;
        
    
    }
    public static Float suma_arreglo(int[] num){
        Float add = 0f;
        for (var k = 0; k < num.length; k++){
            add += num[k];
        }
        return add;
    }
    public static Float average( int[] num){

        return (Float)(suma_arreglo(num)/num.length);
    }
    public static int[] convStrArrayToIntArray(String[] strings){
        int [] num = new int[strings.length];
        for(var k = 0; k < num.length; k++){
            num[k] = Integer.parseInt(strings[k].trim());  //Trim quita todos los espacios que los separen
        }
        return num;
    }
    
    public static void main(String[] args) {

    }
}