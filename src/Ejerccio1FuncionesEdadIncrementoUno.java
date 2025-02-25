import javax.swing.*;

public class Ejerccio1FuncionesEdadIncrementoUno {
    public static void main(String[] args) {
        /**Crea una funcion que incremente en uno la edad que ha insertado el usuario, y dile que en su proximo cumpleaños tendra esa edad**/

        String nombre=JOptionPane.showInputDialog("Hola, como te llamas");
        String edadT=JOptionPane.showInputDialog("Encantad@ "+nombre+" Que edad tienes?" );
        byte edad=Byte.parseByte(edadT);

        saludoEdadMasUno(nombre,edad);
    }
    /**Dentro de estas funciones puedes declarar todo tipo de bloques de instrucciones, como bucles, llamar a otra funcion de manera recursiva, etc... todo lo que haces en el main lo puedes hacer en  la funcion que quieras **/
    public static void saludoEdadMasUno(String nombre,byte edad) {
        if(edad<67) {
            JOptionPane.showMessageDialog(null,"Vamos "+nombre+" que el año que viene cumples "+ ++edad +" esta estas a  "+ (67- (edad)) +" años  para jubilarte");
        } else if (edad==67) {
                JOptionPane.showMessageDialog(null,"Ya te jubilas "+nombre+" que el proximo año te pones en "+ ++edad+"\n Y te vas a ver obras");

        }else {
            JOptionPane.showMessageDialog(null,"Las obras bien no "+nombre+" que te vas a plantar en "+ ++edad);
        }

    }

}
