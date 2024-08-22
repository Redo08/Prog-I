
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Simulacíon de juego de bolos útltimo turno");
        System.out.println("Como bien se sabe, el último turno es el único en el cual se pueden lanzar 3 bolas");
        System.out.println("En este caso, se simulará un juego en el cual el jugador tiene 3 bolas en el último turno");
        System.out.println("Adicionalmente, tenemos que recordar en que casos se pueden lanzar 3 bolas en el último turno");
        Boolean lanzarTerceraVez = false;

        System.out.println("¡Comencemos!");
        int pinos = 10;
        int puntaje = 0;
        Scanner sc = new Scanner(System.in);

        // Primer lanzamiento
        System.out.println("El jugador tiene "+ pinos + " pinos en el primer lanzamiento");
        System.out.println("Primer lanzamiento...");
        System.out.println("¿Cuántos pinos derribó en el primer lanzamiento?");
        int pinosDerribados = sc.nextInt();

        if(pinosDerribados > pinos){
            System.out.println("¡No puedes derribar más de 10 pinos!");
            return; // Termina el programa
        }

        if(pinosDerribados == 10){
            System.out.println("¡Moñona!");
            lanzarTerceraVez = true;
            System.out.println("Recargando pinos...");
            pinos = 10;
            puntaje += pinosDerribados;
        }else{
            pinos = pinos - pinosDerribados;
            puntaje += pinosDerribados;
        }

        // Segundo lanzamiento
        System.out.println("El jugador tiene "+ pinos + " pinos en el segundo lanzamiento");
        System.out.println("Segundo lanzamiento...");
        System.out.println("¿Cuántos pinos derribó en este lanzamiento?");
        pinosDerribados = sc.nextInt();

        if(pinosDerribados > pinos){
            System.out.println("¡En este turno no puedes derribar más de " + pinos + " pinos!");
            return;
        }
        
        if(pinosDerribados == pinos){
            System.out.println("¡Moñona!");
            lanzarTerceraVez = true;
            System.out.println("Recargando pinos...");
            pinos = 10;
            puntaje += pinosDerribados;
        }else{
            pinos = pinos - pinosDerribados;
            puntaje += pinosDerribados;
            if(puntaje < 10){
                System.out.println("¡No desbloqueaste el tercer tiro!");
            }
        }

        // Tercer lanzamiento
        if(lanzarTerceraVez){
            System.out.println("El jugador tiene "+ pinos + " pinos en el tercer lanzamiento");
            System.out.println("Tercer lanzamiento...");
            System.out.println("¿Cuántos pinos derribó en este lanzamiento?");
            pinosDerribados = sc.nextInt();

            if(pinosDerribados > pinos){
                System.out.println("¡En este turno no puedes derribar más de " + pinos + " pinos!");
                return;
            }

            if(pinosDerribados == pinos){
                System.out.println("¡Moñona!");
                System.out.println("¡Felicidades! Has derribado todos los pinos");
                puntaje += 10;
            }else{
                pinos -= pinosDerribados;
                puntaje += pinosDerribados;
            }
        }
        sc.close();
        System.out.println("¡Fin del juego!");
        System.out.println("El puntaje del jugador fue: " + puntaje);
        
    }
}
