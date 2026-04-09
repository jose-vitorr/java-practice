package logicadeprogramacao;

public class questao3ParImpar {

    public static void parouImpar(int numero){

        //fail fast
        if(numero == 2){
            System.out.println("O número 2 é par e ímpar");
        } else if(numero % 2 == 0){
            System.out.println("O número é par");
        } else if(numero % 2 != 1){
            System.out.println("O número é ímpar");
        }
    }

    public static void main(String[] args) {

        parouImpar(3);
    }
}
