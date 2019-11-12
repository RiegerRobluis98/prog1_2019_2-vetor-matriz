package lista04;

import java.util.Scanner;

public class Exe001 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String vet1[] = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome");
            vet1[i] = key.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("\nNome: " + vet1[i]);
        }
    }

}
