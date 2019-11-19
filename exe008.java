package lista04;

import java.util.Scanner;

public class Lista04 {

    public static void main(String[] args) {
        int mat1[][] = new int[2][3];
        Scanner key = new Scanner(System.in);
        mat1[0][0] = 9;
        mat1[0][1] = 7;
        mat1[0][2] = 6;

        mat1[1][0] = 4;
        mat1[1][1] = 2;
        mat1[1][2] = 1;
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(mat1[i][j] + " ");
            }
        System.out.println();
        }
    }
}
