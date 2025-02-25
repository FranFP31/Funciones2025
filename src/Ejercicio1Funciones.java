import javax.swing.*;

/*
 Diseña una funcion que solicite un número y muestre las veces que se ha indicado, la palabra "ECO"
 Ejemplo:
 el usuario indica el numero 5
 ECO; ECO; ECO;ECO;ECO saldra  veces
 */
public class Ejercicio1Funciones {
    public static void main(String[] args) {
        String  n = JOptionPane.showInputDialog("Ingrese un numero: ");
        int n1 = Integer.parseInt(n);
        ecoFunction(n1);


    }

    /**!!!Aqui termina el MAIN¡¡¡¡**/

/**ecoFunction**/

    static void ecoFunction(int n) {//la funcion del ECO
        for (int i = 1; i <= n; i++) {
            JOptionPane.showMessageDialog(null, "ECO");
        }
    }
    /***
     * Esta funcion devuelve un valor de tipo String...return valor/variable
     * */



}
