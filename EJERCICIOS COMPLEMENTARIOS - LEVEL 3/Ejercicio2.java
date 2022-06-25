import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List<Integer> numerosAlCuadrado = numeros.stream()
        .map(numero -> (int)Math.pow(numero, 2))
        .collect(Collectors.toList());

        numerosAlCuadrado.stream().forEach(n -> System.out.println(n));
    }
    
}
