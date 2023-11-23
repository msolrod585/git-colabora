package boletin3_solis_maria;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
			var scanner = new Scanner(System.in);
			int horastrabajadas;
			System.out.println("Introduzca las horas trabajadas: ");
			horastrabajadas = scanner.nextInt();
			int sueldoporhora = 12;
			int sueldoextra = 16;
			int sueldo; 
			int horaslimite = 40;
			
			if ( horastrabajadas <= horaslimite ) {
				sueldo = horastrabajadas * sueldoporhora;
				System.out.println("EL sueldo es de " + sueldo );
			}else if ( horastrabajadas > horaslimite ) { 
				int horasextra = horastrabajadas - horaslimite; 
				sueldo = ( horasextra * sueldoextra ) + ( horaslimite * sueldoporhora );
				System.out.println("EL sueldo es de " + sueldo );
			}
		
			
			scanner.close();			
	}
}
