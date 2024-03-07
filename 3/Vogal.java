import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd;
        int tam = 0;
        int contVogais;
        String frase;
        String maiorPalavra = "";
        String[] palavras;
        String[] vogais = { "a", "e", "i", "o", "u" };

        // entrada de dados
        qtd = entrada.nextInt();
        palavras = new String[qtd];
        palavras = frase.split(" "); // separa a frase de acordo com os espaços em branco

        // obtendo a palavra com mais vogais
        for (int i = 0; i < qtd; i++) {
            contVogais = 0;
            for (int j = 0; j < palavras[i].length(); k++) {
                int k = 0;
                while (k < vogais.length && !palavras[i].substring(j, j + 1).equals(vogais[k]))
                    k++;
                if (k != vogais.length)
                    numVogais++;
            }
            if (numVogais > tam) {
                tam = numVogais;
                maiorPalavra = palavras[i];
            }
        }

    }
}