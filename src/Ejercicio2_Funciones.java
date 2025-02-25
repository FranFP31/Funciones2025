import java.util.Scanner;

/*
 * Realiza una funcion que calcule y muestre el área y volumen de un cilindro, según se especifique en un menu, 1 para el área y 2 para el volumen.
 * Los datos necesarios son el radio de la base y la altura
 * área=2*PI*radio(altura+radio)
 * volumen=PI*radiopow2*altura
 * */
public class Ejercicio2_Funciones {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique que quiere calcular->\n 1->Area\n**************\n 2->Volumen\n");
        int opcion = sc.nextInt();
        System.out.println("Ingrese el radio");
        double radio = sc.nextInt();
        System.out.println("Ingrese la altura");
        double altura = sc.nextDouble();
        switch (opcion){
            //llamo a la funcion que calcula el area
            case 1->{calcArea(radio, altura);}
            //llamo a la funcion que calcula el volumen
            case 2->{calcVol(radio,altura);}
            //es para cuando algo esta mal
            default->System.err.println("Algo a salido mal");
        }
    }
    static void calcArea(double radio, double altura) {
        double area = Math.PI*radio*(radio+altura);
        System.out.println("El area es: " + area);

    }
    static void calcVol(double radio, double altura) {
        double volumen =Math.PI*Math.pow(radio,2)*altura;
        System.out.println("El volumen es: " + volumen);
    }


}

