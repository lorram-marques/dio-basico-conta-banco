package application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da agência: ");
		int agenciaNumero = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Por favor, digite qual agência: ");
		String agencia = sc.nextLine();
		
		System.out.println("Por favor, digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Por favor, digite seu saldo: ");
		double saldo = sc.nextDouble();

		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + agenciaNumero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque");
		
		sc.close();
	}

}
