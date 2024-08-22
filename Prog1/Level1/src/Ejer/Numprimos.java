public class Numprimos {
    public static void main(String[] args) {
        int num = 0;
        var prime_num = 2;
        var contador = 0;
        Console.writeLine("Ingrese el numero que quiere para la matriz: ");
        num = Integer.parseInt(Console.readLine());

        Console.writeLine("Oprima espacio para imprimir los numeros primos entre 1 y 100");
        Console.readLine();
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    while(!(Funcionesh.isPrime(prime_num))){
                        prime_num ++;
                    } 
                    Console.write(prime_num+" ");
                    contador ++;
                    prime_num++;
                    if (contador == num){
                        Console.writeLine("");
                    }
                    if(contador > (num-1)){
                        contador = 0;
                    }
                    
                }
            }
            
    }
}