
package aula16;

import java.util.Scanner;
public class exer02 {
    public static void main(String[] args) {
        //Crie um vetor A com 5 elementos inteiros. Após criado o vetor A faça B[i] = A[i] / 2.
        
        Scanner ler = new Scanner(System.in);

        int[] vetorA = new int[5];
        double[] vetorB = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
           System.out.println("Indique o valor da posição " + i +": ");
           vetorA[i] = ler.nextInt();

           vetorB[i] = (vetorA[i]) /2.0;
        }
        
        System.out.print("Array A = ");
        for (int i=0; i<vetorA.length; i++) {
           System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Array1 B = ");
        for (int i=0; i<vetorB.length; i++) {
           System.out.print(vetorB[i] + " ");
        }
    }
}
