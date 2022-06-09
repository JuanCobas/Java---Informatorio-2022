import java.util.Arrays;

public class Ejercicio7 {

    public static void main(String[] args) {
        String[] a = fizzbuzz(5, 4);
        System.out.println(Arrays.toString(a));
    }   

    ///se ingresan 2 numeros, a < b y devuelve un String array con los numeros comprendidos entre a y b, sin incluir b.
    ///Si el numero es multiplo de 2 reemplaza el numero por la palabra Fizz, si es multiplo de 3, reemplaza por Buzz, y si es multiplo de ambos reemplaza por FizzBuzz
    public static String[] fizzbuzz(int a, int b) {
        if (a < b) {
            String[] array = new String[b-a];
            int counter = 0;
            for (int i = a; i<b; i++){
                if (i%2 == 0 && i%3 == 0){
                    array[counter] = "FizzBuzz";
                    counter++;
                    
                } else if (i%2 == 0){
                    array[counter] = "Fizz";
                    counter++;

                } else if (i%3 == 0){
                    array[counter] = "Buzz";
                    counter++;

                } else {
                    array[counter] = String.format("%s", i);
                    counter++;
                }
            } 
            return array;
        } else {
            String[] array = new String[0];
            System.out.println("A debe ser menor que B");
            return array;
        }


        
    }
    
}
