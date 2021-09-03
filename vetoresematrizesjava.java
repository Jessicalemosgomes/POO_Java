package vetoresematrizes;

import java.util.Scanner;

public class vetoresematrizesjava {

	public static void main(String[] args) {
		
		
		int num,somaPares=0,contImpar=0;
        int vetor[]= new int[6];
        
        Scanner scan = new Scanner(System.in);
        
        for(int x=0; x<6; x++) 
        {
       	 System.out.println("\nEntre com um número: ");
       	 num=scan.nextInt();
       	 vetor[x]=num;
       	 
       	 if(vetor[x] % 2 == 0) 
       	 {
       		 System.out.println("É número é par [ "+vetor[x]+" ] ,");
       	     somaPares+=num;
       	 }
       	 else 
       	 {
       		 System.out.println("É número é impar [ "+vetor[x]+" ] ,");
       	     contImpar++;
       	 }
        }
        System.out.println("\nA Soma dos número pares: "+somaPares);
        System.out.println("\nNúmeros impares digitados: "+contImpar);

	}

}
