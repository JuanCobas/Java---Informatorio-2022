import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        potencia();
    }

    ///App que calcula la potencia de un numero
    public static void potencia() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inrese un numero entero para la base:");
        int n1 = scan.nextInt(); 
        System.out.print("Inrese un numero entero para el exponente:");
        int n2 = scan.nextInt();
        int n = 1;
        for (int i=1; i<=n2; i++) {
            n = n * n1;
        }
        System.out.println(n);
        scan.close();
        
    }
}
