package vetoresematrizes;

import java.util.Scanner;

public class vetoresematrizes03 {

	public static void main(String[] args) {
		
		int cont=0, num;
        int matriz[][] = new int[3][3];
        
        Scanner scan = new Scanner(System.in);
        
        for(int linha=0;linha <3;linha++) 
        {
        	for(int coluna =0;coluna <3;coluna++) 
        	{
        		System.out.println(" \nEntre com um n�mero: ");
        		num=scan.nextInt();
        		matriz[linha][coluna]=num;
        		
        		if(num >10) 
        		{
        			cont++;
        		}
        	}
        }
        System.out.println("\nOs n�meros maiores que 10 s�o: "+cont);
	}

}
