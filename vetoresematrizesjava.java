package vetoresematrizes;

import java.util.Scanner;

public class vetoresematrizesjava {

	public static void main(String[] args) {
		
		
		int num,somaPares=0,contImpar=0;
        int vetor[]= new int[6];
        
        Scanner scan = new Scanner(System.in);
        
        for(int x=0; x<6; x++) 
        {
       	 System.out.println("\nEntre com um n�mero: ");
       	 num=scan.nextInt();
       	 vetor[x]=num;
       	 
       	 if(vetor[x] % 2 == 0) 
       	 {
       		 System.out.println("� n�mero � par [ "+vetor[x]+" ] ,");
       	     somaPares+=num;
       	 }
       	 else 
       	 {
       		 System.out.println("� n�mero � impar [ "+vetor[x]+" ] ,");
       	     contImpar++;
       	 }
        }
        System.out.println("\nA Soma dos n�mero pares: "+somaPares);
        System.out.println("\nN�meros impares digitados: "+contImpar);

	}

}
