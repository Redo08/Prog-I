public class Ejer32 {
    public static void main(String[] args) {
        int numT0 = 0;
        int numT1 = 0;
        int numT2 = 0;
        int numT3 = 0;
        int numT4 = 0;
        int numT5 = 0;
        int numT6 = 0;
        int numT7 = 0;
        int numT8 = 0;
        int numT9 = 0;
        int numT10 = 0;
        int numT11 = 0;
        int numT12 = 0;
        int numT13 = 0;
        int numT14 = 0;
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;
        int num10 = 0;
        int num11 = 0;
        int num12 = 0;
        int num13 = 0;
        int num14 = 0;
        int total = 0;
        String numRom = "";
        char romanChar = '?';
        char posicion0, posicion1, posicion2, posicion3, posicion4, posicion5, posicion6, posicion7, posicion8,
                posicion9, posicion10, posicion11, posicion12, posicion13, posicion14 = '?';
        // .lenght ==> Conseguir longitud de caracteres

        Console.writeLine("Ingrese un numero romano entre I y MMMCMXCIX");
        numRom = Console.readLine().toUpperCase();
        int index = numRom.length() - 1;

        if (index == 0) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }
            numT0 = num0;

        }
        else if (index == 1) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
            }
            else {
                numT1 = num1 + num0;
            }

        }
        else if (index == 2) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }

            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if  (num2 > num1){
                numT2 = num2-num1;
            } else {
                numT2 = num2 + num1;
            }
             
            
            
             

        }
        else if (index == 3) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if  (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 <num0 || num1 == num0) {
                numT2 = num1;
            } else{
                numT2 = 0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if (num3 > num2){
                numT3 = num3-num2;
            }else {
                numT3 = num3 + num2;
            }
        }
        else if (index == 4) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 < num0 || num1 == num0){
                numT2 = num1;
            } else {
                numT2 =0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if (num3 > num2){
                numT3 = num3 - num2;
            } else if (num2 < num1 || num2 == num1){
                numT3 = num2;
            } else{
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            }
            if (num4 > num3) {
                numT4 = num4-num3;
            } else {
                numT4 = num4 + num3;
            }

        }
        else if (index == 5) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 < num0 || num1 == num0){
                numT2 = num1;
            } else {
                numT2 =0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if (num3 > num2){
                numT3 = num3 - num2;
            } else if( num2 < num1 || num2 == num1) {
                numT3 = num2;
            } else {
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            }
            if (num4 > num3) {
                numT4 = num4-num3;
            } else if (num3 < num2 || num3 == num2){
                numT4 = num3;
            } else {
                numT4 = 0;
            }
            
            

            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if (num5 > num4){
                numT5 = num5-num4;
            }
            else{
                numT5 = num5+num4;
            }
        }
        else if (index == 6) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);
            posicion6 = numRom.charAt(6);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 < num0 || num1 == num0){
                numT2 = num1;
            } else{
                numT2 = 0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            } 
            if (num3 > num2){
                numT3 = num3 - num2;
            } else if (num2 < num1 || num2 == num1) {
                numT3 = num2;
            } else {
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            } if (num4 > num3){
                numT4 = num4-num3;
            } else if (num3 < num2 || num3 == num2) {
                numT4 = num3;
            } else{
                numT4 = 0;
            }

            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if (num5 > num4){
                numT5 = num5-num4;
            }else if (num4 < num3 || num4 == num3){
                numT5 = num4;
            } else{
                numT5 = 0;
            }

            if (posicion6 == 'M') {
                num6 = +1000;
            } else if (posicion6 == 'D') {
                num6 = +500;
            } else if (posicion6 == 'C') {
                num6 = +100;
            } else if (posicion6 == 'L') {
                num6 = +50;
            } else if (posicion6 == 'X') {
                num6 = +10;
            } else if (posicion6 == 'V') {
                num6 = +5;
            } else if (posicion6 == 'I') {
                num6 = +1;

            }
            if (num6 > num5){
                numT6 = num6-num5;
            } else {
                numT6 = num6 + num5;
            }
        }
        else if (index == 7) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);
            posicion6 = numRom.charAt(6);
            posicion7 = numRom.charAt(7);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if(num1 > num0){
                numT1 = num1-num0;
            } else{
                numT1 = num0;
            }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 < num0 || num1 == num0){
                numT2 = num1;
            } else {
                numT2 = 0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if (num3 > num2){
                numT3 = num3-num2;
            } else if(num2 < num1 || num2 == num1){
                numT3 = num2;
            } else{
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            } 
            if (num4 > num3){
                numT4 = num4-num3;
            } else if (num3 < num2 || num3 == num2){
                numT4 = num3;
            } else{
                numT4 = 0;
            }

            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if (num5 > num4){
                numT5 = num5-num4;
            } else if (num4 < num3 || num4 == num3){
                numT5 = num3;
            } else{
                numT5 = 0;
            }

            if (posicion6 == 'M') {
                num6 = +1000;
            } else if (posicion6 == 'D') {
                num6 = +500;
            } else if (posicion6 == 'C') {
                num6 = +100;
            } else if (posicion6 == 'L') {
                num6 = +50;
            } else if (posicion6 == 'X') {
                num6 = +10;
            } else if (posicion6 == 'V') {
                num6 = +5;
            } else if (posicion6 == 'I') {
                num6 = +1;

            } 
            if (num6 > num5){
                numT6 = num6-num5;
            } else if (num5 < num4 || num5 == num4){
                numT6 = num5;
            } else{
                numT6 = 0;
            }

            if (posicion7 == 'M') {
                num7 = +1000;
            } else if (posicion7 == 'D') {
                num7 = +500;
            } else if (posicion7 == 'C') {
                num7 = +100;
            } else if (posicion7 == 'L') {
                num7 = +50;
            } else if (posicion7 == 'X') {
                num7 = +10;
            } else if (posicion7 == 'V') {
                num7 = +5;
            } else if (posicion7 == 'I') {
                num7 = +1;

            }
            if (num7 > num6){
                numT7 = num7 - num6;
            } else {
                numT7 = num7 + num6;
            }

        }
        else if (index == 8) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);
            posicion6 = numRom.charAt(6);
            posicion7 = numRom.charAt(7);
            posicion8 = numRom.charAt(8);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
            } else{
                numT1 = num0;
            }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 < num0 || num1 == num0){
                numT2 = num1;
            } else{
                numT2 = 0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if (num3 > num2){
                numT3 = num3-num2;
            } else if (num2 < num1 || num2 == num1){
                numT3 = num2;
            } else{
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            }
            if (num4 > num3){
                numT4 = num4-num3;
            } else if (num3 < num2 || num3 == num2){
                numT4 = num3;
            } else {
                numT4 = 0;
            }

            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if (num5 > num4){
                numT5 = num5-num4;
            } else if (num4 < num3 || num4 == num3){
                numT5 = num4;
            } else {
                numT5 = 0;
            }

            if (posicion6 == 'M') {
                num6 = +1000;
            } else if (posicion6 == 'D') {
                num6 = +500;
            } else if (posicion6 == 'C') {
                num6 = +100;
            } else if (posicion6 == 'L') {
                num6 = +50;
            } else if (posicion6 == 'X') {
                num6 = +10;
            } else if (posicion6 == 'V') {
                num6 = +5;
            } else if (posicion6 == 'I') {
                num6 = +1;

            }
            if (num6 > num5){
                numT6 = num6-num5;
            } else if (num5 < num4 || num5 == num4){
                numT6 = num5;
            } else {
                numT6 = 0;
            }

            if (posicion7 == 'M') {
                num7 = +1000;
            } else if (posicion7 == 'D') {
                num7 = +500;
            } else if (posicion7 == 'C') {
                num7 = +100;
            } else if (posicion7 == 'L') {
                num7 = +50;
            } else if (posicion7 == 'X') {
                num7 = +10;
            } else if (posicion7 == 'V') {
                num7 = +5;
            } else if (posicion7 == 'I') {
                num7 = +1;

            }
            if (num7 > num6){
                numT7 = num7-num6;
            } else if (num6 < num5 || num6 == num5){
                numT7 = num6;
            } else {
                numT7 = 0;
            }

            if (posicion8 == 'M') {
                num8 = +1000;
            } else if (posicion8 == 'D') {
                num8 = +500;
            } else if (posicion8 == 'C') {
                num8 = +100;
            } else if (posicion8 == 'L') {
                num8 = +50;
            } else if (posicion8 == 'X') {
                num8 = +10;
            } else if (posicion8 == 'V') {
                num8 = +5;
            } else if (posicion8 == 'I') {
                num8 = +1;

            }
            if (num8 > num7){
                numT8 = num8-num7;
            } else {
                numT8 = num8+num7;
            }
        }
        else if (index == 9) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);
            posicion6 = numRom.charAt(6);
            posicion7 = numRom.charAt(7);
            posicion8 = numRom.charAt(8);
            posicion9 = numRom.charAt(9);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            } 
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if  (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 <num0 || num1 == num0) {
                numT2 = num1;
            } else{
                numT2 = 0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            } 
            if  (num3 > num2){
                numT3 = num3-num2;
            } else if (num2 <num1 || num2 == num1) {
                numT3 = num2;
            } else{
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            }
            if  (num4 > num3){
                numT4 = num4-num3;
            } else if (num3 <num2 || num3 == num2) {
                numT4 = num3;
            } else{
                numT4 = 0;
            }


            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if  (num5 > num4){
                numT5 = num5-num4;
            } else if (num4 <num3 || num4 == num3) {
                numT5 = num4;
            } else{
                numT5 = 0;
            }

            if (posicion6 == 'M') {
                num6 = +1000;
            } else if (posicion6 == 'D') {
                num6 = +500;
            } else if (posicion6 == 'C') {
                num6 = +100;
            } else if (posicion6 == 'L') {
                num6 = +50;
            } else if (posicion6 == 'X') {
                num6 = +10;
            } else if (posicion6 == 'V') {
                num6 = +5;
            } else if (posicion6 == 'I') {
                num6 = +1;

            }
            if  (num6 > num5){
                numT6 = num6-num5;
            } else if (num5 <num4 || num5 == num4) {
                numT6 = num5;
            } else{
                numT6 = 0;
            }

            if (posicion7 == 'M') {
                num7 = +1000;
            } else if (posicion7 == 'D') {
                num7 = +500;
            } else if (posicion7 == 'C') {
                num7 = +100;
            } else if (posicion7 == 'L') {
                num7 = +50;
            } else if (posicion7 == 'X') {
                num7 = +10;
            } else if (posicion7 == 'V') {
                num7 = +5;
            } else if (posicion7 == 'I') {
                num7 = +1;

            }
            if  (num7 > num6){
                numT7 = num7-num6;
            } else if (num6 <num5 || num6 == num5) {
                numT7 = num6;
            } else{
                numT7 = 0;
            }

            if (posicion8 == 'M') {
                num8 = +1000;
            } else if (posicion8 == 'D') {
                num8 = +500;
            } else if (posicion8 == 'C') {
                num8 = +100;
            } else if (posicion8 == 'L') {
                num8 = +50;
            } else if (posicion8 == 'X') {
                num8 = +10;
            } else if (posicion8 == 'V') {
                num8 = +5;
            } else if (posicion8 == 'I') {
                num8 = +1;

            }
            if  (num8 > num7){
                numT8 = num8-num7;
            } else if (num7 <num6 || num7 == num6) {
                numT8 = num7;
            } else{
                numT8 = 0;
            }

            if (posicion9 == 'M') {
                num9 = +1000;
            } else if (posicion9 == 'D') {
                num9 = +500;
            } else if (posicion9 == 'C') {
                num9 = +100;
            } else if (posicion9 == 'L') {
                num9 = +50;
            } else if (posicion9 == 'X') {
                num9 = +10;
            } else if (posicion9 == 'V') {
                num9 = +5;
            } else if (posicion9 == 'I') {
                num9 = +1;

            }
            if  (num9 > num8){
                numT9 = num9-num8;
            } else  {
                numT9 = num9 + num8;
            } 
        }
        else if (index == 10) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);
            posicion6 = numRom.charAt(6);
            posicion7 = numRom.charAt(7);
            posicion8 = numRom.charAt(8);
            posicion9 = numRom.charAt(9);
            posicion10 = numRom.charAt(10);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if  (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 <num0 || num1 == num0) {
                numT2 = num1;
            } else{
                numT2 = 0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if  (num3 > num2){
                numT3 = num3-num2;
            } else if (num2 <num1 || num2 == num1) {
                numT3 = num2;
            } else{
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            }
            if  (num4 > num3){
                numT4 = num4-num3;
            } else if (num3 <num2 || num3 == num2) {
                numT4 = num3;
            } else{
                numT4 = 0;
            }

            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if  (num5 > num4){
                numT5 = num5-num4;
            } else if (num4 <num3 || num4 == num3) {
                numT5 = num4;
            } else{
                numT5 = 0;
            }

            if (posicion6 == 'M') {
                num6 = +1000;
            } else if (posicion6 == 'D') {
                num6 = +500;
            } else if (posicion6 == 'C') {
                num6 = +100;
            } else if (posicion6 == 'L') {
                num6 = +50;
            } else if (posicion6 == 'X') {
                num6 = +10;
            } else if (posicion6 == 'V') {
                num6 = +5;
            } else if (posicion6 == 'I') {
                num6 = +1;

            }
            if  (num6 > num5){
                numT6 = num6-num5;
            } else if (num5 <num4 || num5 == num4) {
                numT6 = num5;
            } else{
                numT6 = 0;
            }

            if (posicion7 == 'M') {
                num7 = +1000;
            } else if (posicion7 == 'D') {
                num7 = +500;
            } else if (posicion7 == 'C') {
                num7 = +100;
            } else if (posicion7 == 'L') {
                num7 = +50;
            } else if (posicion7 == 'X') {
                num7 = +10;
            } else if (posicion7 == 'V') {
                num7 = +5;
            } else if (posicion7 == 'I') {
                num7 = +1;

            }
            if  (num7 > num6){
                numT7 = num7-num6;
            } else if (num6 <num5 || num6 == num5) {
                numT7 = num6;
            } else{
                numT7 = 0;
            }

            if (posicion8 == 'M') {
                num8 = +1000;
            } else if (posicion8 == 'D') {
                num8 = +500;
            } else if (posicion8 == 'C') {
                num8 = +100;
            } else if (posicion8 == 'L') {
                num8 = +50;
            } else if (posicion8 == 'X') {
                num8 = +10;
            } else if (posicion8 == 'V') {
                num8 = +5;
            } else if (posicion8 == 'I') {
                num8 = +1;

            }
            if  (num8 > num7){
                numT8 = num8-num7;
            } else if (num7 <num6 || num7 == num6) {
                numT8 = num7;
            } else{
                numT8 = 0;
            }


            if (posicion9 == 'M') {
                num9 = +1000;
            } else if (posicion9 == 'D') {
                num9 = +500;
            } else if (posicion9 == 'C') {
                num9 = +100;
            } else if (posicion9 == 'L') {
                num9 = +50;
            } else if (posicion9 == 'X') {
                num9 = +10;
            } else if (posicion9 == 'V') {
                num9 = +5;
            } else if (posicion9 == 'I') {
                num9 = +1;

            }
            if  (num9 > num8){
                numT9 = num9-num8;
            } else if (num8 <num7 || num8 == num7) {
                numT9 = num8;
            } else{
                numT9 = 0;
            }


            if (posicion10 == 'M') {
                num10 = +1000;
            } else if (posicion10 == 'D') {
                num10 = +500;
            } else if (posicion10 == 'C') {
                num10 = +100;
            } else if (posicion10 == 'L') {
                num10 = +50;
            } else if (posicion10 == 'X') {
                num10 = +10;
            } else if (posicion10 == 'V') {
                num10 = +5;
            } else if (posicion10 == 'I') {
                num10 = +1;

            }
            if (num10 > num9){
                numT10 = num10-num9;
            } else {
                numT10 = num10+num9;
            }
        }
        else if (index == 11) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);
            posicion6 = numRom.charAt(6);
            posicion7 = numRom.charAt(7);
            posicion8 = numRom.charAt(8);
            posicion9 = numRom.charAt(9);
            posicion10 = numRom.charAt(10);
            posicion11 = numRom.charAt(11);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if  (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 <num0 || num1 == num0) {
                numT2 = num1;
            } else{
                numT2 = 0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if  (num3 > num2){
                numT3 = num3-num2;
            } else if (num2 <num1 || num2 == num1) {
                numT3 = num2;
            } else{
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            }
            if  (num4 > num3){
                numT4 = num4-num3;
            } else if (num3 <num2 || num3 == num2) {
                numT4 = num3;
            } else{
                numT4 = 0;
            }

            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if  (num5 > num4){
                numT5 = num5-num4;
            } else if (num4 <num3 || num4 == num3) {
                numT5 = num4;
            } else{
                numT5 = 0;
            }

            if (posicion6 == 'M') {
                num6 = +1000;
            } else if (posicion6 == 'D') {
                num6 = +500;
            } else if (posicion6 == 'C') {
                num6 = +100;
            } else if (posicion6 == 'L') {
                num6 = +50;
            } else if (posicion6 == 'X') {
                num6 = +10;
            } else if (posicion6 == 'V') {
                num6 = +5;
            } else if (posicion6 == 'I') {
                num6 = +1;

            }
            if  (num6 > num5){
                numT6 = num6-num5;
            } else if (num5 <num4 || num5 == num4) {
                numT6 = num5;
            } else{
                numT6 = 0;
            }

            if (posicion7 == 'M') {
                num7 = +1000;
            } else if (posicion7 == 'D') {
                num7 = +500;
            } else if (posicion7 == 'C') {
                num7 = +100;
            } else if (posicion7 == 'L') {
                num7 = +50;
            } else if (posicion7 == 'X') {
                num7 = +10;
            } else if (posicion7 == 'V') {
                num7 = +5;
            } else if (posicion7 == 'I') {
                num7 = +1;

            }
            if  (num7 > num6){
                numT7 = num7-num6;
            } else if (num6 <num5 || num6 == num5) {
                numT7 = num6;
            } else{
                numT7 = 0;
            }


            if (posicion8 == 'M') {
                num8 = +1000;
            } else if (posicion8 == 'D') {
                num8 = +500;
            } else if (posicion8 == 'C') {
                num8 = +100;
            } else if (posicion8 == 'L') {
                num8 = +50;
            } else if (posicion8 == 'X') {
                num8 = +10;
            } else if (posicion8 == 'V') {
                num8 = +5;
            } else if (posicion8 == 'I') {
                num8 = +1;

            }
            if  (num8 > num7){
                numT8 = num8-num7;
            } else if (num7 <num6 || num7 == num6) {
                numT8 = num7;
            } else{
                numT8 = 0;
            }

            if (posicion9 == 'M') {
                num9 = +1000;
            } else if (posicion9 == 'D') {
                num9 = +500;
            } else if (posicion9 == 'C') {
                num9 = +100;
            } else if (posicion9 == 'L') {
                num9 = +50;
            } else if (posicion9 == 'X') {
                num9 = +10;
            } else if (posicion9 == 'V') {
                num9 = +5;
            } else if (posicion9 == 'I') {
                num9 = +1;

            }
            if  (num9 > num8){
                numT9 = num9-num8;
            } else if (num8 <num7 || num8 == num7) {
                numT9 = num8;
            } else{
                numT9 = 0;
            }


            if (posicion10 == 'M') {
                num10 = +1000;
            } else if (posicion10 == 'D') {
                num10 = +500;
            } else if (posicion10 == 'C') {
                num10 = +100;
            } else if (posicion10 == 'L') {
                num10 = +50;
            } else if (posicion10 == 'X') {
                num10 = +10;
            } else if (posicion10 == 'V') {
                num10 = +5;
            } else if (posicion10 == 'I') {
                num10 = +1;

            }
            if  (num10 > num9){
                numT10 = num10-num9;
            } else if (num9 <num8 || num9 == num8) {
                numT10 = num9;
            } else{
                numT10 = 0;
            }


            if (posicion11 == 'M') {
                num11 = +1000;
            } else if (posicion11 == 'D') {
                num11 = +500;
            } else if (posicion11 == 'C') {
                num11 = +100;
            } else if (posicion11 == 'L') {
                num11 = +50;
            } else if (posicion11 == 'X') {
                num11 = +10;
            } else if (posicion11 == 'V') {
                num11 = +5;
            } else if (posicion11 == 'I') {
                num11 = +1;

            }
            if (num11 > num10){
                numT11 = num11-num10;
            } else{
                numT11 = num11 + num10;
            }
        }
        else if (index == 12) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);
            posicion6 = numRom.charAt(6);
            posicion7 = numRom.charAt(7);
            posicion8 = numRom.charAt(8);
            posicion9 = numRom.charAt(9);
            posicion10 = numRom.charAt(10);
            posicion11 = numRom.charAt(11);
            posicion12 = numRom.charAt(12);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if  (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 <num0 || num1 == num0) {
                numT2 = num1;
            } else{
                numT2 = 0;
            }


            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if  (num3 > num2){
                numT3 = num3-num2;
            } else if (num2 <num1 || num2 == num1) {
                numT3 = num2;
            } else{
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            }
            if  (num4 > num3){
                numT4 = num4-num3;
            } else if (num3 <num2 || num3 == num2) {
                numT4 = num3;
            } else{
                numT4 = 0;
            }


            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if  (num5 > num4){
                numT5 = num5-num4;
            } else if (num4 <num3 || num4 == num3) {
                numT5 = num4;
            } else{
                numT5 = 0;
            }

            if (posicion6 == 'M') {
                num6 = +1000;
            } else if (posicion6 == 'D') {
                num6 = +500;
            } else if (posicion6 == 'C') {
                num6 = +100;
            } else if (posicion6 == 'L') {
                num6 = +50;
            } else if (posicion6 == 'X') {
                num6 = +10;
            } else if (posicion6 == 'V') {
                num6 = +5;
            } else if (posicion6 == 'I') {
                num6 = +1;

            }
            if  (num6 > num5){
                numT6 = num6-num5;
            } else if (num5 <num4 || num5 == num4) {
                numT6 = num5;
            } else{
                numT6 = 0;
            }

            if (posicion7 == 'M') {
                num7 = +1000;
            } else if (posicion7 == 'D') {
                num7 = +500;
            } else if (posicion7 == 'C') {
                num7 = +100;
            } else if (posicion7 == 'L') {
                num7 = +50;
            } else if (posicion7 == 'X') {
                num7 = +10;
            } else if (posicion7 == 'V') {
                num7 = +5;
            } else if (posicion7 == 'I') {
                num7 = +1;

            }
            if  (num7 > num6){
                numT7 = num7-num6;
            } else if (num6 <num5 || num6 == num5) {
                numT7 = num6;
            } else{
                numT7 = 0;
            }

            if (posicion8 == 'M') {
                num8 = +1000;
            } else if (posicion8 == 'D') {
                num8 = +500;
            } else if (posicion8 == 'C') {
                num8 = +100;
            } else if (posicion8 == 'L') {
                num8 = +50;
            } else if (posicion8 == 'X') {
                num8 = +10;
            } else if (posicion8 == 'V') {
                num8 = +5;
            } else if (posicion8 == 'I') {
                num8 = +1;

            }
            if  (num8 > num7){
                numT8 = num8-num7;
            } else if (num7 <num6 || num7 == num6) {
                numT8 = num7;
            } else{
                numT8 = 0;
            }


            if (posicion9 == 'M') {
                num9 = +1000;
            } else if (posicion9 == 'D') {
                num9 = +500;
            } else if (posicion9 == 'C') {
                num9 = +100;
            } else if (posicion9 == 'L') {
                num9 = +50;
            } else if (posicion9 == 'X') {
                num9 = +10;
            } else if (posicion9 == 'V') {
                num9 = +5;
            } else if (posicion9 == 'I') {
                num9 = +1;

            }
            if  (num9 > num8){
                numT9 = num9-num8;
            } else if (num8 <num7 || num8 == num7) {
                numT9 = num8;
            } else{
                numT9 = 0;
            } 

            if (posicion10 == 'M') {
                num10 = +1000;
            } else if (posicion10 == 'D') {
                num10 = +500;
            } else if (posicion10 == 'C') {
                num10 = +100;
            } else if (posicion10 == 'L') {
                num10 = +50;
            } else if (posicion10 == 'X') {
                num10 = +10;
            } else if (posicion10 == 'V') {
                num10 = +5;
            } else if (posicion10 == 'I') {
                num10 = +1;

            }
            if  (num10 > num9){
                numT10 = num10-num9;
            } else if (num9 <num8 || num9 == num8) {
                numT10 = num9;
            } else{
                numT10 = 0;
            }

            if (posicion11 == 'M') {
                num11 = +1000;
            } else if (posicion11 == 'D') {
                num11 = +500;
            } else if (posicion11 == 'C') {
                num11 = +100;
            } else if (posicion11 == 'L') {
                num11 = +50;
            } else if (posicion11 == 'X') {
                num11 = +10;
            } else if (posicion11 == 'V') {
                num11 = +5;
            } else if (posicion11 == 'I') {
                num11 = +1;

            } 
            if  (num11 > num10){
                numT11 = num11-num10;
            } else if (num10 <num9 || num10 == num9) {
                numT11 = num10;
            } else{
                numT11 = 0;
            }

            if (posicion12 == 'M') {
                num12 = +1000;
            } else if (posicion12 == 'D') {
                num12 = +500;
            } else if (posicion12 == 'C') {
                num12 = +100;
            } else if (posicion12 == 'L') {
                num12 = +50;
            } else if (posicion12 == 'X') {
                num12 = +10;
            } else if (posicion12 == 'V') {
                num12 = +5;
            } else if (posicion12 == 'I') {
                num12 = +1;

            }
            if (num12 > num11){
                numT12 = num12 - num11;
            } else {
                numT12 = num12 + num11;
            }
        }
        else if (index == 13) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);
            posicion6 = numRom.charAt(6);
            posicion7 = numRom.charAt(7);
            posicion8 = numRom.charAt(8);
            posicion9 = numRom.charAt(9);
            posicion10 = numRom.charAt(10);
            posicion11 = numRom.charAt(11);
            posicion12 = numRom.charAt(12);
            posicion13 = numRom.charAt(13);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }

            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if  (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 <num0 || num1 == num0) {
                numT2 = num1;
            } else{
                numT2 = 0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if  (num3 > num2){
                numT3 = num3-num2;
            } else if (num2 <num1 || num2 == num1) {
                numT3 = num2;
            } else{
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            }
            if  (num4 > num3){
                numT4 = num4-num3;
            } else if (num3 <num2 || num3 == num2) {
                numT4 = num3;
            } else{
                numT4 = 0;
            }

            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if  (num5 > num4){
                numT5 = num5-num4;
            } else if (num4 <num3 || num4 == num3) {
                numT5 = num4;
            } else{
                numT5 = 0;
            }

            if (posicion6 == 'M') {
                num6 = +1000;
            } else if (posicion6 == 'D') {
                num6 = +500;
            } else if (posicion6 == 'C') {
                num6 = +100;
            } else if (posicion6 == 'L') {
                num6 = +50;
            } else if (posicion6 == 'X') {
                num6 = +10;
            } else if (posicion6 == 'V') {
                num6 = +5;
            } else if (posicion6 == 'I') {
                num6 = +1;

            }
            if  (num6 > num5){
                numT6 = num6-num5;
            } else if (num5 <num4 || num5 == num4) {
                numT6 = num5;
            } else{
                numT6 = 0;
            }

            if (posicion7 == 'M') {
                num7 = +1000;
            } else if (posicion7 == 'D') {
                num7 = +500;
            } else if (posicion7 == 'C') {
                num7 = +100;
            } else if (posicion7 == 'L') {
                num7 = +50;
            } else if (posicion7 == 'X') {
                num7 = +10;
            } else if (posicion7 == 'V') {
                num7 = +5;
            } else if (posicion7 == 'I') {
                num7 = +1;

            }
            if  (num7 > num6){
                numT7 = num7-num6;
            } else if (num6 <num5 || num6 == num5) {
                numT7 = num6;
            } else{
                numT7 = 0;
            }

            if (posicion8 == 'M') {
                num8 = +1000;
            } else if (posicion8 == 'D') {
                num8 = +500;
            } else if (posicion8 == 'C') {
                num8 = +100;
            } else if (posicion8 == 'L') {
                num8 = +50;
            } else if (posicion8 == 'X') {
                num8 = +10;
            } else if (posicion8 == 'V') {
                num8 = +5;
            } else if (posicion8 == 'I') {
                num8 = +1;

            }
            if  (num8 > num7){
                numT8 = num8-num7;
            } else if (num7 <num6 || num7 == num6) {
                numT8 = num7;
            } else{
                numT8 = 0;
            }

            if (posicion9 == 'M') {
                num9 = +1000;
            } else if (posicion9 == 'D') {
                num9 = +500;
            } else if (posicion9 == 'C') {
                num9 = +100;
            } else if (posicion9 == 'L') {
                num9 = +50;
            } else if (posicion9 == 'X') {
                num9 = +10;
            } else if (posicion9 == 'V') {
                num9 = +5;
            } else if (posicion9 == 'I') {
                num9 = +1;

            }
            if  (num9 > num8){
                numT9 = num9-num8;
            } else if (num8 <num7 || num8 == num7) {
                numT9 = num8;
            } else{
                numT9 = 0;
            } 

            if (posicion10 == 'M') {
                num10 = +1000;
            } else if (posicion10 == 'D') {
                num10 = +500;
            } else if (posicion10 == 'C') {
                num10 = +100;
            } else if (posicion10 == 'L') {
                num10 = +50;
            } else if (posicion10 == 'X') {
                num10 = +10;
            } else if (posicion10 == 'V') {
                num10 = +5;
            } else if (posicion10 == 'I') {
                num10 = +1;

            }
            if  (num10 > num9){
                numT10 = num10-num9;
            } else if (num9 <num8 || num9 == num8) {
                numT10 = num9;
            } else{
                numT10 = 0;
            }

            if (posicion11 == 'M') {
                num11 = +1000;
            } else if (posicion11 == 'D') {
                num11 = +500;
            } else if (posicion11 == 'C') {
                num11 = +100;
            } else if (posicion11 == 'L') {
                num11 = +50;
            } else if (posicion11 == 'X') {
                num11 = +10;
            } else if (posicion11 == 'V') {
                num11 = +5;
            } else if (posicion11 == 'I') {
                num11 = +1;

            }
            if  (num11 > num10){
                numT11 = num11-num10;
            } else if (num10 <num9 || num10 == num9) {
                numT11 = num10;
            } else{
                numT11 = 0;
            }

            if (posicion12 == 'M') {
                num12 = +1000;
            } else if (posicion12 == 'D') {
                num12 = +500;
            } else if (posicion12 == 'C') {
                num12 = +100;
            } else if (posicion12 == 'L') {
                num12 = +50;
            } else if (posicion12 == 'X') {
                num12 = +10;
            } else if (posicion12 == 'V') {
                num12 = +5;
            } else if (posicion12 == 'I') {
                num12 = +1;

            } 
            if  (num12 > num11){
                numT12 = num12-num11;
            } else if (num11 <num10 || num11 == num10) {
                numT12 = num11;
            } else{
                numT12 = 0;
            }

            if (posicion13 == 'M') {
                num13 = +1000;
            } else if (posicion13 == 'D') {
                num13 = +500;
            } else if (posicion13 == 'C') {
                num13 = +100;
            } else if (posicion13 == 'L') {
                num13 = +50;
            } else if (posicion13 == 'X') {
                num13 = +10;
            } else if (posicion13 == 'V') {
                num13 = +5;
            } else if (posicion13 == 'I') {
                num13 = +1;

            }
            if (num13 > num12){
                numT13 = num13-num12;
            } else{
                numT13 = num13+num12;
            }
        }
        else if (index == 14) {

            romanChar = numRom.charAt(index);
            posicion0 = numRom.charAt(0);
            posicion1 = numRom.charAt(1);
            posicion2 = numRom.charAt(2);
            posicion3 = numRom.charAt(3);
            posicion4 = numRom.charAt(4);
            posicion5 = numRom.charAt(5);
            posicion6 = numRom.charAt(6);
            posicion7 = numRom.charAt(7);
            posicion8 = numRom.charAt(8);
            posicion9 = numRom.charAt(9);
            posicion10 = numRom.charAt(10);
            posicion11 = numRom.charAt(11);
            posicion12 = numRom.charAt(12);
            posicion13 = numRom.charAt(13);
            posicion14 = numRom.charAt(14);

            if (posicion0 == 'M') {
                num0 = +1000;
            } else if (posicion0 == 'D') {
                num0 = +500;
            } else if (posicion0 == 'C') {
                num0 = +100;
            } else if (posicion0 == 'L') {
                num0 = +50;
            } else if (posicion0 == 'X') {
                num0 = +10;
            } else if (posicion0 == 'V') {
                num0 = +5;
            } else if (posicion0 == 'I') {
                num0 = +1;

            }

            if (posicion1 == 'M') {
                num1 = +1000;
            } else if (posicion1 == 'D') {
                num1 = +500;
            } else if (posicion1 == 'C') {
                num1 = +100;
            } else if (posicion1 == 'L') {
                num1 = +50;
            } else if (posicion1 == 'X') {
                num1 = +10;
            } else if (posicion1 == 'V') {
                num1 = +5;
            } else if (posicion1 == 'I') {
                num1 = +1;

            }
            if (num1 > num0){
                numT1 = num1-num0;
             } else {
                numT1 = num0;
             }


            if (posicion2 == 'M') {
                num2 = +1000;
            } else if (posicion2 == 'D') {
                num2 = +500;
            } else if (posicion2 == 'C') {
                num2 = +100;
            } else if (posicion2 == 'L') {
                num2 = +50;
            } else if (posicion2 == 'X') {
                num2 = +10;
            } else if (posicion2 == 'V') {
                num2 = +5;
            } else if (posicion2 == 'I') {
                num2 = +1;

            }
            if  (num2 > num1){
                numT2 = num2-num1;
            } else if (num1 <num0 || num1 == num0) {
                numT2 = num1;
            } else{
                numT2 = 0;
            }

            if (posicion3 == 'M') {
                num3 = +1000;
            } else if (posicion3 == 'D') {
                num3 = +500;
            } else if (posicion3 == 'C') {
                num3 = +100;
            } else if (posicion3 == 'L') {
                num3 = +50;
            } else if (posicion3 == 'X') {
                num3 = +10;
            } else if (posicion3 == 'V') {
                num3 = +5;
            } else if (posicion3 == 'I') {
                num3 = +1;

            }
            if  (num3 > num2){
                numT3 = num3-num2;
            } else if (num2 <num1 || num2 == num1) {
                numT3 = num2;
            } else{
                numT3 = 0;
            }

            if (posicion4 == 'M') {
                num4 = +1000;
            } else if (posicion4 == 'D') {
                num4 = +500;
            } else if (posicion4 == 'C') {
                num4 = +100;
            } else if (posicion4 == 'L') {
                num4 = +50;
            } else if (posicion4 == 'X') {
                num4 = +10;
            } else if (posicion4 == 'V') {
                num4 = +5;
            } else if (posicion4 == 'I') {
                num4 = +1;

            }
            if  (num4 > num3){
                numT4 = num4-num3;
            } else if (num3 <num2 || num3 == num2) {
                numT4 = num3;
            } else{
                numT4 = 0;
            }

            if (posicion5 == 'M') {
                num5 = +1000;
            } else if (posicion5 == 'D') {
                num5 = +500;
            } else if (posicion5 == 'C') {
                num5 = +100;
            } else if (posicion5 == 'L') {
                num5 = +50;
            } else if (posicion5 == 'X') {
                num5 = +10;
            } else if (posicion5 == 'V') {
                num5 = +5;
            } else if (posicion5 == 'I') {
                num5 = +1;

            }
            if  (num5 > num4){
                numT5 = num5-num4;
            } else if (num4 <num3 || num4 == num3) {
                numT5 = num4;
            } else{
                numT5 = 0;
            }

            if (posicion6 == 'M') {
                num6 = +1000;
            } else if (posicion6 == 'D') {
                num6 = +500;
            } else if (posicion6 == 'C') {
                num6 = +100;
            } else if (posicion6 == 'L') {
                num6 = +50;
            } else if (posicion6 == 'X') {
                num6 = +10;
            } else if (posicion6 == 'V') {
                num6 = +5;
            } else if (posicion6 == 'I') {
                num6 = +1;

            }
            if  (num6 > num5){
                numT6 = num6-num5;
            } else if (num5 <num4 || num5 == num4) {
                numT6 = num5;
            } else{
                numT6 = 0;
            }

            if (posicion7 == 'M') {
                num7 = +1000;
            } else if (posicion7 == 'D') {
                num7 = +500;
            } else if (posicion7 == 'C') {
                num7 = +100;
            } else if (posicion7 == 'L') {
                num7 = +50;
            } else if (posicion7 == 'X') {
                num7 = +10;
            } else if (posicion7 == 'V') {
                num7 = +5;
            } else if (posicion7 == 'I') {
                num7 = +1;

            }
            if  (num7 > num6){
                numT7 = num7-num6;
            } else if (num6 <num5 || num6 == num5) {
                numT7 = num6;
            } else{
                numT7 = 0;
            }


            if (posicion8 == 'M') {
                num8 = +1000;
            } else if (posicion8 == 'D') {
                num8 = +500;
            } else if (posicion8 == 'C') {
                num8 = +100;
            } else if (posicion8 == 'L') {
                num8 = +50;
            } else if (posicion8 == 'X') {
                num8 = +10;
            } else if (posicion8 == 'V') {
                num8 = +5;
            } else if (posicion8 == 'I') {
                num8 = +1;

            }
            if  (num8 > num7){
                numT8 = num8-num7;
            } else if (num7 <num6 || num7 == num6) {
                numT8 = num7;
            } else{
                numT8 = 0;
            }

            if (posicion9 == 'M') {
                num9 = +1000;
            } else if (posicion9 == 'D') {
                num9 = +500;
            } else if (posicion9 == 'C') {
                num9 = +100;
            } else if (posicion9 == 'L') {
                num9 = +50;
            } else if (posicion9 == 'X') {
                num9 = +10;
            } else if (posicion9 == 'V') {
                num9 = +5;
            } else if (posicion9 == 'I') {
                num9 = +1;

            }
            if  (num9 > num8){
                numT9 = num9-num8;
            } else if (num8 <num7 || num8 == num7) {
                numT9 = num8;
            } else{
                numT9 = 0;
            } 

            if (posicion10 == 'M') {
                num10 = +1000;
            } else if (posicion10 == 'D') {
                num10 = +500;
            } else if (posicion10 == 'C') {
                num10 = +100;
            } else if (posicion10 == 'L') {
                num10 = +50;
            } else if (posicion10 == 'X') {
                num10 = +10;
            } else if (posicion10 == 'V') {
                num10 = +5;
            } else if (posicion10 == 'I') {
                num10 = +1;

            }
            if  (num10 > num9){
                numT10 = num10-num9;
            } else if (num9 <num8 || num9 == num8) {
                numT10 = num9;
            } else{
                numT10 = 0;
            }

            if (posicion11 == 'M') {
                num11 = +1000;
            } else if (posicion11 == 'D') {
                num11 = +500;
            } else if (posicion11 == 'C') {
                num11 = +100;
            } else if (posicion11 == 'L') {
                num11 = +50;
            } else if (posicion11 == 'X') {
                num11 = +10;
            } else if (posicion11 == 'V') {
                num11 = +5;
            } else if (posicion11 == 'I') {
                num11 = +1;

            }
            if  (num11 > num10){
                numT11 = num11-num10;
            } else if (num10 <num9 || num10 == num9) {
                numT11 = num10;
            } else{
                numT11 = 0;
            }

            if (posicion12 == 'M') {
                num12 = +1000;
            } else if (posicion12 == 'D') {
                num12 = +500;
            } else if (posicion12 == 'C') {
                num12 = +100;
            } else if (posicion12 == 'L') {
                num12 = +50;
            } else if (posicion12 == 'X') {
                num12 = +10;
            } else if (posicion12 == 'V') {
                num12 = +5;
            } else if (posicion12 == 'I') {
                num12 = +1;

            }
            if  (num12 > num11){
                numT12 = num12-num11;
            } else if (num11 <num10 || num11 == num10) {
                numT12 = num11;
            } else{
                numT12 = 0;
            }

            if (posicion13 == 'M') {
                num13 = +1000;
            } else if (posicion13 == 'D') {
                num13 = +500;
            } else if (posicion13 == 'C') {
                num13 = +100;
            } else if (posicion13 == 'L') {
                num13 = +50;
            } else if (posicion13 == 'X') {
                num13 = +10;
            } else if (posicion13 == 'V') {
                num13 = +5;
            } else if (posicion13 == 'I') {
                num13 = +1;

            } 
            if  (num13 > num12){
                numT13 = num13-num12;
            } else if (num12 <num11 || num12 == num11) {
                numT13 = num12;
            } else{
                numT13 = 0;
            }

            if (posicion14 == 'M') {
                num14 = +1000;
            } else if (posicion14 == 'D') {
                num14 = +500;
            } else if (posicion14 == 'C') {
                num14 = +100;
            } else if (posicion14 == 'L') {
                num14 = +50;
            } else if (posicion14 == 'X') {
                num14 = +10;
            } else if (posicion14 == 'V') {
                num14 = +5;
            } else if (posicion14 == 'I') {
                num14 = +1;

            }
            if (num14 > num13){
                numT14 = num14-num13;
            } else{
                numT14 = num14+num13;
            }
        }

        total =  numT0 + numT1 + numT2 + numT3 + numT4 + numT5 + numT6 + numT7 + numT8 + numT9 + numT10 + numT11 + numT12 + numT13
                + numT14;
                

        Console.writeLine(total);

    }
}
