
import java.util.Scanner;
public class App{
    public static void main( String[] args ){
        int lanz1=0, lanz2=0 ,lanz3=0, totalT1=0, totalT2=0, totalT3=0, total=0, totalLanz=0;
        Scanner scn=new Scanner(System.in);
        boolean show=false;
        System.out.println("Ingrese el lanzamiento 1 del Primer turno");
        lanz1=scn.nextInt();
        if(lanz1==10){
            System.out.println("Moñona");
            System.out.println("Ingrese el 1 lanzamiento del Segundo Turno");
            lanz2=scn.nextInt();
            if(lanz2==10){
                System.out.println("Otra moñona");
                System.out.println("Ingrese el 1 lanzamiento del Tercer turno");
                lanz3=scn.nextInt();
                if(lanz3>=0 || lanz3<=10){
                    totalT3=lanz3;
                    totalT1=lanz1+lanz2+lanz3;
                    totalT2=lanz2+lanz3;
                    show=true;
                }else{
                    show=false;
                }
                
            }else if(lanz2>=0 && lanz2<10){
                System.out.println("Ingrese el 2 lanzamiento del segundo turno");
                lanz3=scn.nextInt();
                if(lanz3>=0 && (lanz2+lanz3)<=10){
                    totalT1=lanz1+lanz2+lanz3;
                    totalT2=lanz2+lanz3;
                    show=true;
                }
                else if((lanz2+lanz3)>10 || lanz3<0){
                    System.out.println("Estas muy loko");
                    show=false;
                }
            }else{
                System.out.println("Estas muy loko");
                show=false;
            }  
        }else if(lanz1>=0 && lanz1<10){
            System.out.println("Ingrese el 2 lanzamienro del primer turno");
            lanz2=scn.nextInt();
            if((lanz1+lanz2)>10 || lanz2<0){
                System.out.println("Estas muy loko");
                show=false;
            }else if((lanz1+lanz2)==10){
                System.out.println("Media moñona");
                System.out.println("ingrese el 1 lanzamiento del 2 turno");
                lanz3=scn.nextInt();
                if(lanz3>=0 && lanz3<=10){
                    totalT1=lanz1+lanz2+lanz3;
                    totalT2=lanz3;
                    show=true;
                }else{
                    System.out.println("Estas muy loooko");
                    show=false;
                }
            }else if(lanz2>=0 && ((lanz1+lanz2)<10)){
                System.out.println("ingrese el 1 lanzamiento del 2 turno");
                lanz3=scn.nextInt();
                if(lanz3>=0 && lanz3<=10){
                    totalT1=lanz1+lanz2;
                    totalT2=lanz3;
                    show=true;
                }else{
                    System.out.println("Estas muy loko");
                    show=false;
                }
            }else{
                System.out.println("Estas muy loko");
                show=false;
            }
        }else{
            System.out.println("Estas muy loko muchacho");
            show=false;
        }
        if(show){
            total=totalT1+totalT2+totalT3;
            totalLanz=lanz1+lanz2+lanz3;
            System.out.println("Total Turno 1: "+totalT1);
            System.out.println("Total Turno 2: "+totalT2);
            System.out.println("Total Turno 3: "+totalT3);
            System.out.println("Lanzamiento 1: "+lanz1);
            System.out.println("Lanzamiento 2: "+lanz2);
            System.out.println("Lanzamiento 3: "+lanz3);
            System.out.println("El total del juego fue: "+total);
            System.out.println("El total de los lanzamientos fue: "+totalLanz);
        }
        scn.close();   
    }
    public static void ejemploFor(){
        String hola="qwertyuio";
        int[] loko=new int[]{1,2,3,4,5};
        for (int i = 0; i < loko.length; i++) {
            System.out.println("Holaaa: "+hola.charAt(i));
            
        }
    }
}
