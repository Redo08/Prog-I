public class alejandro {
    public static void main(String[] args) {
        /*var Min=0;
        var Max=0;
        var Abundante=0;
        var SumaDivisores=0;
        Console.writeLine("Ingrese el numero menor del rango");
        Min=Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el numero mayor del rango");
        Max=Integer.parseInt(Console.readLine());
        for(int i=Min;i<=Max;i+=1){
            for(int j=i-1;j>0;j-=1){
                if (i%j==0) {
                    SumaDivisores+=j;
                }
            }
            if (SumaDivisores>i) {
                Abundante=i;
            }
        }
        Console.writeLine("El numero abundante mas grande es: %d",Abundante);*/
        int[]Num=new int[]{};
        var Sum=0f;
        var size = 0;
        var avg=0f;
        Console.writeLine("Ingrese el tamaño del arreglo: ");
        size = Integer.parseInt(Console.readLine());
        Num = new int[size];
        for(int k=0;k<Num.length;k++){
            Console.writeLine("Ingrese los numeros");
            Num[k]=Integer.parseInt(Console.readLine());
            Sum+=Num[k];
        }
        avg=Sum/10f;
        Console.writeLine("Promedio: %f",avg);
        Console.writeLine("Numeros mayores al promedio: ");
        for(var k=0;k<10;k++){
            if (Num[k]>avg) {
                Console.write("%d ",Num[k]);
            }
        }
    }
}
