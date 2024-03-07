import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quant;
        int contV;
        int maior = 0;
        String palavra;

        System.out.print("digite a quantidade de palavras: ");
        quant = entrada.nextInt();

        String[] frase = new String[quant];

        System.out.print("digite a frase: ");
        for (int i = 0; i < quant; i++) {
            frase = entrada.nextLine();
        }

        for (int i = 0; i < quant; i++) {
            contV = 0;
            for (int j = 0; j < frase[i].length(); j++) {
                char letra = frase[i].charAt(j);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contV++;
                }
            }
            if (contV > maior) {
                maior = contV;
                palavra = frase[i];
            }
        }
        System.out.println(palavra);
        System.out.println(maior);
    }
}