public class Parcial2 {
    public static void main(String[] args) {
        /*
         * var num = 28;
         * for(int i = 0; i < num; i++){
         * if(i%7 == 0){
         * Console.writeLine("");
         * }
         * if(i%2 != 0){
         * Console.write("0");
         * }
         * if(i%2 == 0){
         * Console.write("1");
         * }
         * }
         */

        /*for (int i = 5; 0 < i; i--) {
            for (int k = 0; k <= i; k++) {
                if (k < i) {
                    Console.write(" *");
                }
                if (k >= i) {
                    for(int j = 5; i < j; j--){
                    Console.write(" #");
                    }
                }
            }
            Console.writeLine("");*/
        
        var k = 5;
        var text = "*";
        for(int i = 1; i <= 25; i++){
            if(k< 5){
                Console.write(text);
            }
            if(i == 15){
                Console.write('#');
            }
            if(i%5 == 0){
                Console.writeLine("");
                k--;
            }
            
        }
    }
}
