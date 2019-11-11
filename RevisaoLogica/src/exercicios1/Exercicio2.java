package exercicios1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		long r;
		long nEnt;
		
		System.out.println("Digite um numnero");
		nEnt = e.nextByte();
		System.out.println();
		r=somaPares(nEnt);
		System.out.println();
		System.out.println("Olha "+r);
		

	}
	public static long somaPares(long n) {
		
		if(n <= 2) {
			
			return (0);
			
		}else {
			if(n%2==0) {
			return (somaPares(n-2)+n);
					
			}else {
			return (somaPares(n-1)+n);
				
				
			}
			}
		
	}

}
