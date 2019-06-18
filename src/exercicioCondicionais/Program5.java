package exercicioCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		//Locale
		Locale.setDefault(Locale.US);
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("CODIGO | ESPECIFICACAO  | PRECO");
		System.out.println(" 1       Hot-Dog          R$ 4.00  ");
		System.out.println(" 2       X-Salada         R$ 4.50  ");
		System.out.println(" 3       X-Bacon          R$ 5.00  ");
		System.out.println(" 4       Torrada simples  R$ 2.00  ");
		System.out.println(" 5       Refrigerante     R$ 1.50  ");
		System.out.println();
		System.out.println("Digite sua opcao e sua quantidade: ");
		int cod = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0;
		
		//Condicao
		if(cod == 1) {
			double preco = 4.00;
			total = quantidade * preco;
		}else if(cod == 2) {
			double preco = 4.50;
			total = quantidade * preco;
		}else if(cod == 3) {
			double preco = 5.00;
			total = quantidade * preco;
		}else if(cod == 4) {
			double preco = 2.00;
			total = quantidade * preco;
		}else if(cod == 5){
			double preco = 1.50;
			total = quantidade * preco;
		}
		
		//Saida
		System.out.printf("Total: R$%.2f", total);
		
		//Fecha Scanner
		sc.close();
	}

}
