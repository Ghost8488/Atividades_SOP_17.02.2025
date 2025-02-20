package atividades_17_02_2025;

import java.util.Scanner;

public class AtividadeE_Prestacao {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		Double Prestacao, Valor, Taxa;
		int Tempo;
		
       System.out.println("Olá, este código serve para calcular o valor da prestação de um bem em atraso, seja ele qual for.");
       System.out.println("Vamos começar!");
       System.out.println();
       
          System.out.print("Digite o valor original da parcela: ");
       
           Valor = stdin.nextDouble();
       
          System.out.print("Ótimo, agora me diga qual a taxa de juros ao dia: ");
          
           Taxa = stdin.nextDouble();
       
          System.out.print("Agora diga o número de dias em atraso: ");
       
           Tempo = stdin.nextInt();
       
       
       Prestacao = Valor + (Valor * (Taxa / 100) * Tempo);
       
          System.out.print("O valor da prestação em atraso é: " + Prestacao);
          
          
    stdin.close();      
       
       
	}

}
