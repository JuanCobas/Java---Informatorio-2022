import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        hola();
    }
    public static void hola() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = scan.nextLine();
        System.out.println(String.format("Hola %s!!!", nombre));
        scan.close();

        
    }
}
