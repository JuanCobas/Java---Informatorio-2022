import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    private String nombre;
    private String apellido;
    private Integer DNI;
    private Integer horasTrabajadas;
    private Integer valorPorHoras;

    public static Set<Ejercicio6> listaEmpleados = new HashSet<Ejercicio6>();
    public static Map<Integer, Integer> listaSueldos = new HashMap<>();

    public Ejercicio6(String nombre, String apellido, Integer DNI, Integer horasTrabajadas, Integer valorPorHoras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHoras = valorPorHoras;
    }

    /* public static void sueldo(HashSet lista) {
        for (Object i : lista) {
            i = (Ejercicio6) i;
            Integer a = ((Ejercicio6) i).getHorasTrabajadas() * ((Ejercicio6) i).getValorPorHoras();
            listaSueldos.put(((Ejercicio6) i).getDNI(), a);

        }
    

    } */
    public static void sueldos(Set<Ejercicio6> lista) {
        for (Ejercicio6 i : lista) {
            Integer a = i.getHorasTrabajadas() * i.getValorPorHoras();
            listaSueldos.put(i.getDNI(), a);

        }
    

    }


    public static void main(String[] args) {
        Ejercicio6 empleado1 = new Ejercicio6("Juan","Cobas", 36592674, 40, 500);
        Ejercicio6 empleado2 = new Ejercicio6("Mariano","Cobas", 37336955, 38, 350);
        Ejercicio6 empleado3 = new Ejercicio6("Pablo","Cobas", 39568425, 75, 5);
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);

        sueldos(listaEmpleados);
        System.out.println(listaSueldos);


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Integer getValorPorHoras() {
        return valorPorHoras;
    }

    public void setValorPorHoras(Integer valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }
}

