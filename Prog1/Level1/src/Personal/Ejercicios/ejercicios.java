import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int edad = 0;
        System.out.println("Ingrese su edad: ");
        edad = scn.nextInt();
        for(int i = 1; i <= edad; i++){
            if(i > 1){
                System.out.println("Usted ha cumplido: "+ i + " años.");
            } else {
                System.out.println("Usted ha cumplido: "+ i + " año.");
            }
        }
        scn.close();
    }
}
