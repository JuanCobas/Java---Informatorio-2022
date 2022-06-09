import java.util.Scanner;

public class Ejercicio7v1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una palabra para convertir a masyusculas: ");
        String palabra1 = scan.nextLine();
        scan.close();
        palabra1 = uppercase(palabra1);
        System.out.println(palabra1);
        
        
    }
    ///Devuelve cualquier palabra con todas sus minusculas convertidas en mayusculas
    public static String uppercase(String palabra) {
        int k = palabra.length();
        char[] largo = palabra.toCharArray();
        for (int i=0; i<k; i++) {
            char c = largo[i];
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - ('a' - 'A'));   /// No entiendo que hace el (char)
                largo[i] = c;
                
            } else {
                largo[i] = c;
                
            }
                    
        }
        String palabraUpercase = String.valueOf(largo);
        return palabraUpercase;

       
        
        
    }
    
}
