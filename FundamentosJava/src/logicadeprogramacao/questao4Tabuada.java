package logicadeprogramacao;

public class questao4Tabuada {

    public static void Tabuada(int numero){
        for (int i=1; i<=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }

    public static void main(String[] args){
        Tabuada(5);
    }
}
