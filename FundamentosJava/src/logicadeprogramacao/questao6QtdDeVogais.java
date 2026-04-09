package logicadeprogramacao;

public class questao6QtdDeVogais {

    public static int contarVogais(String palavra) {

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char vogais = palavra.charAt(i);

            if (vogais == 'a' || vogais == 'e' || vogais == 'i' ||
                    vogais == 'o' || vogais == 'u' ||
                    vogais == 'A' || vogais == 'E' || vogais == 'I' ||
                    vogais == 'O' || vogais == 'U') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println("A quantidade de vogais é " + contarVogais("asdfghjklpouytrewqzxcvb"));
    }
}
