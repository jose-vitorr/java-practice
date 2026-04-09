package logicadeprogramacao;

public class questao5Somatorio {

    public static int somatorio(int numero) {

        int somaTotal = 0;
        int i = 1;

        while (i <= numero){
            somaTotal+= i;
            i++;
        }

        return somaTotal;
    }

    public static  void  main(String[] args){
        System.out.println("O somatório é " + somatorio(10));
    }
}