import java.util.Scanner;

/*
* 1. Implementa una funcion convertirMoneda(),que reciba una cantidad de dólares Canadienses o americanos y los convierta a euros
* 2. Implementa una funcion convertirGradosCelsius(), que reciba en Fº y los convierta a Celsius
* 3.Implementa una funcion para pasar a milimetros() donde recibas en metros, centimetros y los conviertas a milimetros
*4.Sabemos que las personas americanas se pesan en libras, Indica el peso en libras y conviertelo en KL
* 5. Indica los KM que faltan para llegar a tu destino, tomando en cuenta el  tipo de via transitas(autovias, carretera convencional) y los kilometros desde el punto de inicio
*6. Indica los segundos, y conviertelos en días, horas, minutos y segundos
*
* */
public class ConversionesEjercicio1 {
    public static void main(String[] args) {
    menu();
    }
    static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Menu******\n Seleccione lo que quiere hacer \n" +
                " [1] Conversor de Moneda \n [2] Pasar a Grados Celsius \n [3] Pasar a milimetros\n [4] Pasar de Libras a kilos \n [5] Calcular el tiempo de viaje \n [6] Pasar los segundos \n [7] Hoy, no gracias");
        int opcion = sc.nextInt();
        if (opcion >= 1&&opcion <= 6) {}
        switch (opcion) {
            case 1:conversorMoneda();
            case 2:conversorTemperatura();
            case 3:conversorMm();
            case 4:conversorPeso();
            case 5:tiempoDeRuta();
            //case 6:conversorDeTiempo();
            default:
                System.out.println("Opcion no valida");
        }

    }
    static double conversorMoneda() {
        Scanner sc = new Scanner(System.in);
        double valorMoneda = 0, ingreso=0;
        System.out.println("¿A moneda quiere Convertir?\n [1]Dolar EEUU \n [2]Dolar Canadiense \n [3]Yenes\n [4] Volver al menu");
        int opcion2=sc.nextInt();
        switch (opcion2) {
            case 1->{
                System.out.print("Ingrese la cantidad->");
                ingreso = sc.nextDouble();
                valorMoneda=(ingreso*1.05);
                return valorMoneda;
            }
            case 2->{
                System.out.print("Ingrese la cantidad->");
                ingreso = sc.nextDouble();
                valorMoneda=(ingreso*1.50);
                return valorMoneda;
            }
            case 3->{
                System.out.print("Ingrese la cantidad->");
                ingreso = sc.nextDouble();
                valorMoneda=(ingreso*156.68);
                return valorMoneda;
            }
            case 4->{
                System.out.print("Ingrese la cantidad->");
                ingreso = sc.nextDouble();
                valorMoneda=(ingreso*1505.2678);
                return valorMoneda;
            }
            default -> {
                System.out.println("Volviendo a menu");
                menu();
            }
        }
        return valorMoneda;
    }
    static double conversorTemperatura(){
        Scanner sc = new Scanner(System.in);
        double valorTemperatura = 0, ingreso=0;
        System.out.print("Ingrese la temperatura en Grados Celsius");
        ingreso = sc.nextDouble();
        valorTemperatura = ingreso*(9/5) + 32;
        return valorTemperatura;
    }
    static double conversorMm(){
        Scanner sc = new Scanner(System.in);
        double valorMm = 0, ingreso=0;
        System.out.print("Seleccione a que escala quiere pasar\n [1]Centimetros a MM" +
                "\n [2]Metros  a MM \n [3] MM a Centimetros \n [4] MM a Metros \n [5] Volver al menu");
        int opcion3=sc.nextInt();
        switch (opcion3) {
            case 1->{
                System.out.print("Ingrese la cantidad de Centimetros");
                ingreso = sc.nextDouble();
                valorMm = ingreso*10;
                return valorMm;
            }
            case 2->{
                System.out.print("Ingrese la cantidad de Metros");
                ingreso = sc.nextDouble();
                valorMm = ingreso*100;
                return valorMm;
            }
            case 3->{
                System.out.print("Ingrese la cantidad de Milimetros");
                ingreso = sc.nextDouble();
                valorMm = ingreso/10;
                return valorMm;
            }
            case 4->{
                System.out.print("Ingrese la cantidad de Milimetros");
                ingreso = sc.nextDouble();
                valorMm = ingreso/100;
                return valorMm;
            }
            default -> {
                System.out.println("Volviendo a menu");
                menu();
            }

        }
        return ingreso;
    }
    static double conversorPeso(){
        Scanner sc = new Scanner(System.in);
        double valorPeso = 0, ingreso=0;
        System.out.println("¿Que peso quiere convertir?\n [1]Libras a Kilos\n [2]Kilos a libras\n [3] Volver al menu Principal");
        int opcion4=sc.nextInt();
        switch (opcion4) {
            case 1->{
                System.out.print("Ingrese la cantidad de Peso en Libras");
                ingreso = sc.nextDouble();
                valorPeso = ingreso*0.453592;
                return valorPeso;
            }
            case 2->{
                System.out.print("Ingrese la cantidad de Peso en Kilos");
                ingreso = sc.nextDouble();
                valorPeso = ingreso*2.20462;
                return valorPeso;
            }
            default -> {
                System.out.println("Volviendo a menu");
                menu();
            }
        }
    return valorPeso;
    }
    static double tiempoDeRuta(){
        double distanciaRuta = 0;
    }
}
