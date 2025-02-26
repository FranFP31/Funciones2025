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
            break;
            case 2:conversorTemperatura();
            break;
            case 3:conversorMm();
            break;
            case 4:conversorPeso();
            break;
            case 5:tiempoDeRuta();
            break;
            case 6:conversorDeTiempo();break;
            default:
                System.out.println("🙋🙋Adios Adios 🙋🙋");
        }

    }
    static double conversorMoneda() {
        Scanner sc = new Scanner(System.in);
        double valorMoneda = 0, ingreso=0;
        System.out.println("¿A moneda quiere Convertir?\n [1]Dolar EEUU \n [2]Dolar Canadiense \n [3]Yenes\n [4] Yuanes Sur Koreanos");
        int opcion2=sc.nextInt();
        switch (opcion2) {
            case 1->{
                System.out.print("Ingrese la cantidad->");
                ingreso = sc.nextDouble();
                valorMoneda=(ingreso*1.05);
                System.out.println("Los"+ingreso+" en Dolares Americanos son "+valorMoneda+"$ Americanos");
                return valorMoneda;
            }
            case 2->{
                System.out.print("Ingrese la cantidad->");
                ingreso = sc.nextDouble();
                valorMoneda=(ingreso*1.50);
                System.out.println("Los"+ingreso+" en Dolares Canadienses son "+valorMoneda+"$ Canadienses");
                return valorMoneda;
            }
            case 3->{
                System.out.print("Ingrese la cantidad->");
                ingreso = sc.nextDouble();
                valorMoneda=(ingreso*156.68);
                System.out.println("Los"+ingreso+" en Yenes Japonenes  son "+valorMoneda+"Yenes Japonenes");
                return valorMoneda;
            }
            case 4->{
                System.out.print("Ingrese la cantidad->");
                ingreso = sc.nextDouble();
                valorMoneda=(ingreso*1505.2678);
                System.out.println("Los"+ingreso+" enç" +
                        "Yuanes Sur Koreanos son "+valorMoneda+"Yuanes Sur Koreanos ");
                return valorMoneda;
            }
            default -> {
                System.out.println(" Opcion no valida...Volviendo al Menu Principal");
                menu();
            }
        }
        return valorMoneda;
    }
    static double conversorTemperatura(){
        Scanner sc = new Scanner(System.in);
        double valorTemperatura = 0, ingreso=0;
        System.out.println("Seleccione la opcion a convertir\n [1] Celsisus a Farenhetir \n [2] Farenhetir a Celsius");
        int opcion2=sc.nextInt();
        switch (opcion2) {
            case 1->{
                System.out.print("Ingrese la temperatura en Grados Celsius");
                ingreso = sc.nextDouble();
                valorTemperatura = ingreso*(9/5) + 32;
                System.out.println("Los"+ingreso+" en Grados Farenheit son " +valorTemperatura );
                return valorTemperatura;
            }
            case 2->{
                System.out.print("Ingrese la temperatura en Grados Farenheit");
                ingreso = sc.nextDouble();
                valorTemperatura =(ingreso-32)*(9/5);
                System.out.println("Los"+ingreso+" en Grados Celsius son " +valorTemperatura );
                return valorTemperatura;
            }
            default -> {
                System.out.println(" Opcion no valida...Volviendo al Menu Principal");
                menu();
            }

        }
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
                System.out.println("Los"+ingreso+" Centimetros en Milimetros son " +valorMm );
                return valorMm;
            }
            case 2->{
                System.out.print("Ingrese la cantidad de Metros");
                ingreso = sc.nextDouble();
                valorMm = ingreso*100;
                System.out.println("Los"+ ingreso+" Metros en Milimetros son " +valorMm );
                return valorMm;
            }
            case 3->{
                System.out.print("Ingrese la cantidad de Milimetros");
                ingreso = sc.nextDouble();
                valorMm = ingreso/10;
                System.out.println("Los"+ ingreso+" Milimetros en Centimetros  son " +valorMm );
                return valorMm;
            }
            case 4->{
                System.out.print("Ingrese la cantidad de Milimetros");
                ingreso = sc.nextDouble();
                valorMm = ingreso/100;
                System.out.println("Los"+ ingreso+" Milimetros en Decimetros son " +valorMm );
                return valorMm;
            }
            default -> {
                System.out.println(" Opcion no valida...Volviendo al Menu Principal");
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
                System.out.println("Los "+ ingreso+" Kilos equivalen en " +valorPeso +"Libras");
                return valorPeso;
            }
            case 2->{
                System.out.print("Ingrese la cantidad de Peso en Kilos");
                ingreso = sc.nextDouble();
                valorPeso = ingreso*2.20462;
                System.out.println("Las "+ ingreso+" Libras equivalen en " +valorPeso+" Kilos " );
                return valorPeso;
            }
            default -> {
                System.out.println(" Opcion no valida...Volviendo al Menu Principal");
                menu();
            }
        }
    return valorPeso;
    }
    static double tiempoDeRuta() {
        Scanner sc = new Scanner(System.in);
        double distanciaRuta = 0;
        System.out.print("Elija por donde va a circular:\n [1] AUTOVIA \n [2]CARRETERA \n [3] POBLACION \n [4]Volver al menu ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.printf("Que distancia quiere recorrer?");
                distanciaRuta = sc.nextDouble();
                double tiempoRuta = distanciaRuta / 120;
                System.out.println("La "+ distanciaRuta+" por Autovia, se tardaran" +tiempoRuta );
                return tiempoRuta;
            }
            case 2 -> {
                System.out.printf("Que distancia quiere recorrer?");
                distanciaRuta = sc.nextDouble();
                double tiempoRuta = distanciaRuta / 90;
                System.out.println("La "+ distanciaRuta+" por Carretera Convencional, se tardaran" +tiempoRuta );
                return tiempoRuta;
            }
            case 3 -> {
                System.out.printf("Que distancia quiere recorrer?");
                distanciaRuta = sc.nextDouble();
                double tiempoRuta = distanciaRuta / 30;
                System.out.println("La "+ distanciaRuta+" por Andando, se tardaran" +tiempoRuta );
                return tiempoRuta;
            }default -> {
                System.out.println(" Opcion no valida...Volviendo al Menu Principal");
                menu();
            }
        }
        return tiempoDeRuta();
    }
    static double conversorDeTiempo(){
        Scanner sc=new Scanner(System.in);
        double tiempoConvertido=0;
        System.out.println("Seleccione el tipo de conversion\n [1] Segundo a minutos \n [2] Segundos a Horas \n [3] Horas a Minutos \n [4] Minutos a segundo ");
        int opcion=sc.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println("Indica cuantos segundos quieres pasar a minutos ");
                double entrada = sc.nextDouble();
                tiempoConvertido = entrada / 60;
                System.out.println("Los Segundos " + entrada + " en Minutos son:" + tiempoConvertido);
                return tiempoConvertido;
            }
            case 2 -> {
                System.out.println("Indica cuantos segundos quieres pasar a Horas ");
                double entrada = sc.nextDouble();
                tiempoConvertido = entrada / 3600;
                System.out.println("Los Segundos " + entrada + " en Horas son:" + tiempoConvertido);
                return tiempoConvertido;
            }
            case 3 -> {
                System.out.println("Indica cuantos Horas quieres pasar a Minutos ");
                double entrada = sc.nextDouble();
                tiempoConvertido = entrada * 60;
                System.out.println("Las Horas " + entrada + " en Minutos son:" + tiempoConvertido);
                return tiempoConvertido;
            }
            case 4 -> {
                System.out.println("Indica cuantos Minutos quieres pasar a Segundos ");
                double entrada = sc.nextDouble();
                tiempoConvertido = entrada * 60;
                System.out.println("Los Minutos " + entrada + " en Segundos son:" + tiempoConvertido);
                return tiempoConvertido;
            }
            default ->{
                System.out.println(" Opcion no valida...Volviendo al Menu Principal");
            menu();
            }
        }
        return tiempoConvertido;
        }

    }

