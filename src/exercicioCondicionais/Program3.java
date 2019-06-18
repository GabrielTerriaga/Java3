package exercicioCondicionais;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Entre com um numero: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//Condicao
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao Sao Multiplos");
		}
		
		//Fecha Scanner
		sc.close();
	}

}
