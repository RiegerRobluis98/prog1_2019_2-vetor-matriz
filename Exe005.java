package lista04;

import java.util.Scanner;

public class Exe005 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int i, vet1[] = new int[5];
        for (i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor");
            vet1[i] = key.nextInt();
            if (vet1[i] % 2 != 0) {
                System.out.println("O numero " + vet1[i] + " na posicao " + (i + 1) + " é impar");
            }
        }
    }
}
