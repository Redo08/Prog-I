public class Ejer19 {
    public static void main(String[] args) {
        var MaxNote = 0.0f;
        var MinNote = 0.0f;
        var StudentNote = 0.0f;
        Console.writeLine("Ingrese la nota maxima posible");
        MaxNote = Float.parseFloat(Console.readLine());
        MinNote = MaxNote * 60f/100;
        Console.writeLine("Ingrese la nota del estudiante");
        StudentNote = Float.parseFloat(Console.readLine());
        if (StudentNote >= MinNote) {
            Console.writeLine("El estudiante aprobo el examen");
        } else {
            Console.writeLine("El estudiante reprobo el examen");
        }
    }
}
