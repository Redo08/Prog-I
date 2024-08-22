import java.util.Scanner;

public class Ejer02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        var initial_velocity = 0.0f;
        var aceleration = 0.0f;
        var time = 0.0f;
        var mrua = 0.0d;
        System.out.println("Ingrese el valor de la velocidad inicial");
        initial_velocity = leer.nextFloat();
        System.err.println("Ingrese el valor de la aceleración");
        aceleration = leer.nextFloat();
        System.out.println("Ingrese el valor del tiempo transcurrido");
        time = leer.nextFloat();
        mrua = initial_velocity * time + (1f / 2) * aceleration * Math.pow(time, 2);
        System.out.println("El Movimiento Rectilineo Uniformemente Acelerado es: " + mrua);
        leer.close();

    }

}
