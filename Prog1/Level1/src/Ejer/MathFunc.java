public class MathFunc {
    public static int[] convStrArrayToIntArray(String[] strings) {
        int[] num = new int[strings.length];
        for (var k = 0; k < num.length; k++) {
            // El valor ingresado del arreglo String tiene que venir con algunas
            // especifaciones.
            num[k] = Integer.parseInt(strings[k].trim()); // Trim quita todos los espacios que los separen
        }
        return num;
    }

    public static float[] convStrArrayToFloatArray(String[] strings) {
        float[] num = new float[strings.length];
        for (var k = 0; k < num.length; k++) {
            num[k] = Float.parseFloat(strings[k].trim());
        }
        return num;
    }

    public static float addition(float[] nums) {
        float num = 0f;
        for (var k = 0; k < nums.length; k++) {
            num += nums[k];
        }
        return num;
    }

    public static float multiply(int[] nums) {
        float num = 0f;
        for (var k = 0; k < nums.length; k++) {
            num *= nums[k];
        }
        return num;
    }

    public static float average(float[] nums) {
        float avg = 0;
        avg = addition(nums) / nums.length;
        return avg;
    }

    public static int[] additionArreglo(int[] arreglo1, int[] arreglo2) {
        int[] Small = new int[] {};
        int[] Big = new int[] {};
        if (arreglo2.length > arreglo1.length) {
            Big = arreglo2;
            Small = arreglo1;
        } else {
            Big = arreglo1;
            Small = arreglo2;
        }
        int[] arreglofinal = Big;
        for (var k = 0; k < Small.length; k++) {
            arreglofinal[k] += Small[k];
        }
        return arreglofinal;

    }

    public static int[] substractionArreglo(int[] arreglo1, int[] arreglo2) {
        var mayor = 0;
        if (arreglo1.length > arreglo2.length) {
            mayor = arreglo1.length;
        } else if (arreglo1.length < arreglo2.length) {
            mayor = arreglo2.length;
        } else {
            mayor = arreglo1.length;
        }
        int[] arreglofinal = new int[mayor];
        for (var k = 0; k < mayor; k++) {
            if (k > arreglo1.length) {
                arreglofinal[k] = 0 - arreglo2[k];
            } else if (k > arreglo2.length) {
                arreglofinal[k] = arreglo1[k] - 0;
            } else {
                arreglofinal[k] = arreglo1[k] - arreglo2[k];
            }
        }
        return arreglofinal;
    }

    public static int[] multiply(int[] arreglo1, int[] arreglo2) {
        int[] total = new int[arreglo1.length];
        for (var k = 0; k < arreglo1.length; k++) {
            total[k] = arreglo1[k] * arreglo2[k];
        }
        return total;
    }

    public static float[] division(int[] arreglo1, int[] arreglo2) {
        float[] total = new float[arreglo1.length];
        for (int k = 0; k < arreglo1.length; k++) {
            total[k] = (float) (arreglo1[k] / arreglo2[k]);
        }
        return total;
    }

    public static float sumProduct(float[] arreglo1, float[] arreglo2) {
        float total = 0;
        float[] producto = new float[arreglo1.length];
        for (int k = 0; k < arreglo1.length; k++) {
            producto[k] = arreglo1[k] * arreglo2[k];
        }
        total = addition(producto);
        return total;
    }

    public static double varianza(float[] arreglo1) {
        double varianza = 0;
        var avg = average(arreglo1);
        float[] media = new float[arreglo1.length];
        float[] resta = new float[arreglo1.length];
        double[] cuadrado = new double[arreglo1.length];
        double suma = 0;
        for (var k = 0; k < arreglo1.length; k++) {
            media[k] = avg;
        }
        for (var k = 0; k < arreglo1.length; k++) {
            resta[k] = arreglo1[k] - media[k];
        }
        for (var k = 0; k < arreglo1.length; k++) {
            cuadrado[k] = Math.pow(resta[k], 2);
        }
        for (var k = 0; k < arreglo1.length; k++) {
            suma += cuadrado[k];
        }
        varianza = suma / (arreglo1.length); // Se puede restar de a unidad
        return varianza;
    }

    public static double desvEst(float[] arreglo1) {
        double standarDeviation = 0;
        standarDeviation = Math.pow(varianza(arreglo1), 1 / 2f);
        return standarDeviation;
    }

    public static int[] paresPos(int num) {
        int[] parespos = new int[num];
        var k = 0;
        for (int i = 0; k < num; i++) {
            if (i % 2 == 0) {
                parespos[k] = i;
                k++;
            }
        }
        return parespos;
    }

    public static int[] imparesPos(int num) {
        int[] imparespos = new int[num];
        var k = 0;
        for (int i = 0; k < num; i++) {
            if (i % 2 != 0) {
                imparespos[k] = i;
                k++;
            }
        }
        return imparespos;
    }

    public static int[] factorial(int num) {
        int[] factorial = new int[num];
        var fact = 1;
        var k = 0;
        for (int i = 1; k < num; i++) {
            fact *= i;
            factorial[k] = fact;
            k++;
        }
        return factorial;
    }

    public static int[] compuestos(int num) { // Se puede hacer con las funciones del programa Funciones
        int[] compound_number = new int[num];
        var k = 0;
        int j, divisores, limite;
        for (int i = 0; k < num; i++) {
            limite = i / 2;
            divisores = 2;
            j = 2;
            while (j <= limite) {
                if (i % j == 0) {
                    divisores += 1;
                }
                j++;
            }
            if (divisores > 2) {
                compound_number[k] = i;
                k++;
            }
        }
        return compound_number;
    }

    public static int[] prime(int num) { // Se puede hacer con las funciones del programa Funciones.
        int[] prime = new int[num];
        var k = 0;
        int j, divisores, limite;
        for (int i = 1; k < num; i++) {
            limite = i / 2;
            divisores = 2;
            j = 2;
            while (j <= limite) {
                if (i % j == 0) {
                    divisores += 1;
                }
                j++;
            }
            if (divisores == 2) {
                prime[k] = i;
                k++;
            }
        }
        return prime;
    }

    public static int[] primorial(int num) { // Preguntar si los numeros primoriales de los primeros 10 naturales o si
                                             // los primeros 10 primoriales
        int[] primorial = new int[num];
        var k = 0;
        for (int i = 1; k < num; i++) {
            if (Funciones.isPrime(i)) {
                primorial[k] = Funciones.Primorial(i);
                k++;
            }
        }
        return primorial;
    }

    public static int[] perfect(int num) {
        int[] perfect = new int[num];
        var k = 0;
        for (int i = 1; k < num; i++) {
            if (Funciones.isPerfect(i)) {
                perfect[k] = i;
                k++;
            }
        }
        return perfect;
    }

    public static int Frequency(int[] nums, int num) {
        var repeated_number = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                repeated_number += 1;
            }
        }
        return repeated_number;

    }

    public static int[] noRepetidos(int[] nums) {
        int[] noRepetidos = new int[] {};
        var k = 0;
        var index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Frequency(nums, nums[i]) == 1) {
                index++;
            }
        }
        k = 0;
        noRepetidos = new int[index];
        for (int i = 0; i < nums.length; i++) {
            if (Frequency(nums, nums[i]) == 1) {
                noRepetidos[k] = nums[i];
                k++;
            }
        }
        return noRepetidos;
    }

    public static int[] Repetidos(int[] nums) {
        int[] Repetidos = new int[] {};
        var k = 0;
        var index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Frequency(nums, nums[i]) > 1) {
                index++;
            }
        }
        Repetidos = new int[index];
        for (int i = 0; i < nums.length; i++) {
            if (Frequency(nums, nums[i]) > 1) {
                Repetidos[k] = nums[i];
                k++;
            }
        }
        return Repetidos;
    }

    public static int[] FrequencyAmount(int[] nums) {
        int[] FrequencyAmount = new int[nums.length];
        var k = 0;
        for (int i = 0; i < nums.length; i++) {
            FrequencyAmount[k] = Frequency(nums, nums[i]);
            k++;
        }
        return FrequencyAmount;
    }

    public static int[] Unicos(int[] nums) {
        return noRepetidos(nums);
    }

    public static int[] sort(int[] nums, boolean mayor_menor) {  // Se hace como un tipo de función que empieza a comprobar todos los valores
        int mayor = 0;                                           // Entonces, se crea una variable auxiliar, y se crean 2 for  
        if (mayor_menor == true) {                                 
            for (int i = 0; i < nums.length; i++) { // la i se encarga de ver el valor del arreglo 
                for (int j = i + 1; j < nums.length; j++) {  // la j ve el valor del arreglo siguiente al de la i
                    if (nums[i] < nums[j]) {
                        mayor = nums[j];
                        nums[j] = nums[i];
                        nums[i] = mayor;
                    }
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] > nums[i]){
                        mayor = nums[i];
                        nums[i] = nums[j];
                        nums[j] = mayor;
                    }
                }
            }
        }
        return nums;
    }
    public static int[] union(int[] nums, int[] nums2){
        int[] union = new int[]{};
        var amount = 0;
        for(int i = 0; i < nums.length; i++){
            if(Frequency(nums, nums[i]) >= 1){
                amount++;
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(Frequency(nums2, i) >= 1){
                amount++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums2[i]){
                
            }
        }
        union = new int[amount];
        int k = 0;
        for(int i = 0; i < amount; i++){
            if(nums.length > i){
                union[i] = nums[i];
            } else {
                union[i] = nums2[k];
                k++;
            }
        }
        return union;

    }
}
