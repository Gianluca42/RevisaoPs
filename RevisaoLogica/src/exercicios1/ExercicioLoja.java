package exercicios1;

import java.util.Scanner;

public class ExercicioLoja {

	public static void main(String[] args) {
		int cdBoxfalse[] = new int[100];
		String dsBoxini[] = new String[100];
		menu(0,cdBoxfalse,dsBoxini);
		
	}
	public static void menu(int indeParou, int[] cdBox,String[] dsBox) {
		Scanner e = new Scanner(System.in);
		int nRes = 0;
		int cdBoxGuard[] = cdBox;
		String dsBoxMinha[] = dsBox;
			for(int k=0;k<99 && cdBox[k]>0;k++) {
			
			System.out.println(k+"- "+cdBox[k]+dsBoxMinha[k]);
		}
		System.out.println("1-CADASTRAR PROD");
		System.out.println("2-ALTERAR PROD");
		System.out.println("3-RELATORIO");
		System.out.println("4-SAIR");
		nRes=e.nextInt();		
		if(nRes==1) {
			if(indeParou>0)
			cadstrarProd(indeParou,cdBoxGuard,dsBoxMinha);
			else
			cadstrarProd(0,cdBoxGuard,dsBoxMinha);
				
		}else if(nRes==3) {
			
			Relat(cdBoxGuard,indeParou,dsBoxMinha);
		}else if(nRes==2) {
			alterProd(cdBoxGuard,indeParou,dsBoxMinha);
			
		}
		else {
			e.close();
		}
		
	}
	public static void alterProd(int[] cdBox,int indVolt,String[] dsBox) {
		Scanner e = new Scanner(System.in);
		int n=0;
		String resp="";
		
		System.out.println("Digite o cod do prod a alterar");
		n=e.nextInt();
		for(int i=0;i<100 && cdBox[i+1]>0;i++) {
			
			if(n==cdBox[i]) {
				System.out.println("codigo"+dsBox[i]);
				resp=e.next();
				dsBox[i]=resp;
		}
			
			
		}
		if(resp.equals("")) {
			System.out.println("Nao achei");
		}
		menu(indVolt,cdBox,dsBox);
		
	}
	public static void Relat(int[] cdBox,int indVolt,String[] dsBox) {
		Scanner e = new Scanner(System.in);
		int aux=0;
		int resp=0;
		String auxD;
		
		for(int k=0;k<99 && cdBox[k]>0;k++) {
			
			System.out.println(k+"- "+cdBox[k]+dsBox[k]);
		}
		
		for(int j=0;j<99&& cdBox[j+1]>0;j++)	{
			for(int i=0;i<99 && cdBox[i+1]>0;i++) {
				
				
				if(cdBox[i]>cdBox[i+1]) {
					aux = cdBox[i];
					cdBox[i]=cdBox[i+1];
					cdBox[i+1]=aux;
					auxD = dsBox[i];
					dsBox[i]=dsBox[i+1];
					dsBox[i+1]=auxD;
							
					
				}  
				
			}
		}
		System.out.println();
		for(int k=0;k<99 && cdBox[k]>0;k++) {
			
			System.out.println(k+"- "+cdBox[k]+dsBox[k]);
		}
		System.out.println("desejavoltar?");
		resp=e.nextInt();
		if(resp==0) {
			menu(indVolt,cdBox,dsBox);
			
		}
	}
	public static void cadstrarProd(int indVolt,int[] cdBoxguarda,String[] dsBoxV) {
		Scanner e = new Scanner(System.in);
		int cod=0;
		String dsc;
		int cdBox[] = cdBoxguarda;
		String dsBox[] = dsBoxV;
	if(indVolt >0) {
		for(int i = indVolt;i<100;i++) {	
			System.out.println("Digite o Codigo do produto");
			cod=e.nextInt();
			if(cod<0) {
				
				menu(i,cdBox,dsBox);
			}
			cdBox[i]=cod;
			System.out.println("Digite o desc do produto");
			dsc=e.next();
			
			dsBox[i]=dsc;
		
		}	
		
	}else {	
	for(int i = 0;i<100;i++) {	
		System.out.println("Digite o Codigo do produto");
		cod=e.nextInt();
		if(cod<0) {
			menu(i,cdBox,dsBox);
		}
		cdBox[i]=cod;
		System.out.println("Digite o desc do produto");
		dsc=e.next();
		
		dsBox[i]=dsc;

	}
	}
	}
	
}
