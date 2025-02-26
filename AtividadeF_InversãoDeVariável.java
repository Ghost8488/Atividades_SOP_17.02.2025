package atividades_17_02_2025;

import java.util.Scanner;

public class AtividadeF_InversãoDeVariável {

	public static void main(String[] args) {
	
	Scanner stdin = new Scanner(System.in);
		
		int N1, N2, Temp;
		
		System.out.println("Essse programa irá inverter o valor de daus variáveis inseridas.");
		System.out.println("Defina num número inteiro para a variavel 1: ");
		N1 = stdin.nextInt();
		System.out.println("Agora defina num número inteiro para a variavel 2: ");
		N2 = stdin.nextInt();
		
		System.out.println("O valor da variável 1 é: "+N1);
		System.out.println("O valor da variável 2 é: "+N2);
		System.out.println();
		
		
		

		Temp = N2;
	    N2 = N1;
	    N1 = Temp;
	    
	    System.out.println("Bom, agora veremos o resultado da inversão: ");
	    System.out.println("O valor da variável 1 é: "+N1);
		System.out.println("O valor da variável 2 é: "+N2);
		
		stdin.close();
	}

}
