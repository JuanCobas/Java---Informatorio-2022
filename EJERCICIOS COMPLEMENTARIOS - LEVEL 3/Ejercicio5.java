import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {

  
    
    
}

class Alumno {
    String apellido;
    String nombre;
    LocalDate fechaDeNacimiento;

    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Cobas", "Juan", LocalDate.parse("1991-10-03")));
        listaAlumnos.add(new Alumno("Cobas", "Mariano", LocalDate.parse("1993-06-21")));
        listaAlumnos.add(new Alumno("Cobas", "Malvina", LocalDate.parse("1996-05-10")));
        listaAlumnos.add(new Alumno("Cobas", "Pablo", LocalDate.parse("1998-08-20")));
        listaAlumnos.add(new Alumno("Belloli", "Enzo", LocalDate.parse("1992-10-28")));

        Map<String, Integer> alumnos = listaAlumnos.stream()
        .collect(Collectors.toMap(n -> n.getApellido() + ' ' + n.getNombre(), n -> Period.between(n.getFechaDeNacimiento(), LocalDate.now()).getYears()));

        alumnos.entrySet().stream()
        .forEach(n -> System.out.println("{\"" + n.getKey() + "\"= " + n.getValue() + "}"));
    }


    public Alumno(String apellido, String nombre, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }


    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }



}
