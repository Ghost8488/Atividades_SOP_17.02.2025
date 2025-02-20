package atividades_17_02_2025;

import java.util.Scanner;

public class AtividadeA_CelsiusFahrenheit {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);

	       Double Celsius, Fahrenheit;
	       
	      System.out.print("Digite a temnperatura em graus Celcius(°C): ");
	      
	      Celsius = stdin.nextDouble();
	      
	      Fahrenheit = Celsius*9/5+32;
	      
	      System.out.print("A temperatura em fahrenheit(°F) é: " + Fahrenheit);

	stdin.close();
	}

}
