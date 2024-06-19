package conta.bancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Integer numero;
		String agencia;
		String nomeCliente;
		Double saldo;
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o seu nome!");
		nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o número da Agência!");
		agencia = scanner.nextLine();
		
		System.out.println("Por favor, digite o seu número!");
		numero = scanner.nextInt();
		
		System.out.println("Por favor, digite o seu saldo!");
		saldo = scanner.nextDouble();
		/**
		 * SEM O USO DO MÉTODO concat DA WRAPPER CLASS String.
		System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e o seu saldo "+ saldo + " já está disponível para saque" );
		**/
		
		//COM UTILIZAÇÃO DO MÉTODO concat.
		String mensagem = "Olá ".concat(nomeCliente)
	            .concat(", obrigado por criar uma conta em nosso banco. ")
	            .concat("Sua agência é: ").concat(agencia)
	            .concat(", conta: ").concat(numero.toString())
	            .concat(" e o seu saldo ").concat(saldo.toString())
	            .concat(" já está disponível para saque.");
		
		System.out.println(mensagem);
		
		scanner.close();
	}
}
