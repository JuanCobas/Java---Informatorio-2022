import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
        List<String> listaPaises = new ArrayList<>();
        listaPaises.add("El Bolson");
        listaPaises.add("Tandil");
        listaPaises.add("Esquel");
        ranking(listaPaises);
    
    }

    public static void ranking(List<String> list) {
        for (int i = 0; i<list.size();i++) {
            System.out.println(String.format("#%d - %s", i+1, list.get(i)));

        }
        
    }
        
    

    
    
    
}
