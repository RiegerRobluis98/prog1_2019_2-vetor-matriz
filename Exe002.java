
package lista04;

import java.util.Scanner;

public class Exe002 {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        int vet1[] = new int [10];
     for (int i = 0; i < 10; i++){
         System.out.println("Digite o "+ (i+1) + "º valor");
         vet1[i] = key.nextInt();
     } 
     for (int i = 0; i < 10; i++){
         System.out.println("\nValor: " + (i+1) + " = " + vet1[i]);
     }
    }
}
