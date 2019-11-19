package lista04;

import java.util.Scanner;

public class exe009 {

    public static void main(String[] args) {
        int mat1[][] = new int[4][4];
        Scanner key = new Scanner(System.in);
        System.out.println("Informe os valores");
        mat1[0][0] = key.nextInt();
        mat1[0][1] = key.nextInt();
        mat1[0][2] = key.nextInt();
        mat1[0][3] = key.nextInt();

        mat1[1][0] = key.nextInt();
        mat1[1][1] = key.nextInt();
        mat1[1][2] = key.nextInt();
        mat1[1][3] = key.nextInt();

        mat1[2][0] = key.nextInt();
        mat1[2][1] = key.nextInt();
        mat1[2][2] = key.nextInt();
        mat1[2][3] = key.nextInt();

        mat1[3][0] = key.nextInt();
        mat1[3][1] = key.nextInt();
        mat1[3][2] = key.nextInt();
        mat1[3][3] = key.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat1[i][j] + " - ");
            }
        System.out.println();
        }
    }
}
