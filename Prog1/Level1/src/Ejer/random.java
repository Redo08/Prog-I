public class random {
    public static void main(String[] args) {
        var numSup = 90;
        var numInf = 10;
        var limite = numSup - numInf;
        var contador = 0;
        var random = 0;
        
         

        while(contador < limite ){
            random = Funcionesh.random(numSup, numInf);
            Console.writeLine(random);
            contador += 1;
        }
    }
}
