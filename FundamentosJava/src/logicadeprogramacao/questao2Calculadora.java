package logicadeprogramacao;

public class questao2Calculadora {


    public static int somar(int a, int b){
         return a + b;
    }

    public static int subtrair(int a, int b){
        return  a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static int dividir(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("O resultado da soma é " + somar(a, b));
        System.out.println("O resultado da subtração é " + subtrair(a, b));
        System.out.println("O resultado da multiplicação é " + multiplicar(a, b));
        System.out.println("O resultado da divisão é " + dividir(a, b));

    }
}
