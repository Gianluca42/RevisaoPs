package exercicios1;

import java.util.Scanner;

public class Exercicio2Laso {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		int nEnt;
		
		System.out.println("Digite um numnero");
		nEnt = e.nextInt();		
		System.out.println(somaPares(nEnt));
		
	}
	public static int somaPares(int n) {
		int soma = 0;
		for(int i=2;i<=n;i++) {
			
			if(i%2==0) {
				soma+=i;
				
			}
			
		}
		return (soma);
		
	}

}
