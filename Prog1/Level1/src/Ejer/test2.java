public class test2 {
    public static void main(String[] args) {
        var count = 1;  var mult = 1;
        while (count <= 5){
            Console.writeLine("Counter = %d", count);

            mult *= count;    
            count +=1;
        }
        Console.writeLine("Multplicación = %d", mult);
    }
}
