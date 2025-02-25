/*Solicita al usuario una letra, e indica si es vocal o no, mediante un booleano*/
import java.util.Scanner;

public class Ejercicio3_Funciones {
    public static void main(String[] args) {
        mostrarResultados();

    }
    /**
     * Funcion que solicita una letra y la devuelve a quien invoque la funcion
     * @return
     * */
    static char solicitarVocal(){
    char letra;
        System.out.print("Indique una letra -> ");
        letra=new Scanner(System.in).next().charAt(0);//Lo que hace aquí es cortar un String a la primera letra ingresada. Ejem: maestra, solo leera la 'm'
    return letra;
    }
    /**
     * Funcion que recibe una letra e indica con un booleano si es una vocal o no
     * @param letra
     * @return true
     *
     *
     * */
    static boolean comprobarVocal(char letra){
        if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U'){
            return true;
        }else{
            return false;
        }
    }
    static void mostrarResultados(){
        if  (comprobarVocal(solicitarVocal())) {
            System.out.println("La letra escrita es vocal");
        }else{
            System.out.println("La letra escrita no es vocal");
        }
    }
}





/**Ejemplos de salidas de funciones */
/*Primera salida propuesta solo dice true/false*/
/**System.out.println("La letra escrita es vocal "+comprobarVocal(solicitarVocal()));**/
/*Segunda salida propuesta muestra mensaje validando las funciones **/
/**if (comprobarVocal(solicitarVocal())) {
 System.out.println("La letra escrita es vocal");
 }else{
 System.out.println("La letra escrita no es vocal");
 }
 **/
 /*Tercera salida propuesta-> llamar y recibir parametros y guardarlos en variables*/
/// char miltra=solicitarVocal();
///boolean resultado=comprobarVocal(miltra);
///if(resultado){
///System.out.println("La letra escrita es vocal");
///}else{
///System.out.println("La letra escrita no es vocal");
///}
