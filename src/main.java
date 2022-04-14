import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int i, j, cont, linhas, colunas;
        System.out.println("Digite a quantidade de linhas: ");
        linhas = tec.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        colunas = tec.nextInt();

        int mMatriz[][] = new int[linhas][colunas];

        for(i=0, cont=1; i<linhas; i++){
            for(j=0; j<colunas; j++){
                mMatriz[i][j] = cont++;
            }
        }

        for(i = 0; i<linhas; i++){
            for(j=0; j<colunas;j++){
                System.out.print(mMatriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
