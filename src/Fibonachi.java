import java.util.Scanner;

/*Diseña una funcion recursiva que calcule el enesimo término de la serie de Fibonacci.
* En esta serie el nenesimo valor se calcula sumando  los dos valores anteriores de la serie es decir:
* fibonacci(n)=fibonacci(n-1)+fibonacci(n-2)*
* casos base:
fibonacci(0)=1/
fibonacci(1)=1
/
 */
public class Fibonachi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("********* Fibonachi: Fibonacio *********");
        System.out.println("Dime un numero: (recomentable menor a 40)");
        int n = sc.nextInt();
        int res=fibo(n);
        System.out.print("("+n+") = "+res);

        fibo(n);
    }
    public static int fibo(int n) {
        int r;
        if (n == 0 || n == 1) {
            r=1;
        }else{
            r=fibo(n-1)+fibo(n-2);
        }
        return (r);
    }
}
