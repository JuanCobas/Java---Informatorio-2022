import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        multiplicacionporsuma();
    }
    ///App que pide 2 numeros enteros y los multiplica por suma sucesiva
    public static void multiplicacionporsuma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inrese el primer numero entero:");
        int n1 = scan.nextInt(); 
        System.out.println("Inrese el segundo numero entero:");
        int n2 = scan.nextInt();
        int n = 0;
        for (int i=1; i<=n1; i++) {
            n = n + n2;
        }
        System.out.println(n);
        scan.close();
        
    }
    
}
