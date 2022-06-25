import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio4 {

    public static int factorial(int x) {
        if (x == 0){
            return 1;
        } else {
            return x * factorial(x-1);
        }
        
        
    }
    public static void main(String[] args) {
                
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,4,4,4));

        

        Set<Integer> numerosFactorialNoRep = numeros.stream()
        .distinct()
        .map((n) -> factorial(n))
        .collect(Collectors.toSet());

        numerosFactorialNoRep.stream().forEach(n -> System.out.println(n));

    }
    
}
