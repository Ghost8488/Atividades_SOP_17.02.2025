package atividades_17_02_2025;

import java.util.Scanner;

public class AtividadeB_FahrenheitCelsius {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);

	       Double Celsius, Fahrenheit;
	       
	      System.out.print("Digite a temnperatura em graus fahrenheit(°F): ");
	      
	      Fahrenheit = stdin.nextDouble();
	      
	       Celsius = ((Fahrenheit-32)*5) /9;
	      
	      System.out.print("A temperatura em Celcius(°C) é: " + Celsius);

	stdin.close();

	}

}
