import java.util.ArrayList;
import java.util.Scanner;

// Clase principal
public class TiendaRopa {

    static Scanner entrada = new Scanner(System.in);

    static ArrayList<Visitante> visitantes = new ArrayList<>();
    static ArrayList<Trabajador> trabajadores = new ArrayList<>();
    static ArrayList<Proveedor> proveedores = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== TIENDA DE ROPA =====");
            System.out.println("1. Registrar visitante");
            System.out.println("2. Registrar trabajador");
            System.out.println("3. Registrar proveedor");
            System.out.println("4. Mostrar visitantes");
            System.out.println("5. Mostrar trabajadores");
            System.out.println("6. Mostrar proveedores");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    registrarVisitante();
                    break;

                case 2:
                    registrarTrabajador();
                    break;

                case 3:
                    registrarProveedor();
                    break;

                case 4:
                    mostrarVisitantes();
                    break;

                case 5:
                    mostrarTrabajadores();
                    break;

                case 6:
                    mostrarProveedores();
                    break;

                case 7:
                    System.out.println("Gracias por utilizar el sistema.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 7);
    }

    // Registro de visitantes
    static void registrarVisitante() {

        System.out.print("Nombre del visitante: ");
        String nombre = entrada.nextLine();

        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();

        visitantes.add(new Visitante(nombre, edad));

        System.out.println("Visitante registrado correctamente.");
    }

    // Registro de trabajadores
    static void registrarTrabajador() {

        System.out.print("Nombre del trabajador: ");
        String nombre = entrada.nextLine();

        System.out.print("Puesto: ");
        String puesto = entrada.nextLine();

        trabajadores.add(new Trabajador(nombre, puesto));

        System.out.println("Trabajador registrado correctamente.");
    }

    // Registro de proveedores
    static void registrarProveedor() {

        System.out.print("Nombre del proveedor: ");
        String nombre = entrada.nextLine();

        System.out.print("Producto que suministra: ");
        String producto = entrada.nextLine();

        proveedores.add(new Proveedor(nombre, producto));

        System.out.println("Proveedor registrado correctamente.");
    }

    // Mostrar visitantes
    static void mostrarVisitantes() {

        System.out.println("\n--- VISITANTES ---");

        for (Visitante v : visitantes) {
            System.out.println(v);
        }
    }

    // Mostrar trabajadores
    static void mostrarTrabajadores() {

        System.out.println("\n--- TRABAJADORES ---");

        for (Trabajador t : trabajadores) {
            System.out.println(t);
        }
    }

    // Mostrar proveedores
    static void mostrarProveedores() {

        System.out.println("\n--- PROVEEDORES ---");

        for (Proveedor p : proveedores) {
            System.out.println(p);
        }
    }
}

// Clase visitante
class Visitante {

    private static int contador = 1;

    private String id;
    private String nombre;
    private int edad;

    public Visitante(String nombre, int edad) {
        this.id = String.format("VIS-%03d", contador++);
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "ID: " + id +
               " | Nombre: " + nombre +
               " | Edad: " + edad;
    }
}

// Clase trabajador
class Trabajador {

    private static int contador = 1;

    private String id;
    private String nombre;
    private String puesto;

    public Trabajador(String nombre, String puesto) {
        this.id = String.format("TRA-%03d", contador++);
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public String toString() {
        return "ID: " + id +
               " | Nombre: " + nombre +
               " | Puesto: " + puesto;
    }
}

// Clase proveedor
class Proveedor {

    private static int contador = 1;

    private String id;
    private String nombre;
    private String producto;

    public Proveedor(String nombre, String producto) {
        this.id = String.format("PRO-%03d", contador++);
        this.nombre = nombre;
        this.producto = producto;
    }

    public String toString() {
        return "ID: " + id +
               " | Nombre: " + nombre +
               " | Producto: " + producto;
    }
}
