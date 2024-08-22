public class viaje {
    public static void main(String[] args) {
        int presupuesto, nMonitorias, ahorros = 0;
        var visa = '?';
        ahorros = 2_000_000;
        presupuesto = 0;
        int rand = (int) (Math.random() * (6 - 1 + 1) + 1 );
        Console.writeLine("Ingrese su tipo de visa, Turista (T), Estudiante (E) o Residencia (R).");
        visa = Console.readLine().toUpperCase().charAt(0);
        Console.writeLine("Ingrese el número de monitorias que ha hecho");
        nMonitorias = Integer.parseInt(Console.readLine());
        

        if (visa == 'T') {
            presupuesto = ahorros + (nMonitorias * 50000);
        }
        else if (visa == 'E') {
            presupuesto = ahorros + (nMonitorias * 50000) + 1000000;
        }
        else if ( visa == 'R') {
            presupuesto = ahorros + (rand * 1000000);

        }

        if (presupuesto >= 6_000_000) {
            Console.writeLine("Comprar el tiquete directo de ida y vuelta a madrid con 0 escalas, su presupuesto es de: %d", presupuesto);
        } 
        else if (presupuesto >= 5_000_000) {
            Console.writeLine("Comprar el tiquete de ida y vuelta a madrid con 1 escala, su presupuesto es de: %d", presupuesto);
        } 
        else if (presupuesto >= 4_000_000) {
            Console.writeLine("Comprar el tiquede de ida y vuelta a madrid con 2 escalas, su presupuesto es de: %d", presupuesto);
        } 
        else if (presupuesto >= 3_500_000) {
            Console.writeLine("Comprar el tiquede de ida directo a madrid, su presupuesto es de: %d", presupuesto);
            Console.writeLine("Es recomendado tener visa de Estudiante o de residencia");
        }
        else if (presupuesto >= 3_000_000) {
            Console.writeLine("Comprar el tiquede de ida con 1 escala, su presupuesto es de: %d", presupuesto);
            Console.writeLine("Es recomendado tener visa de Estudiante o de residencia");
        }
        else if (presupuesto >= 2_500_000) {
            Console.writeLine("Comprar el tiquede de ida con 2 escalas, su presupuesto es de: %d", presupuesto);
            Console.writeLine("Es recomendado tener visa de Estudiante o de residencia");
        }
        else {
            Console.writeLine("Fondos insuficientes para viajar, su presupuesto es de: %d", presupuesto);
        }
    }
}
