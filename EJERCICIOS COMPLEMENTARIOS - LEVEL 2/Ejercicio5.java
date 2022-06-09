import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        sueldo();
    }

    public static void sueldo() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajas cada dia de la semana y luego el valor-por-hora de dicho dia: ");
        ArrayList<String> dias = new ArrayList<String>(Arrays.asList("Lunes", "Martes",
         "Miercoles", "Jueves", "Viernes"));
        ArrayList<Integer> horastrabajas = new ArrayList<>();
        ArrayList<Integer> valorhora = new ArrayList<>();
        ArrayList<Integer> sueldopordia = new ArrayList<>();
        for (int i = 0; i<dias.size(); i++) {
            System.out.println("Horas trabajas el " + dias.get(i) + ": ");
            int h = scan.nextInt();
            ///int h1 = Integer.parseInt(h);
            horastrabajas.add(h);
            System.out.println("Valor de la hora el " + dias.get(i) + ": ");
            int v = scan.nextInt();
            ///int v1 = Integer.parseInt(v);
            valorhora.add(v);
        }
        scan.close();
        int sueldototal = 0;
        for (int i = 0; i<valorhora.size();i++) {
            sueldopordia.add(horastrabajas.get(i) * valorhora.get(i));
            sueldototal = sueldototal + sueldopordia.get(i);
        }

        
        System.out.println(horastrabajas);
        System.out.println(valorhora);
        System.out.println(sueldopordia);
        System.out.println("El sueldo total de la semana es: $ " + sueldototal);
        
    }

    
}
