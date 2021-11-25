package aula16;

import java.util.Scanner;
public class exemplo03Array {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[5];
        
        for(int i = 0; i<vetorA.length; i++){
            System.out.println("insira um valor: ");
            vetorA[i] = scan.nextDouble();
        }
        for(int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
    }
}
