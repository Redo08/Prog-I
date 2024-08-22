public class Banco {
    public static void main(String[] args) {
        var caja1 = 0;
        var caja2 = 0;
        var caja = 0;
        var depositado = 0;
        var retirado = 0;
        var contador = 0;
        var cliente = 0;
        var texto = "";
        var lector1 = '?';
        var lector = '?';
        Console.writeLine("Ingrese la cantidad de clientes que se esperan atender: ");
        cliente = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el valor destinado a la primera caja: ");
        caja1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el valor destinado a la segunda caja: ");
        caja2 = Integer.parseInt(Console.readLine());
        while ((caja1 > 0 && caja2 > 0) && contador != cliente) {
            contador += 1;
            if (contador % 2 == 0) {
                caja = caja2;
                texto = "Caja2";
            } else {
                caja = caja1;
                texto = "Caja1";
            }
            do {
                Console.writeLine("Cliente numero %d en fila, le toca en la %s", contador, texto);
                Console.writeLine("Quiere retirar o depositar? (R/D): ");
                lector = Console.readLine().toUpperCase().charAt(0);

                if (lector == 'R') {
                    Console.writeLine("Ingrese la cantidad de dinero que quiere retirar: ");
                    retirado = Integer.parseInt(Console.readLine());
                    caja -= retirado;

                } else if (lector == 'D') {
                    Console.writeLine("Ingrese la cantidad de dinero que quiere depositar: ");
                    depositado = Integer.parseInt(Console.readLine());
                    caja += depositado;
                }
                if (caja > 0) {
                    Console.writeLine("Desea continuar con otra operación? (S/N): ");
                    lector1 = Console.readLine().toUpperCase().charAt(0);
                } else {
                    lector1 = 'N';
                }

                if (contador % 2 == 0) {
                    caja2 = caja;
                } else {
                    caja1 = caja;
                }
                texto = (caja1 <= 0)?"Caja1":"Caja2";
            } while (lector1 != 'N');

        }
        if (contador == cliente && (caja1 > 0 && caja2 > 0)) {
            Console.writeLine("Se atendieron todos los clientes, el saldo de las cajas fue: \n" +
                    " caja 1: %d \n caja 2: %d", caja1, caja2);
        } else {
            Console.writeLine("Clientes totales atendidos: %d \n En la %s se acabaron los fondos al tratar de retirar %d", contador, texto, retirado);
        }
    }
}
