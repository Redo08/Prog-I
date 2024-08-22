public class Ejer31 {
    public static void main(String[] args) {
        String athletes_name1, athletes_name2, athletes_name3, athletes_name4, athletes_name5, athletes_name6,
                athletes_name7, athletes_name8 = "";

        String resultados1, resultados2, resultados3, resultados4, resultados5, resultados6, resultados7 = "";

        var ganador_partido1 = "";
        var ganador_partido2 = "";
        var ganador_partido3 = "";
        var ganador_partido4 = "";
        var ganador_partido5 = "";
        var ganador_partido6 = "";
        var ganador_partido7 = "";



        Console.writeLine("Ingrese el nombre del atleta del rank 1");
        athletes_name1 = Console.readLine().toUpperCase();
        Console.writeLine("Ingrese el nombre del atleta del rank 2");
        athletes_name2 = Console.readLine().toUpperCase();
        Console.writeLine("Ingrese el nombre del atleta del rank 3");
        athletes_name3 = Console.readLine().toUpperCase();
        Console.writeLine("Ingrese el nombre del atleta del rank 4");
        athletes_name4 = Console.readLine().toUpperCase();
        Console.writeLine("Ingrese el nombre del atleta del rank 5");
        athletes_name5 = Console.readLine().toUpperCase();
        Console.writeLine("Ingrese el nombre del atleta del rank 6");
        athletes_name6 = Console.readLine().toUpperCase();
        Console.writeLine("Ingrese el nombre del atleta del rank 7");
        athletes_name7 = Console.readLine().toUpperCase();
        Console.writeLine("Ingrese el nombre del atleta del rank 8");
        athletes_name8 = Console.readLine().toUpperCase();

        

        Console.writeLine("Ingrese el resultado del primer partido, se enfrentan: %S y %S; recuerde que las opciones son \n" +
                "1. 2-0 si gano la primera contrincante\n" +
                "2. 2-1 si gano la primera contrincante\n" +
                "3. 0-2 si gano la segunda contrincante\n" +
                "2. 1-2 si gano la segunda contrincante\n", athletes_name1, athletes_name8);
        resultados1 = Console.readLine();

        if (resultados1.equals("2-0") || resultados1.equals("2-1")) {
            ganador_partido1 = athletes_name1;
        } else if (resultados1.equals("0-2") || resultados1.equals("1-2")) {
            ganador_partido1 = athletes_name8;
        }
        Console.writeLine("La ganadora del primer partido fue: %S", ganador_partido1);
        Console.writeLine("---------------------------------------------------------");

        Console.writeLine("Ingrese el resultado del segundo partido, se enfrentan: %S y %S; recuerde que las opciones son \n" +
                "1. 2-0 si gano la primera contrincante\n" +
                "2. 2-1 si gano la primera contrincante\n" +
                "3. 0-2 si gano la segunda contrincante\n" +
                "2. 1-2 si gano la segunda contrincante\n", athletes_name4, athletes_name5);
        resultados2 = Console.readLine();

        if (resultados2.equals("2-0") || resultados2.equals("2-1")) {
            ganador_partido2 = athletes_name4;
        } else if (resultados2.equals("0-2") || resultados2.equals("1-2")) {
            ganador_partido2 = athletes_name5;
        }
        Console.writeLine("La ganadora del segundo partido fue: %S", ganador_partido2);
        Console.writeLine("---------------------------------------------------------");

        Console.writeLine("Ingrese el resultado del tercer partido, se enfrentan: %S y %S; recuerde que las opciones son \n" +
                "1. 2-0 si gano la primera contrincante\n" +
                "2. 2-1 si gano la primera contrincante\n" +
                "3. 0-2 si gano la segunda contrincante\n" +
                "2. 1-2 si gano la segunda contrincante\n", athletes_name6, athletes_name3);
        resultados3 = Console.readLine();

        if (resultados3.equals("2-0") || resultados3.equals("2-1")) {
            ganador_partido3 = athletes_name6;
        } else if (resultados3.equals("0-2") || resultados3.equals("1-2")) {
            ganador_partido3 = athletes_name3;
        }
        Console.writeLine("La ganadora del tercer partido fue: %S", ganador_partido3);
        Console.writeLine("---------------------------------------------------------");

        Console.writeLine("Ingrese el resultado del cuarto partido, se enfrentan: %S y %S recuerde que las opciones son \n" +
                "1. 2-0 si gano la primera contrincante\n" +
                "2. 2-1 si gano la primera contrincante\n" +
                "3. 0-2 si gano la segunda contrincante\n" +
                "2. 1-2 si gano la segunda contrincante\n", athletes_name7, athletes_name2);
        resultados4 = Console.readLine();

        if (resultados4.equals("2-0") || resultados4.equals("2-1")) {
            ganador_partido4 = athletes_name7;
        } else if (resultados4.equals("0-2") || resultados4.equals("1-2")) {
            ganador_partido4 = athletes_name2;
        }
        Console.writeLine("La ganadora del cuarto partido fue: %S", ganador_partido4);
        Console.writeLine("---------------------------------------------------------");

        Console.writeLine("Ingrese el resultado del quinto partido, se enfrentan: %S y %S; recuerde que las opciones son \n" +
                "1. 2-0 si gano la primera contrincante\n" +
                "2. 2-1 si gano la primera contrincante\n" +
                "3. 0-2 si gano la segunda contrincante\n" +
                "2. 1-2 si gano la segunda contrincante\n", ganador_partido1, ganador_partido2);
        resultados5 = Console.readLine();

        if (resultados5.equals("2-0") || resultados5.equals("2-1")) {
            ganador_partido5 = ganador_partido1;
        } else if (resultados5.equals("0-2") || resultados5.equals("1-2")) {
            ganador_partido5 = ganador_partido2;
        }
        Console.writeLine("La ganadora del quinto partido fue: %S", ganador_partido5);
        Console.writeLine("---------------------------------------------------------");


        Console.writeLine("Ingrese el resultado del sexto partido, se enfrentan: %S y %S; recuerde que las opciones son \n" +
                "1. 2-0 si gano la primera contrincante\n" +
                "2. 2-1 si gano la primera contrincante\n" +
                "3. 0-2 si gano la segunda contrincante\n" +
                "2. 1-2 si gano la segunda contrincante\n", ganador_partido3, ganador_partido4);
        resultados6 = Console.readLine();

        if (resultados6.equals("2-0") || resultados6.equals("2-1")) {
            ganador_partido6 = ganador_partido3;
        } else if (resultados6.equals("0-2") || resultados6.equals("1-2")) {
            ganador_partido6 = ganador_partido4;
        }
        Console.writeLine("La ganadora del sexto partido fue: %S", ganador_partido6);
        Console.writeLine("---------------------------------------------------------");

        Console.writeLine("Ingrese el resultado del septimo partido, se enfrentan: %S y %S; recuerde que las opciones son \n" +
                "1. 2-0 si gano la primera contrincante\n" +
                "2. 2-1 si gano la primera contrincante\n" +
                "3. 0-2 si gano la segunda contrincante\n" +
                "2. 1-2 si gano la segunda contrincante\n", ganador_partido5, ganador_partido6);
        resultados7 = Console.readLine();

        if(resultados7.equals("2-0") || resultados7.equals("2-1")) {
            ganador_partido7 = ganador_partido5;
        } else if (resultados7.equals("0-2") || resultados7.equals("1-2")) {
            ganador_partido7 = ganador_partido6;
        }
        Console.writeLine("La ganadora del septimo partido fue: %S", ganador_partido7);

        Console.writeLine("Ganadora maxima es: %S", ganador_partido7);
        
    }
}