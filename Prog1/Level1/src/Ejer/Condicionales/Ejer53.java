public class Ejer53 extends Terminal{
    public static void main(String[] args) {
        var numRom = "";
        var numArab = 0;
        var numRomImp = "";
        printLine("Ingrese un número romano entre I y MMMCMXCIX");
        numRom = readLine().toUpperCase();
        numRomImp = numRom;
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

        
        
        
        printLine("El numero romano %s es %d", numRom, numArab);
    }
}
