import java.util.Scanner;

/*
* Crea una calculadora de:
* Suma
* Resta
* Multiplicación
* Division
* donde la funcion operación recibirá los numeros y la operación a realizar
*
* Crea otra funcion para el menu...
* */
public class Ejercicio6Funciones {
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        System.out.print("**********\n Seleccione la operación: \n [1]Suma \n [2]Resta \n [3]Multiplicación \n [4]Division  \n [5]Salir \n**********");
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Seleccione el operación que desea realizar:\n");
        int opcion = sc.nextInt();
        operacion(opcion);
    }

    static double operacion(int opcion) {
        int num1 = 0, num2 = 0;
        double resultado=0;
        if (opcion>=1 || opcion<=4) {
            switch(opcion) {
                case 1->{
                    Scanner sc = new Scanner(System.in);
                    System.out.print("\n Introduzca el primer numero\n");
                    num1 = sc.nextInt();
                    System.out.print("\n Introduzca el segundo numero\n");
                    num2 = sc.nextInt();
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    return resultado;
                }
                case 2->{
                    Scanner sc = new Scanner(System.in);
                    System.out.print("\n Introduzca el primer numero\n");
                    num1 = sc.nextInt();
                    System.out.print("\n Introduzca el segundo numero\n");
                    num2 = sc.nextInt();
                    resultado = num1 - num2;
                    System.out.println("El resultado es: " + resultado);
                    return resultado;
                }
                case 3->{
                    Scanner sc = new Scanner(System.in);
                    System.out.print("\n Introduzca el primer numero\n");
                    num1 = sc.nextInt();
                    System.out.print("\n Introduzca el segundo numero\n");
                    num2 = sc.nextInt();
                    resultado = num1 * num2;
                    System.out.println("El resultado es: " + resultado);
                    return resultado;
                }
                case 4->{
                    Scanner sc = new Scanner(System.in);
                    System.out.print("\n Introduzca el primer numero\n");
                    num1 = sc.nextInt();
                    System.out.print("\n Introduzca el segundo numero\n");
                    num2 = sc.nextInt();
                    resultado = num1/num2;
                    System.out.println("El resultado es: " + resultado);
                    return resultado;
                }
                default -> System.err.println("ERROR, TE QUEDAS SIN TARTA ");
            }
        }

        return resultado;

    }

}
