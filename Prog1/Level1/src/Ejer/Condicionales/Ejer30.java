public class Ejer30 {
    public static void main(String[] args) {
        var numRom = "";
        var num = 0;
        var residuo = 0;
        var cociente = 0;

        Console.writeLine("Ingrese un numero entero entre 1 y 3999");
        num = Integer.parseInt(Console.readLine());
        if (num > 3999 && num <= 0) {
            Console.writeLine("No se permite este numero");
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

            Console.writeLine("El numero romano es : %S", numRom);

        }

    }

}
