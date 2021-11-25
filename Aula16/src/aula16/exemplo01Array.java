package aula16;


public class exemplo01Array {
    public static void main(String[] args) {
        /* Crie um array que guarde 5 elemetos do tipo double.
        Insira e mostre valores aos elementos deste array. */
        
        double[] vetorA = new double[10];
        vetorA[0]= 5.3333;
        vetorA[1]= 15;
        vetorA[2]= 51;
        vetorA[3]= 511;
        vetorA[4]= 115;
        
        System.out.println(vetorA);
        System.out.println(vetorA[3]);
        System.out.println(vetorA.length);
    }
}
