public class hola{
public static String printAnIsoscelesTriangle(int N) {
    StringBuilder result = new StringBuilder();
    for (int r = 1; r <= N; r++) {
        // Print spaces
        for (int sp = 1; sp <= N - r; sp++) {
            result.append(" ");
        }
        // Print stars
        for (int c = 1; c <= (r * 2) - 1; c++) {
            result.append("*");
        }
        result.append(System.lineSeparator());
    }
    return result.toString();
}
public static void main(String[] args) {
    Console.write("Ingrese lado");
    var n = Integer.parseInt(Console.readLine());
    var j = printAnIsoscelesTriangle(n);
    Console.writeLine(j);
}
}
