import java.util.Scanner;
public class Salario {
    public static void main(String[] ar) {
        
        Scanner teclado = new Scanner(System.in);
        
        int primerRango = 0; // Empleados con sueldos entre 100 y 300
        int segundoRango = 0; // Empleados con sueldos mayores de 300
        int totalGastos = 0; // Total de gastos en sueldos
        int n;
        float sueldo;
        
        System.out.print("Cuantos empleados va a ingresar: ");
        n = teclado.nextInt();
        
        int x = 1; // Inicializamos el contador del bucle
        
        while (x <= n) {
            System.out.print("Ingrese el salario del empleado " + x + ": ");
            sueldo = teclado.nextFloat();
            
            // Validamos que el sueldo esté en el rango válido
            while (sueldo < 100 || sueldo > 500) {
                System.out.println("El sueldo ingresado no es válido. Debe estar entre 100 y 500.");
                System.out.print("Ingrese el salario del empleado " + x + " nuevamente: ");
                sueldo = teclado.nextFloat();
            }
            
            // Clasificamos el sueldo
            if (sueldo <= 300) {
                primerRango++;
            } else {
                segundoRango++;
            }
            totalGastos += sueldo; // Acumulamos el gasto total
            
            x++; // Incrementamos el contador
        }
        
        // Informamos los resultados
        System.out.print("Cantidad de empleados que cobran entre 100 y 300: ");
        System.out.println(primerRango);
        System.out.print("Cantidad de empleados que cobran más de 300: ");
        System.out.println(segundoRango);
        System.out.print("El total de gastos en sueldos es: ");
        System.out.println(totalGastos);
    }
}

