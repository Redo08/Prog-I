public class Ejer22 {
    public static void main(String[] args) {
        var weightK = 0f;
        var weightP = 0d;
        var weightG = 0f;
        var desicion = '?';

        Console.writeLine("Escriba L si quiere pasar a libras o escriba G si quiere pasar a gramos");
        desicion = Console.readLine().toUpperCase().charAt(0);
        if (desicion == 'L') {
            Console.writeLine("Ingrese el valor del peso en kilogramos");
            weightK = Float.parseFloat(Console.readLine());
            weightP = weightK * 2.2046;
            Console.writeLine("El peso en libras es de: %f",weightP);
        } else if (desicion == 'G') {
            Console.writeLine("Ingrese el valor del peso en kilogramos");
            weightK = Float.parseFloat(Console.readLine());
            weightG = weightK * 1000;
            Console.writeLine("El peso en gramos es de: %f",weightG);
        } else {
            Console.writeLine("Error");
        }

    }
}
