public class Ventas {
    public static void main(String[] args) {
        char choose = '?';
        double numVentasLunes, numVentasMartes, numVentasMiercoles, numVentasSabado, totalLunes, totalMartes,
                totalMiercoles, totalSabado, totalVendido, totalVentas, promedioMi, promedioTotal = 0.0;

        Console.writeLine("Ingrese el numero de ventas del lunes, martes, miercoles y sabado");
        numVentasLunes = Integer.parseInt(Console.readLine());
        numVentasMartes = Integer.parseInt(Console.readLine());
        numVentasMiercoles = Integer.parseInt(Console.readLine());
        numVentasSabado = Integer.parseInt(Console.readLine());

        Console.writeLine("Ingrese el total vendido del lunes, martes, miercoles y sabado");
        totalLunes = Float.parseFloat(Console.readLine());
        totalMartes = Float.parseFloat(Console.readLine());
        totalMiercoles = Float.parseFloat(Console.readLine());
        totalSabado = Float.parseFloat(Console.readLine());

        Console.writeLine(
                "Ingrese A si quiere ver el total vendido en la semana, B para ver el promedio del miercoles, C para ver el promedio de la semana o D para el porcentaje de ventas por día");
        choose = Console.readLine().toUpperCase().charAt(0);

        totalVendido = totalLunes + totalMartes + totalMiercoles + totalSabado;
        promedioMi = totalMiercoles / numVentasMiercoles;
        totalVentas = numVentasLunes + numVentasMartes + numVentasMiercoles + numVentasSabado;
        promedioTotal = totalVendido / totalVentas;

        numVentasLunes = numVentasLunes / totalVentas * 100;
        numVentasMartes = numVentasMartes / totalVentas * 100;
        numVentasMiercoles = numVentasMiercoles / totalVentas * 100;
        numVentasSabado = numVentasSabado / totalVentas * 100;

        if (choose == 'A') {
            Console.writeLine("El total vendido en la semana fue: %f", totalVendido);
        } else if (choose == 'B') {
            Console.writeLine("El promedio del miercoles fue: %f", promedioMi);
        } else if (choose == 'C') {
            Console.writeLine("El promedio vendido en la semana fue: %f", promedioTotal);
        } else if (choose == 'D') {
            Console.writeLine("El porcentaje por día fue: Lunes %f%%, Martes %f%%, Miercoles %f%% y Sabado %f%%",
                    numVentasLunes, numVentasMartes, numVentasMiercoles, numVentasSabado);
        }

    }
}
