package boletin3_solis_maria;

import java.util.Scanner;

public class ejercicio3 {
	
	public static void main(String[] args) {
	var scanner = new Scanner(System.in);
	double numero1;
	System.out.println("Introduzca un número decimal: ");
	numero1 = scanner.nextDouble();
	
	if (( numero1 <= 0.99 && numero1 >= 0.01 ) || ( numero1 >= -0.99 && numero1 <= -0.01 ))
		System.out.println("El número es casi-cero");
	else
		System.out.println("El número no es casi-cero");
	
	
	scanner.close();
	}
}
