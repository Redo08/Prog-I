public class Ejer60 {
    public static int reglas(int user_position, int new_position){
        return new_position;
    }
    public static void main(String[] args) {
        var user_position = 0;
        var pc_position = 0;
        var dice = 0;
        var new_position = 0;
        var turno = 0;

        Console.writeLine("Bienvenido a serpientes y escaleras");
        Console.writeLine("Para dar inicio oprime [ENTER]");
        Console.readLine();
        while(user_position <100 && pc_position <100){
            dice = (int) ( 1 + Math.random() * 6);
            Console.writeLine("Sacaste %d", dice);
            if(user_position + dice <= 100){
                user_position += dice;
                Console.writeLine("En total vas en la casilla %d", user_position);
                Console.readLine();
                Console.writeLine();
            } else{
                Console.writeLine("Te pasaste, pierdes el turno, vas en la casiila %d", user_position);
                Console.readLine();
                Console.writeLine();
            }
                new_position = user_position;
            if (user_position == 10){
                new_position = 33;
            } else if (user_position == 16){
                new_position = 37;
            } else if (user_position == 21){
                new_position = 41;
            } else if (user_position == 23){
                new_position = 2;
            } else if (user_position == 34){
                new_position = 15;
            } else if (user_position == 35){
                new_position = 54;
            } else if (user_position == 44){
                new_position = 76;
            } else if (user_position == 52){
                new_position = 31;
            } else if (user_position == 62){
                new_position = 43;
            } else if (user_position == 80){
                new_position = 99;
            } else if (user_position == 89){
                new_position = 68;
            } else if (user_position == 95){
                new_position = 74;
            }  
                if(user_position != new_position){
                if (new_position > user_position){
                    Console.writeLine("Subiste por las escaleras");
                } else {
                    Console.writeLine("Bajaste por una serpiente");
                }
                user_position = new_position;
                Console.writeLine("Tu nueva posición actual es: %d", user_position);
                Console.readLine();
            }

            dice = (int) ( 1 + Math.random() * 6);
            Console.writeLine("La consola sacó %d", dice);
            if(pc_position + dice <= 100){
                pc_position += dice;
                Console.writeLine("En total la consola va en la casilla %d", pc_position);
                Console.readLine();
                Console.writeLine();
            } else{
                Console.writeLine("La computadora se paso, pierde el turno, va en la casilla %d", pc_position);
                Console.readLine();
                Console.writeLine();
            }
            new_position = pc_position;
            if (pc_position == 10){
                new_position = 33;
            } else if (pc_position == 16){
                new_position = 37;
            } else if (pc_position == 21){
                new_position = 41;
            } else if (pc_position == 23){
                new_position = 2;
            } else if (pc_position == 34){
                new_position = 15;
            } else if (pc_position == 35){
                new_position = 54;
            } else if (pc_position == 44){
                new_position = 76;
            } else if (pc_position == 52){
                new_position = 31;
            } else if (pc_position == 62){
                new_position = 43;
            } else if (pc_position == 80){
                new_position = 99;
            } else if (pc_position == 89){
                new_position = 68;
            } else if (pc_position == 95){
                new_position = 74;
            }  
                if(pc_position != new_position){
                if (new_position > pc_position){
                    Console.writeLine("La consola subio por las escaleras");
                } else if (new_position < pc_position){
                    Console.writeLine("La consola bajo por una serpiente");
                }
                pc_position = new_position;
                Console.writeLine("La nueva posición de la consola es: %d", pc_position);
                Console.readLine();
            }
            turno += 1;
        }
        if (user_position > pc_position){
            Console.writeLine("Ganaste usuario en %d turnos", turno);
        } else if (user_position < pc_position){
            Console.writeLine("La consola gano en %d turnos", turno);
        } else {
            Console.writeLine("Empate! en %d", turno);
        }


        
    }
}
