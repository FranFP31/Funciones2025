import java.util.Scanner;

/*Solicitar los siguientes datos al usuario y al final mostrarlo de forma organizada
* Nombre
* Apellidos
* Teléfono
* Direction
* Email
*
* Luego, lo mostraremos en pantalla en una sola línea, concatenando los datos
* setter
* getter->POO
*
* */
public class Ejercicio5Funciones {
    public static void main(String[] args) {
        mostrarDatos();
    }
    static void mostrarDatos() {
        String nombre=leer( "nombre");
        String apellidos=leer("apellidos");
        String edad=leer("edad");
        String telefono=leer("telefono");
        String direccion=leer("direccion");
        String email=leer("email");
        System.out.println("Los datos son:\n Nombre: "+nombre+ "\n Apellidos: "+apellidos+"\n Edad: "+edad+" \n Telefono "+telefono+"\n Email "+email+"\n Direccion "+direccion+"\n Buscado en media Europa y en Checoslovaquia" );
    }
    static String leer(String variable) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su "+variable+":->");
        return sc.nextLine();
    }
}
