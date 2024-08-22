
import java.util.Scanner;

public class BowlingScoreSteven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lanz1=0, lanz2=0, lanz3=0, total = 0;

        System.out.println("Ingrese los bolos derribados en el lanzamiento 1:");
        lanz1 = scanner.nextInt();
        if (lanz1 == 10) {
            System.out.println("Ingrese los bolos derribados en el lanzamiento 3:");
            lanz3 = scanner.nextInt();
        } else {
            System.out.println("Ingrese los bolos derribados en el lanzamiento 2:");
            lanz2 = scanner.nextInt();
            System.out.println("Ingrese los bolos derribados en el lanzamiento 3:");
            lanz3 = scanner.nextInt();
        }

        if (lanz1 == 10 && lanz3 == 10) {
            total = 30;
        } else {
            
            if (lanz1 <= 9 && lanz1 >= 0 && (lanz1 + lanz2) == 10 && lanz3 == 10) {
                total = 30;
            }else {
                if (lanz1<= 9 && lanz1 >= 0 && lanz3 == 10 && lanz2 >= 0 && lanz2 <= 9) {
                    total = lanz1 + lanz2 + lanz3;
                }else {
                    
                    if (lanz1 >= 0 && lanz1 <= 9 && (lanz1 + lanz2) == 10 && lanz3 >= 0 && lanz3 <= 9) {
                        total = 10 + lanz3+lanz3;
                    
                    }else {
                        if (lanz1 >= 0 && lanz1 <= 9 && lanz2 >= 0 && lanz2 <= 9 && lanz3 >= 0 && lanz3 <= 9) {
                            total = lanz1 + lanz2 + lanz3;
                        }else {
                            if (lanz1==10 && lanz3>=0 && lanz3<=9) {
                                total = 10+lanz3+lanz3;
                                }
                            }
                            }
                        }
                    }
            }
                
            
        

        if (lanz1 >= 0 && lanz1 <= 10 && lanz2 >= 0 && lanz2 <= 10 && lanz3 >= 0 && lanz3 <= 10 && lanz1+lanz2<=10) {
            System.out.println("Los puntos obtenidos fueron: " + total);
        } else {
            System.out.println("Solo se pueden derribar hasta diez bolos por turno o ninguno");
        }
        scanner.close();
        }
}