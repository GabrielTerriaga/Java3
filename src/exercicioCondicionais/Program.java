package exercicioCondicionais;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//Scanner
		Scanner sc= new Scanner(System.in);
		
		//Entrada
		System.out.println("Por favor entre com um numero: ");
		int num = sc.nextInt();
		
		//Condicional
		if(num < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NAO NEGATIVO");
		}
		
		//Fecha scanner
		sc.close();
	}

}
