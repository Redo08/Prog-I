public class temporizador{ 
    public static void main(String[] args) {
        var minutos = 0;
        var segundos = 0;
        do{
            Console.writeLine("Ingrese los minutos, (Max 30)");
            minutos = Integer.parseInt(Console.readLine());
            Console.writeLine("Ingrese los segundos (Max 59)");
            segundos = Integer.parseInt(Console.readLine());
        } while (minutos > 30 || segundos > 59);
        for(int i = minutos; 0 <= i; i--){
            if(i < minutos){
                for(int j = 59; 0 < j; j--){
                    Console.writeLine(i + (":") + j);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
                }
            }
            else {
                for(int j = segundos; 0 < j; j--){
                    Console.writeLine(i + (":") + j);
                }
            }
            Console.writeLine(i + ": 00");
        }

    }
}