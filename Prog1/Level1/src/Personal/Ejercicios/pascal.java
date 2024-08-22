public class pascal {
    public static void main(String[] args) {
        var num = 0;
        Console.writeLine("Ingrese la altura de la piramide: ");
        num = Integer.parseInt(Console.readLine());
        for (int i = 0; i < num; i++) {
            for (int j = num; i < j; j--) {
                Console.write(" ");
            }
            for (int k = 0; k <= i; k++) {
                Console.write(1 + " ");
            }
            Console.writeLine("");
        }
    }
}
