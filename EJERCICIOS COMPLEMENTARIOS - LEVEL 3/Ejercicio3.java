import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        List<String> palabras = new ArrayList<>(Arrays.asList("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac"));

        List<String> palabrasConB = palabras.stream()
        .filter(n -> n.toLowerCase().toCharArray()[0] == 'b')
        .collect(Collectors.toList());

        System.out.println(palabrasConB.size());

    }
    
}
