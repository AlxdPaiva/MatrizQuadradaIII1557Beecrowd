/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizquadradaiii1557beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class MatrizQuadradaIII1557Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;
            
            int[][] matriz = new int[N][N];
            
            // Preenchendo a matriz
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matriz[i][j] = (int) Math.pow(2, i + j);
                }
            }
            
            // Encontrar o maior número para a formatação correta
            int maxNumber = matriz[N - 1][N - 1];
            int fieldWidth = String.valueOf(maxNumber).length();
            
            // Imprimir a matriz formatada
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.printf("%" + fieldWidth + "d", matriz[i][j]);
                    if (j < N - 1) {
                        System.out.print(" "); // Espaço entre os números
                    }
                }
                System.out.println();
            }
            System.out.println(); // Linha em branco entre matrizes
        }
    }
    
}
