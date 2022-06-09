import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        factorial();
    }
    ///Facotorial de un entero con for
    public static void factorial() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1 = 1;
        for (int i=1; i<=n; i++) {
            n1 = n1*i;
        }
        System.out.println(n1);
        scan.close();
        
    }
}
