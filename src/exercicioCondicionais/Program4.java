package exercicioCondicionais;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Entre com a hora inicial do jogo e a hora final: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int dia = 24;
		int jogado;
		
		//Condicao
		if(a < b) {
			jogado = a - b;
		}else {
			jogado = dia - a + b;
		}
		System.out.println("O JOGO DUROU " + jogado + " HORA(S)");
		//Fecha Scanner
		sc.close();
	}

}
