package lista04;

import java.util.Scanner;

public class Exe003 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int vet1[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor");
            vet1[i] = key.nextInt();
            while (vet1[i] < 0 || vet1[i] > 10) {
                System.out.println("Valor Incompativel, Digite o " + (i + 1) + "º valor");
                vet1[i] = key.nextInt();
            }
        }

    }
}
