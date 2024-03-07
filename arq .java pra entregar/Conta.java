import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int produto;
        int quantidade;
        double valorB = 0;
        double valorP = 0;

        System.out.print("digite o codigo do produto: ");
        produto = entrada.nextInt();

        System.out.print("digite a quantidade: ");
        quantidade = entrada.nextInt();

        if ((produto >= 1) && (produto <= 10)) {
            valorB = quantidade * 10;

            if (valorB < 250) {
                valorP = valorB - (valorB * 0.05);
            } else if ((valorB >= 250) && (valorB <= 500)) {
                valorP = valorB - (valorB * 0.10);
            } else {
                valorP = valorB - (valorB * 0.15);
            }
        } else if ((produto >= 11) && (produto <= 20)) {
            valorB = quantidade * 15;

            if (valorB < 250) {
                valorP = valorB - (valorB * 0.05);
            } else if ((valorB >= 250) && (valorB <= 500)) {
                valorP = valorB - (valorB * 0.10);
            } else {
                valorP = valorB - (valorB * 0.15);
            }
        } else if ((produto >= 21) && (produto <= 30)) {
            valorB = quantidade * 20;

            if (valorB < 250) {
                valorP = valorB - (valorB * 0.05);
            } else if ((valorB >= 250) && (valorB <= 500)) {
                valorP = valorB - (valorB * 0.10);
            } else {
                valorP = valorB - (valorB * 0.15);
            }

        } else if ((produto >= 31) && (produto <= 40)) {
            valorB = quantidade * 30;

            if (valorB < 250) {
                valorP = valorB - (valorB * 0.05);
            } else if ((valorB >= 250) && (valorB <= 500)) {
                valorP = valorB - (valorB * 0.10);
            } else {
                valorP = valorB - (valorB * 0.15);
            }

        } else {
            System.out.println("Produto nao existe!");
        }

        System.out.println(valorB / quantidade);
        System.out.println(valorB);
        System.out.println((valorB - valorP));
        System.out.println(valorP);

    }
}