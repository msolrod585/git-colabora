package boletin3_solis_maria;

import java.util.Scanner;

public class ejercicio5 {

		public static void main(String[] args) {
			var scanner = new Scanner(System.in);
			int numero1;
			int numero2;
			int numero3;
			
			System.out.println("Introduzca el primer número entero: ");
			numero1 = scanner.nextInt();
			System.out.println("Introduzca el segundo número entero: ");
			numero2 = scanner.nextInt();
			System.out.println("Introduzca el tercer número entero: ");
			numero3 = scanner.nextInt();
			
		
			if (numero1 > numero2 ) 
				System.out.println("EL primer número es mayor que el segundo");
			else if (numero1 == numero2 ) 
				System.out.println("Ambos números son iguales");
			else
				System.out.println("El segundo número es mayor que el primero");
		
			
			scanner.close();
			
		}
	
	}

