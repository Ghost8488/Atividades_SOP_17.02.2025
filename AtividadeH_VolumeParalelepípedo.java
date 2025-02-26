package atividades_17_02_2025;

import java.util.Scanner;

public class AtividadeH_VolumeParalelepípedo {

	public static void main(String[] args) {
		
        Scanner stdin = new Scanner(System.in);
		
		Double Altura, Largura, Comprimento, Volume;
		
		System.out.println("Olá, esse programa sserve para calcualr o volume de um paralelepípedo, uma caixa retangular.");
		System.out.println();
		System.out.println("Para isso preciso que digite a altura: ");
		Altura = stdin.nextDouble();
		System.out.println("A largura: ");
		Largura = stdin.nextDouble();
		System.out.println("E o comprimento: ");
		Comprimento = stdin.nextDouble();
		
		Volume = Comprimento*Largura*Altura;
		
		System.out.println("O volume do paralelepípedo é: "+Volume);

		stdin.close();

	}

}
