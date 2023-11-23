package boletin3_solis_maria;

import java.util.Scanner;

public class ejercicio1 {
//Este ejercicio no esta bien explicado y no consigo ver si el numero que introduzco es para o impar
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduzca un número entero: ");
		numero = scanner.nextInt();
		if (numero % 2 == 0)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");
	
		
		scanner.close();

	}
}