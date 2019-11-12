package lista04;

import java.util.Scanner;

public class Exe006 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int soma = 0, vet1[] = new int[5] ; 
        for (int i = 0; i < 5; i++) {
             System.out.println("Digite o " + (i + 1) + "º valor");
            vet1[i] = key.nextInt();
            soma = soma + vet1[i]; 
        }

        System.out.println("Total: " + soma); 
    }
}
