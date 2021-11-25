
package aula16;

import java.util.Random;
public class exemplo04Matriz {
    
    public static void main(String[] args) {
        /*Crie e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
        Mostre o maior valor da matriz e qual sua posição (linha, coluna)*/
        Random nRandom = new Random();
        int[][] matrizM = new int[4][4];
        
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                matrizM[i][j]= nRandom.nextInt(10);
            }
        }
        
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                System.out.println(matrizM[i][j]);
            }
        }
        
        int maior = 0;
        int linha = 0;
        int coluna = 0;
        
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                if(matrizM[i][j]> maior){
                    maior = matrizM[i][j];
                    linha = i;
                    coluna = j;
                };
            }
        }
        
        System.out.println("Maior valor é: "+ maior);
        System.out.println("Linha: "+ linha);
        System.out.println("Coluna: "+ coluna);
    }
 
}
