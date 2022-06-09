import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ent = scan.nextLine();
        String caracter1 = scan.nextLine();
        char[] car = caracter1.toCharArray();
        char car1 = car[0];
        scan.close();
        cantidadDeLetrasRepetidas(ent, car1);
    }
    /// toma un String y un char devuelve cuantas veces el char se repite en el String
    public static void cantidadDeLetrasRepetidas(String entrada, char caracter) {
        char[] e = entrada.toCharArray();
        int l = entrada.length();
        int n = 0;
        for (int i=0; i < l; i++) {
            if (e[i] == caracter) {
                n = n + 1;

            }
        }
        System.out.println(String.format("El caracter '%s' se repite %s veces", caracter, n));
        
    }
}
