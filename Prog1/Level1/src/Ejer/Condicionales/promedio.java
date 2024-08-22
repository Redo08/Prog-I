public class promedio extends Terminal {
    public static void main(String[] args) {
        var notaExamenC = 0.0d;
        var notaExamenP = 0.0d;
        var trabajo1C = 0.0f;
        var trabajo2C = 0.0f;
        var trabajo3C = 0.0f;
        var trabajo4C = 0.0f;
        var trabajo5C = 0.0f;
        var trabajo6C = 0.0f;
        var trabajo7C = 0.0f;
        var trabajo1P = 0;
        var trabajo2P = 0;
        var promediotrabajo = 0.0d;
        var promedio1 = 0.0d;
        var promedio2 = 0.0d;
        var promedioT = 0.0d;
        var desicion = '?';

        printLine("Ingrese la nota del examen de calculo");
        notaExamenC = Integer.parseInt(readLine());
        printLine("Ingrese las notas de los 7 trabajos en orden");
        trabajo1C = Float.parseFloat(readLine());
        trabajo2C = Float.parseFloat(readLine());
        trabajo3C = Float.parseFloat(readLine());
        trabajo4C = Float.parseFloat(readLine());
        trabajo5C = Float.parseFloat(readLine());
        trabajo6C = Float.parseFloat(readLine());
        trabajo7C = Float.parseFloat(readLine());

        printLine("Ingrese la nota del examen de programación");
        notaExamenP = Integer.parseInt(readLine());
        printLine("Ingrese las notas de los 2 trabajos en orden");
        trabajo1P = Integer.parseInt(readLine());
        trabajo2P = Integer.parseInt(readLine());

        Console.writeLine(
                "Ingrese A si quiere sacar el promedio de calculo, ingrese B si quiere sacar el promedio de programación, ingrese C si quiere sacar el promedio general");
        desicion = Console.readLine().toUpperCase().charAt(0);

        notaExamenC = notaExamenC * 0.1;
        promediotrabajo = (trabajo1C + trabajo2C + trabajo3C + trabajo4C + trabajo5C + trabajo6C + trabajo7C) / 7;
        promedio1 = notaExamenC + promediotrabajo;

        notaExamenP = notaExamenP * 0.8;
        promediotrabajo = (trabajo1P + trabajo2P) / 2;
        promediotrabajo = promediotrabajo * 0.2;
        promedio2 = notaExamenP + promediotrabajo;

        promedioT = (promedio1 + promedio2) / 2;

        if (desicion == 'A') {
            Console.writeLine("El promedio total seria: %f", promediotrabajo);
        } else if (desicion == 'B') {
            Console.writeLine("El promedio de programación seria: %f", promedio2);
        } else if (desicion == 'C') {
            Console.writeLine("El promedio general es: %f", promedioT);
        }

    }
}
