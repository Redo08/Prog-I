public class countPosdivisors {
    public static void main(String[] args) {
        var num = 0;
        var i = 0;
        var divisores = 0;
        Console.writeLine("Ingrese un numero");
        num = Integer.parseInt(Console.readLine());
        i = num;
        while(Funcionesh.isNegative(i)){
            if(Funcionesh.isDivisor(i, num)){
                divisores += 1;
            }
            i +=1;

        }
        Console.writeLine(divisores);
    }
}
