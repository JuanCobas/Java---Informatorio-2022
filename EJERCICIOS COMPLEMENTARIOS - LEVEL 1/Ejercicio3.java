import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        incremental();
    }

    ///toma un numero y muestra la secuencia incremental desde 1 hasta n
    public static void incremental() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=1; i<=n; i++) {
            for (int k=1; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.print("\n");


        }
        scan.close();
        
    }
    
}
