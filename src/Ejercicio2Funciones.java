import java.util.Scanner;

public class Ejercicio2Funciones {
    public static void main(String[] args) {
        //Solicita dos numeros y mediante funcion determina cuál es mayor y cuál es menor
        // luego muestra todos los numeros de forma decreciente que existen entre ellos
        //Ej:
        //numero1:18
        //numero2:9
        /*Funcion que calcula mayor menor
        * calculaMayorMenor(int num1,int num2)
        * int mayor=MAth.max(num1,num2)
        * int mayor=MAth.min(num1,num2)
        * funcion mostrarNumeros(int mayor, int menor)
        * for(i=menor;menor<=mayor;i++)
        * sout de i+"-"
        *
        * */


        /*pedirNum();
        //calcularMayor(pedirNum(int  num1, num2));
        //mostrarMenor(pedirNum(int num1,num2));
       mostrarNumeros(calcularMayor(),mostrarMenor());
       System.out.println(mostrarNumeros();*/


    }
    static void pedirNum(int num1,int num2){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el Primer numero ->: ");
        num1=sc.nextInt();
        System.out.print("Ingrese el Segundo numero ->: ");
        num2=sc.nextInt();
    }
    static void calcularMayor(int num1, int num2) {
        int mayor =Math.max(num1,num2);
        System.out.println(mayor);
    }
    static void mostrarMenor(int num1, int num2) {
        int menor = Math.min(num1,num2);
        System.out.println(menor);
    }
    static void mostrarNumeros(int mayor, int menor) {
        System.out.println(mayor+" y "+menor  );
        for (int i=menor;i<=mayor;i++) {
            System.out.println(i+"-");
        }


    }

}
