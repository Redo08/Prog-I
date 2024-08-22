public class factorial {
    public static void main(String[] args) {
        var num = 5;
        var i = 0;
        
        Console.writeLine("Ingrese el valor factorial");
        num = Integer.parseInt(Console.readLine());
        i = num - 2;
        while (i > 0){
           num = num * i;
           i-=2;

        }
        Console.writeLine(num);
    }
}
