package atividades_17_02_2025;

import java.util.Scanner;

public class AtividadeC_VolumeCilindro {

	public static void main(String[] args) {
		
         Scanner stdin = new Scanner(System.in);
		
		Double Raio, Altura, Volume;
		
		System.out.print("Digite o raio do cilindro: ");
		  Raio = stdin.nextDouble();
		
		System.out.print("Digite a altura do cilindro: ");
		  Altura = stdin.nextDouble();
		  
		  
		Volume = 3.14159 * (Raio*Raio) * Altura;
		
		System.out.print("O volume do cilindro é: ");
		System.out.println(String.format("%.1f", Volume));
		
		stdin.close();
	}

}
