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
        //dependiendo de si es String o byte podemos llamar a una funcion o otra
        String nombre=leer( "nombre");
        String apellidos=leer("apellidos");
        byte edad=leerNumero("edad");
        int dni=leerNumero();//ira a la funcion que no espera ningun pase de parametros
        String telefono=leer("telefono");
        String direccion=leer("direccion");
        String email=leer("email");
        int nota=leer("nota","🐈‍");
        System.out.println("Los datos son    :\n Nombre: "+nombre+ "\n Apellidos: "+apellidos+"\n Dni: "+dni+"\n Edad: "+edad+" \n Telefono "+telefono+"\n Email "+email+"\n Direccion "+direccion+"\n Nota: "+nota +" \n**************" );
    }
    static String leer(String variable) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su "+variable+":->");
        return sc.nextLine();
    }
    static byte leerNumero(String variable) {//siempre va a ser <=127 porque es tipo byte
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su "+variable+":->");
        return sc.nextByte();//devuelve un numero
    }
    static int leerNumero() {
        //se puede dar el caso de llamar igual una funcion pero segun, el paso de parametros ira al que corresponda
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su Numero (solo el numero)de DNI:->");
        return sc.nextInt();
    }
    //pensar otro ejemplo de sobrecarga de funciones
    static int leer(String variable,String signo){
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su "+variable+" "+signo+":->");
        return sc.nextInt();
    }

}
