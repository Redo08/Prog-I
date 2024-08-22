public class fibonacci {
    public static void main(String[] args) {
        var primero = 0;
        var segundo = 1;
        var sucesion = 0;
        var cantidad = 0;
        Console.writeLine("Ingrese la cantidad de numeros de la secuencia de fibonacci: ");
        cantidad = Integer.parseInt(Console.readLine());
        for(int i = 0; i <= cantidad; i++){
            if( i<= 0){
                Console.write( primero + " ");
            }
            sucesion = primero + segundo;
            Console.write(sucesion + " ");
        
            segundo = primero;
            primero = sucesion;

        }
    }
}
