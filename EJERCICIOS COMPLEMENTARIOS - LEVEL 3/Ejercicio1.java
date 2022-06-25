import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

        
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List<String> palabrasNoNull = palabras.stream()
        .filter(palabra -> palabra != "" && palabra != null)
        .collect(Collectors.toList());

        palabrasNoNull.stream()
        .forEach(palabra -> System.out.println(palabra));

        
    }
   
    
}
