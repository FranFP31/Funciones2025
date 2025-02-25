import javax.swing.*;

/*
*
* */
public class Ejemplo1FuncionesEco {
    public static void main(String[] args) {

    /**saludo();//aquí estoy llamando a la funcion saludo para usarla
    //esta es una funcion simple
        //paso de parametros-> Se incluye un valor mediante una variable y se le apsa a la funcion en el momento de la invocacion
    //aqui llamo la funcion y entre el parentesis le digo la variable que le voy a pasar
        //incluyo la variable o el valor directamente entre los parentesis
        otroSaludo("Fran");//ya le estoy añadiendo el valor
**/
        String nombre1=JOptionPane.showInputDialog("nombre");//aquí estoy usando la variable
        String edadT=JOptionPane.showInputDialog("edad");
        byte edad=Byte.parseByte(edadT);
//los parametros tiene ir en el orden que indica la funcion
    otroSaludoConEdad(nombre1,edad);

    }
/***¡Aquí termina el main!!! Las funciones van más abajo**/


/**
    //declaro la funcion
    static  void saludo(){//saludo()es el identificador o nombre de la funcion
        JOptionPane.showMessageDialog(null, "Hola,que tal?");

    }
 **/
    //en esta funcion va a recibir un valor tipo string con el nombre
   /** static void otroSaludo(String nombre){//en los parentesis definimos el parametro que le vamos a pasar en el momento que se invoque
        //si las variables se definen dentro de una funcion solo funcionan en esa funcion
        JOptionPane.showMessageDialog(null, "Hola que tal?"+nombre);
    }**/
    //en esta funcion va a recibir dos parametros el nombre y la edad
    static void otroSaludoConEdad(String nombre1, int edad){
JOptionPane.showMessageDialog(null,"Hola que tal?, "+nombre1+". Te ves bien a tus "+edad+" años. ");
    }


}
