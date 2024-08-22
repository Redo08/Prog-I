
public class Ejer29 {
    public static void main(String[] args) {
        var placa_Automovil = "";
        var ult_Dig = '?';
        var nombre_dia = "";
        var ciudades = "";
        Console.writeLine("Ingrese la placa del automovil");
        placa_Automovil = Console.readLine();
        ult_Dig = placa_Automovil.charAt(5);
        Console.writeLine("Ingrese el dia");
        nombre_dia = Console.readLine().toUpperCase(); 
        if (nombre_dia.equals("LUNES") && (ult_Dig == '0' || ult_Dig == '1') || nombre_dia.equals("MARTES") && (ult_Dig == '2' || ult_Dig == '3') || nombre_dia.equals("MIERCOLES") && (ult_Dig == '4' || ult_Dig == '5') || nombre_dia.equals("JUEVES") && (ult_Dig == '6' || ult_Dig == '7') || nombre_dia.equals("VIERNES") && (ult_Dig == '8' || ult_Dig == '9')) {
            ciudades = ciudades + " Manizales";
        }
        if (nombre_dia.equals("LUNES") && (ult_Dig == '0' || ult_Dig == '9') || nombre_dia.equals("MARTES") && (ult_Dig == '1' || ult_Dig == '8') || nombre_dia.equals("MIERCOLES") && (ult_Dig == '2' || ult_Dig == '7') || nombre_dia.equals("JUEVES") && (ult_Dig == '3' || ult_Dig == '6') || nombre_dia.equals("VIERNES") && (ult_Dig == '4' || ult_Dig == '5')) {
            ciudades = ciudades + " Pereira";
        }
        if (nombre_dia.equals("LUNES") && (ult_Dig == '8' || ult_Dig == '9') || nombre_dia.equals("MARTES") && (ult_Dig == '6' || ult_Dig == '7') || nombre_dia.equals("MIERCOLES") && (ult_Dig == '4' || ult_Dig == '5') || nombre_dia.equals("JUEVES") && (ult_Dig == '2' || ult_Dig == '3') || nombre_dia.equals("VIERNES") && (ult_Dig == '0' || ult_Dig == '1')) {
            ciudades = ciudades + " Medellin";
        }
        if (nombre_dia.equals("LUNES") && (ult_Dig == '1' || ult_Dig == '2') || nombre_dia.equals("MARTES") && (ult_Dig == '3' || ult_Dig == '4') || nombre_dia.equals("MIERCOLES") && (ult_Dig == '5' || ult_Dig == '6') || nombre_dia.equals("JUEVES") && (ult_Dig == '7' || ult_Dig == '8') || nombre_dia.equals("VIERNES") && (ult_Dig == '9' || ult_Dig == '0')) {
            ciudades = ciudades + " Barranquilla";
        }
        if (nombre_dia.equals("LUNES") && (ult_Dig == '8' || ult_Dig == '9') || nombre_dia.equals("MARTES") && (ult_Dig == '0' || ult_Dig == '1') || nombre_dia.equals("MIERCOLES") && (ult_Dig == '2' || ult_Dig == '3') || nombre_dia.equals("JUEVES") && (ult_Dig == '4' || ult_Dig == '5') || nombre_dia.equals("VIERNES") && (ult_Dig == '6' || ult_Dig == '7')) {
            ciudades = ciudades + " Armenia";
        }
        if (nombre_dia.equals("LUNES") && (ult_Dig == '2' || ult_Dig == '7') || nombre_dia.equals("MARTES") && (ult_Dig == '3' || ult_Dig == '8') || nombre_dia.equals("MIERCOLES") && (ult_Dig == '4' || ult_Dig == '9') || nombre_dia.equals("JUEVES") && (ult_Dig == '0' || ult_Dig == '5') || nombre_dia.equals("VIERNES") && (ult_Dig == '1' || ult_Dig == '6')) {
            ciudades = ciudades + " Bogota";
        }
        if (nombre_dia.equals("LUNES") && (ult_Dig == '3' || ult_Dig == '4') || nombre_dia.equals("MARTES") && (ult_Dig == '5' || ult_Dig == '6') || nombre_dia.equals("MIERCOLES") && (ult_Dig == '7' || ult_Dig == '8') || nombre_dia.equals("JUEVES") && (ult_Dig == '9' || ult_Dig == '0') || nombre_dia.equals("VIERNES") && (ult_Dig == '1' || ult_Dig == '2')) {
            ciudades = ciudades + " Bucaramanga";
        }
        if (nombre_dia.equals("LUNES") && (ult_Dig == '1' || ult_Dig == '6') || nombre_dia.equals("MARTES") && (ult_Dig == '2' || ult_Dig == '7') || nombre_dia.equals("MIERCOLES") && (ult_Dig == '3' || ult_Dig == '8') || nombre_dia.equals("JUEVES") && (ult_Dig == '4' || ult_Dig == '9') || nombre_dia.equals("VIERNES") && (ult_Dig == '0' || ult_Dig == '5')) {
            ciudades = ciudades + " Cartagena";
        }
        if (nombre_dia.equals("SABADO") || nombre_dia.equals("DOMINGO")) {
            Console.writeLine("No tiene pico y placa");
        }
        if (ciudades.isEmpty()){
            Console.writeLine("No tiene pico y placa");
        }
        else {
            Console.writeLine("las ciudades con pico y placa para la placa %S el día %S son: %S", placa_Automovil, nombre_dia, ciudades);
        }

        
    }
}
