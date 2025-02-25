import java.util.Scanner;

/***/


public class ValoresEnFunciones {
    public static void main(String[] args) {
    //solicita un numero y verifica que muliplicandole 10, cual de los dos valores es mayor
        Scanner entrada = new Scanner(System.in);
        System.out.print("Inserta un valor");
        int n1=entrada.nextInt();
        int mayor=mostrarMayor(n1,n1*10);//estoy almacenando eel valor retornado en una variable
        System.out.println("Logicamente, el mayor es: "+mayor);
        numRandom(n1);
        n1=(int)(Math.random()*101);
        int n2=(int)(Math.random()*101);
        System.out.println("el mayor de dos numeros aleatorios es: "+mostrarMayor(n1,n2));
        System.out.println("el mayor es: "+mostrarMayor(numRandom(n1),numRandom2(n2)));
    }
    /**Tiene que recibir dos valores del mismo tipo, no necesariamente tienen que llamarse igual**/
    /**
     * Funcion que devuelve el mayor de dos números
     * @param n1
     * @param n2
     * @return int
     *
     *
     *
     * */
    static int mostrarMayor(int n1,int n2) {
        return Math.max(n1,n2);//devuelve el mayor numero
    }
    static int numRandom(int n1) {
        n1=(int)(Math.random()*101);
        return n1;
    }
    static int numRandom2(int n2) {
        n2=(int)(Math.random()*101);
        return n2;
    }
    //funcion para mostrar por pantalla cualquier texto con salto de linea
    static void mostrar(String texto){
        System.out.println(texto);
    }
    //funcion para mostrar sin salto de linea
    static void  mostrarSinLn(String texto){
        System.out.print(texto);
    }
    //funcion para mostrar el texto en rojo
    static void mostrarErr(String texto){
        System.err.print(texto);
    }
}
