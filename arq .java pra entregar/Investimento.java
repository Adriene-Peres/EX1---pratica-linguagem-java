import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorJ;
        int valorP;
        int mes = 0;

        System.out.print("digite o valor investido por Joao: ");
        valorJ = entrada.nextInt();

        System.out.print("digite o valor investido por Pedro: ");
        valorP = entrada.nextInt();

        while (valorJ < valorP) {
            mes++;
            valorJ = valorJ + ((int) (valorJ * 0.025));
            valorP = valorP + ((int) (valorP * 0.005));
        }

        System.out.print(mes);

    }
}