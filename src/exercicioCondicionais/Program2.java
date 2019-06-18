package exercicioCondicionais;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Entre com um numero: ");
		int num = sc.nextInt();
		
		//Condicao
		if(num % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		//Fecha Scanner
		sc.close();
	}

}
