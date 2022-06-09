import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>(Arrays.asList("Juan", "Mariano", "Gervacio", "Jorgelina",
        "Monserrat", "Emiliano", "Enzo","Pablo", "Malvina", "Gisela", "Maximiliano", "Agustina"));
        List<String> curso1 = estudiantes.subList(0, 4);
        List<String> curso2 = estudiantes.subList(4, 8);
        List<String> curso3 = estudiantes.subList(8, 12);
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        
    }
}
