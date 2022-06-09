import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> baraja = new ArrayList<String>(Arrays.asList("A", "2", "3", "4", "5", "6", "7", 
        "8", "9", "10"));
        System.out.println(baraja);
        Collections.reverse(baraja); 
        System.out.println(baraja);
        Collections.shuffle(baraja);
        System.out.println(baraja);

        
    }
}
