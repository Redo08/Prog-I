public class DecimalConverter {

    public static void main(String[] args) {
        String roman = "";
        int decimal = 0;
        int aux = 0;

        int prevValue = 0;
        char romanChar= '?';
        var currentValue = 0;

        Console.writeLine("Ingrese el numero romano entre I y MMMCMXCIX");
        roman = Console.readLine();
        int index = roman.length() - 1;
        
        while (index >= 0) {
            romanChar=roman.charAt(index);
            if (romanChar == 'I') {
                aux = 1;
            }
            else if (romanChar == 'V') { 
                aux = 5;
            }
            else if (romanChar == 'X') {
                aux = 10;
            }
            else if (romanChar == 'L') {
                aux = 50;
            }
            else if (romanChar == 'C') {
                aux = 100;
            }
            else if (romanChar == 'D') {
                aux = 500;
            }
            else if (romanChar == 'M') {
                aux = 1000;
            }
            else {
                aux = 0;
            }
            currentValue = aux;
    
            if (currentValue < prevValue) {
                decimal -= currentValue;
            } else {
                decimal += currentValue;
            }
            prevValue = currentValue;
            index--;
        }

        
        
        Console.writeLine(decimal);
        



    }
}