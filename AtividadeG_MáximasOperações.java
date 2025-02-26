package atividades_17_02_2025;

import java.util.Scanner;

public class AtividadeG_MáximasOperações {

	public static void main(String[] args) {
		
		
		
      Scanner stdin = new Scanner(System.in);
		
		int A, B, C, D, AB, AC, AD, BC, BD, CD;
	
		
		
		System.out.println("Esse pograma dirá todos os resultado possiveis de multiplicação e soma entre 4 números inteiros.");
		System.out.println();
		System.out.println("Digite o primerio número: ");
		      A = stdin.nextInt();
		System.out.println("Digite o primerio segundo: ");
		      B = stdin.nextInt();
		System.out.println("Digite o primerio terceiro: ");
		      C = stdin.nextInt();
		System.out.println("Digite o primerio quarto: ");
		      D = stdin. nextInt();
	
		      AB=A+B;
		      AC=A+C;
		      AD=A+D;
		      BC=B+C;
		      BD=B+D;
		      CD=C+D;
		      
		      System.out.println("O resultado de todas as somas possíveis entre os números fornecidos é: ");
		      	System.out.println(A+"+"+B+"="+AB);
		      	System.out.println(A+"+"+C+"="+AC);
		      	System.out.println(A+"+"+D+"="+AD);
		      	System.out.println(B+"+"+C+"="+BC);
		      	System.out.println(B+"+"+D+"="+BD);
		      	System.out.println(C+"+"+D+"="+CD);
		      	System.out.println();
		      	
		      AB=A*B;
		      AC=A*C;
		      AD=A*D;
		      BC=B*C;
		      BD=B*D;
		      CD=C*D; 
		      
		      System.out.println("O resultado de todas as multiplicações possíveis entre os números fornecidos é: ");
		      	System.out.println(A+"*"+B+"="+AB);
		      	System.out.println(A+"*"+C+"="+AC);
		      	System.out.println(A+"*"+D+"="+AD);
		      	System.out.println(B+"*"+C+"="+BC);
		      	System.out.println(B+"*"+D+"="+BD);
		      	System.out.println(C+"*"+D+"="+CD);

		   stdin.close();   

	}

}
