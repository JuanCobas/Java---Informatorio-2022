import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        uppercase();
        
        
    }
    ///Devuelve cualquier palabra con todas sus minusculas convertidas en mayusculas
    public static void uppercase() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una palabra para convertir a masyusculas: ");
        String palabra = scan.nextLine();
        int k = palabra.length();
        char[] largo = palabra.toCharArray();
        for (int i=0; i<k; i++) {
            char c = largo[i];
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - ('a' - 'A')); /// No entiendo que hace el (char)
            System.out.print(c);
            } else {
                System.out.print(c);
            }
        
        }
        scan.close();
        
        
    }
}
