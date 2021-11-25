package aula16;

public class exemplo02Array {
    public static void main(String[] args) {
       
        double[] vetorA = new double[5];
        vetorA[0]= 5.3333;
        vetorA[1]= 15;
        vetorA[2]= 51;
        vetorA[3]= 511;
        vetorA[4]= 115;
        
        for(int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
    }
}
