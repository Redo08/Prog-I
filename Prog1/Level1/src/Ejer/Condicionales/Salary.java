
public class Salary {
    public static void main(String[] args) {
        int horasTrabajadas, horasExtras, Salariosemanal = 0;
        Console.writeLine("Ingrese las horas trabajadas en la semana");
        horasTrabajadas = Integer.parseInt(Console.readLine());
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;
            Salariosemanal = (horasExtras * 20) + (40 * 16);
            Console.writeLine("El salario con horas extras es de %d", Salariosemanal);
        }
        else {
            Salariosemanal = horasTrabajadas * 16;
            Console.writeLine("Su sueldo es de %d", Salariosemanal);

        }
    }
}