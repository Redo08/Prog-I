public class Ejer25 {
    public static void main(String[] args) {
        var AnualSalary = 0.0f;
        Console.writeLine("Ingrese su salario anual");
        AnualSalary = Float.parseFloat(Console.readLine());
        if (AnualSalary <= 10_000) {
            Console.writeLine("No tiene impuestos sobre la renta");
        } else if (AnualSalary > 10_000 && AnualSalary <= 50_000) {
            Console.writeLine("El impuesto sobre la renta es del 10%");
        } else {
            Console.writeLine("El impuesto sobre la renta es del 20%");
        }

    }
}
