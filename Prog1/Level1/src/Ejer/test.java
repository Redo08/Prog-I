public class test extends Terminal {
    public static void main(String[] args) {
        var count = 1; var sum = 0;
        while (count <= 5) {
            Console.writeLine("Counter = %d", count);
            if (sum > 7){
                break;
                //Break sirve para salir del ciclo, no recomendado porque daña la estructura herativa
            }
            sum += count;
            count += 1;
        }
        Console.writeLine("End");
        Console.writeLine("La cantidad de sumas fue: %d", sum);
    }
}

