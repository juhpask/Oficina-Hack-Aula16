package aula16;

import java.util.Scanner;
public class exer03 {
    public static void main(String[] args) {
        //Crie um vetor A com 5 elementos inteiros. Após criado o vetor A faça B[i] = A[i] ^ 2.
        
        Scanner ler = new Scanner(System.in);

        double[] vetorA = new double[5];
        double[] vetorB = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
           System.out.println("Indique o valor da posição " + i +": ");
           vetorA[i] = ler.nextDouble();

           vetorB[i] = Math.pow(vetorA[i], 2);
           //vetorB[i] = (vetorA[i] * vetorA[i]);
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
           System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++) {
           System.out.print(vetorB[i] + " ");
        }
    }
}
