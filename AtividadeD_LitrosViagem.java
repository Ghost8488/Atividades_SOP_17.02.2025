package atividades_17_02_2025;

import java.util.Scanner;

public class AtividadeD_LitrosViagem {

	public static void main(String[] args) {
		 	
        Scanner stdin = new Scanner(System.in);
		
		Double Tempo, Velocidade, Distancia, LitrosUsados;
		
		System.out.print("Digite o tempo gasto na viagem: ");
		   Tempo = stdin.nextDouble();
		   
		System.out.print("Digite a velocidade média durante a viajem: ");
		   Velocidade = stdin.nextDouble();
		   
		   
		   Distancia = Tempo * Velocidade;
		   
		   
		   LitrosUsados = Distancia / 12;
		   
		System.out.print ("O tempo gasto na viagem é " +Tempo);
		System.out.println();
		System.out.print ("A velociade média é: " +Velocidade);
		System.out.println();
		System.out.print ("A distância percorrida será: " +Distancia+"Km");
		System.out.println();
		System.out.print("A quantidade de litros usados na viagem será: ");
	    System.out.println(String.format("%.2f", LitrosUsados));
		stdin.close();
	}

}
