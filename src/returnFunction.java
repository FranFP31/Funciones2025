
import java.util.Scanner;

/*La cláusula return dentro de una function devuelve un valor que declaro en el prototipo de la function
 * Ej:
 * Esta function indica que la function devuelve un valor de tipo int
 * static Int pedirEdad()}{
 *
 * }**/

public class returnFunction{
    /***llamo a esta funcion que pide la edad al usuario, la devuelvo con el return edad, y la paso a la funcion mostrar edad, que lo unico que hace es un sout con la edad que he almacenado
     * Lo que quiere decir es que la primera funcion "pedirEdad()" que está dentro del parentesis es la que se ejecuta primero y luego se ejecuta "mostrarEdad()", porque primero se ejecuta el parentesis y luego lo de fuera**/
    public static void main(String[] args) {
        mostrarNombre(pedirNombre());
        mostrarEdad(pedirEdad());
    }

    /**Pide la edad**/
    static int pedirEdad(){
        boolean correcto=false;
        int edad;
        do{
            System.out.println("Indica la edad");
            edad=new Scanner(System.in).nextInt();
            if(edad>=0&&edad<=120) {
                correcto = true;
            }
        }while (!correcto);
        return edad;

    }
    /**mostrar la edad**/
    static void mostrarEdad(int edad){
        System.out.println("La edad es: "+edad);
    }
    /**Crear la funcion Pedir Nombre, y luego crear la funcion mostrar nombre**/
    static String pedirNombre(){
        String nombre;
        boolean correcto=false;
        do{
            System.out.println("Ingrese el nombre");
            nombre=new Scanner(System.in).next();
            if(!nombre.equals(" ")) {//sí tiene algún character y no está vació
                correcto=true;
            }
        }while (!correcto);
        return nombre;
    }
    /**Recojo los datos almacenados en la variable nombre y los muestro por pantalla**/
    static void mostrarNombre(String nombre){
        System.out.println("El nombre es: "+nombre);
    }

}
