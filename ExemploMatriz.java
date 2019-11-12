public static void main(String[] args) {
    int[][] matriz = new int[5][5];
    Scanner leitor = new Scanner(System.in);
    
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print("Digite o elemento da linha " + (i + 1) + " da coluna " + (j + 1) + ": ");
            matriz[i][j] = leitor.nextInt();
            System.out.println("");
        }
    }
    
    System.out.println("Agora, apresentando a matriz\n\n");
    
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(matriz[i][j] + "   ");
        }
        System.out.println("");
    }
    
    System.out.println("Fim");
    
    
}
