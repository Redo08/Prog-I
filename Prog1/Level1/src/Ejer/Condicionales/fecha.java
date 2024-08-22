import java.util.Scanner;

public class fecha {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio, diaMes = 0;
        System.out.println("Ingrese el día, el mes y el año");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        if (mes == 2) {
            diaMes = 28;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diaMes = 31;
        } else {
            diaMes = 30;
        }
        dia = dia + 6;
        if (diaMes < dia) {
            dia = dia - diaMes;
            mes = mes + 1;
            if (mes > 12) {
                mes = 1;
                anio = anio + 1;
            }
        }
        System.out.println("La fecha 6 días despues seria: " + dia + "/" + mes + "/" + anio);
        leer.close();
    }
}
