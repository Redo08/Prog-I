public class binario{
    public static void main(String[] args) {
        var binario = 0;
        var i = 0;
        int aux;
        Console.writeLine("Ingrese un numero decimal: ");
        int decimal = Integer.parseInt(Console.readLine());
        while(decimal > 0){ 
            aux = (decimal % 2);
            decimal /= 2;
            binario += aux * Math.pow(10,i) ;
            i += 1;
        }
        Console.writeLine("Numero binario: %d", binario);
    }
}