public class Ejer80 {
    public static void showRoman(){
        var num = 0;
        var Rom = "";
        Console.writeLine("Ingrese un numero para convertir a Romano: ");
        num = Integer.parseInt(Console.readLine());
        Rom = Funcionesh.convArabicToRoman(num);
        Console.writeLine(Rom);
    }
    public static void showArabic(){
        var roman = "";
        var num = 0;
        Console.writeLine("Ingrese un numero romano para convertir a Arabigo: ");
        roman = Console.readLine().toUpperCase();
        num = Funcionesh.convRomanToArabic(roman);
        Console.writeLine(num);
    }
    public static void showSumaRomana(){
        var roman = "";
        var roman2 = "";
        var num = 0;
        var num2 = 0;
        var total = 0;
        Console.writeLine("Ingrese un numero romano que quiere sumar (entre I y IC): ");
        roman = Console.readLine().toUpperCase();
        Console.writeLine("Ingrese el otro numero romano (Entre I y IC): ");
        roman2 = Console.readLine().toUpperCase();
        num = Funcionesh.convRomanToArabic(roman);
        num2 = Funcionesh.convRomanToArabic(roman2);
        total = Funcionesh.suma(num, num2);
        roman = Funcionesh.convArabicToRoman(total);
        Console.writeLine("El total es: %s", roman);

    }
    public static void main(String[] args) {
        char read = '?';
        char read2 = '?';
        do{ Console.writeLine("Bienvenido, oprima 1 para pasar de Arabigo a romano o 0 para el contrario. Oprima 2 para hacer suma de romanos");
        read = Console.readLine().toUpperCase().charAt(0);
        if (read == '1'){
            showRoman();
        } else if (read == '0'){
            showArabic();
        } else if (read == '2'){
            showSumaRomana();
        } else {
            Console.writeLine("Esa función no existe");
        }
        Console.writeLine("Desea continuar? (S/N)");
        read2 = Console.readLine().toUpperCase().charAt(0);
        }while (read2 != 'N');

    }
}
