import java.util.Scanner;

public class Ejercicio8 {
    private static int cantidadPersonas;
    private String nombre;
    private int edad;
    private String direccion;
    private String ciudad;
    
    ///pide el ingreso de datos por consola para usarlos en el metodo constructor 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String n = scan.nextLine();
        System.out.print("Ingrese su edad: ");
        String e = scan.nextLine();
        int ed = Integer.parseInt(e);
        System.out.print("Ingrese su direccion: ");
        String d = scan.nextLine();
        System.out.print("Ingrese su ciudad: ");
        String c = scan.nextLine();
        Ejercicio8 per = new Ejercicio8 (n, ed, d, c);
        System.out.println(String.format("%s - %s - %d - %s", per.getCiudad(), per.getDireccion(), per.getEdad(), per.getNombre()));
        System.out.println(Ejercicio8.cantidadPersonas);
        scan.close();
        
    } ///metodo constructor
    Ejercicio8 (String newNombre, int newEdad, String newDireccion, String newCiudad) {
        nombre = newNombre;
        edad = newEdad;
        direccion = newDireccion;
        ciudad = newCiudad;
        cantidadPersonas++;
        
    }
    

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


}
