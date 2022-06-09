import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        operaciones();
    }
    /// Se ingresan 2 numeros enteros y devuelve la suma, resta, multiplicacion, division y modulo de dichos numeros en el orden dado 
    public static void operaciones() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inrese el primer numero entero:");
        int n1 = scan.nextInt();
        System.out.println("Inrese el segundo numero entero:");
        int n2 = scan.nextInt();
        System.out.println(String.format("%d + %d = " + (n1+n2), n1, n2));
        System.out.println(String.format("%d - %d = " + (n1-n2), n1, n2));
        System.out.println(String.format("%d * %d = " + (n1*n2), n1, n2));
        System.out.println(String.format("%d / %d = " + (n1/n2), n1, n2));
        System.out.println(String.format("%d %% %d = " + (n1%n2), n1, n2));
        scan.close();
        

        
    }

}
