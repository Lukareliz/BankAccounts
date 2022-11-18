package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in); 
	
	static ArrayList<Conta> contasBancarias;
	
	public static void main (String[] args) {
		contasBancarias = new ArrayList<Conta>();
		Operacoes();
	}
	
	public static void Operacoes() {
		System.out.println("Seja bem-vindo!");
		System.out.println("Selecione a operação que deseja realizar:");
		System.out.println("");
		System.out.println("1 - Criar conta");
		System.out.println("2 - Depositar");
		System.out.println("3 - Sacar");
		System.out.println("4 - Transferir");
		System.out.println("5 - Listar Contas");
		System.out.println("6 - Sair");
		System.out.println("");
		
		int operacao = input.nextInt();
		
		//switch case das opções que o user pode escolher//
		switch(operacao) {
		case 1:
			criarConta();
			break;
		case 2:
			depositar();
			break;
		case 3:
			sacar();
			break;
		case 4:
			transferir();
			break;
		case 5:
			listarContas();
			break;
		case 6:
			System.out.println("Até mais, volte sempre!");
			System.exit(0);
		default:
			System.out.println("Opção inválida!");
			Operacoes();
			break;
		}
	}
	
	public static void criarConta() {
		System.out.println("\nNome: ");
		String nome = input.next();
		
		System.out.println("\nCPF: ");
		String cpf = input.next();
		
		System.out.println("Email: ");
		String email = input.next();
		
		Pessoa pessoa = new Pessoa(nome, cpf, email);
		
		Conta conta = new Conta(pessoa);
		
		contasBancarias.add(conta);
		
		System.out.println("Conta criada com sucesso!");
		
		Operacoes();
	}
	
	//Método encontrar conta, verifica se no array de números de conta existe alguma conta com o número digitado//
	private static Conta encontrarConta(int numeroConta) {
		Conta conta = null;
		if(contasBancarias.size() > 0) {
			for(Conta c: contasBancarias) {
				if(c.getNumeroConta() == numeroConta) {
				conta = c;
				}
			}
		}
		return conta;
	}
	
	
	public static void depositar() {
		System.out.println("Número da conta: ");
		int numeroConta = input.nextInt();
		
		Conta conta = encontrarConta(numeroConta);
		
		if(conta != null) {
			System.out.println("Qual valor deseja depositar?");
			Double valorDeposito = input.nextDouble();
			conta.Depositar(valorDeposito);
			System.out.println("Depósito efetuado com sucesso!");
		}else {
			System.out.println("Conta não encontrada!");
		}
		Operacoes();
	}
	
	
	public static void sacar() {
		System.out.println("Número da conta: ");
		int numeroConta = input.nextInt();
		
		Conta conta = encontrarConta(numeroConta);
		
		if(conta != null) {
			System.out.println("Qual valor deseja sacar?");
			Double valorSaque = input.nextDouble();
			conta.Sacar(valorSaque);
		}else {
			System.out.println("Conta não encontrada");
		}
		Operacoes();
	}
	
	
	public static void transferir() {
		System.out.println("Número da conta remetente: ");
		int numeroContaRemetente = input.nextInt();
		
		Conta contaRemetente = encontrarConta(numeroContaRemetente);
		
		if(contaRemetente != null) {
			System.out.println("Número da conta destinatária: ");
			int numeroContaDestinataria = input.nextInt();
			
			Conta contaDestinataria = encontrarConta(numeroContaDestinataria);
			
			if(contaDestinataria != null){
				System.out.println("Qual o valor da transferência?");
				Double valor = input.nextDouble();
				
				contaRemetente.Transferir(contaDestinataria, valor);
			}else {
				System.out.println("Conta destinatária não encontrada!");
			}
		}else {
			System.out.println("Conta remetente não encontrada!");
		}
		Operacoes();
	}
	
	
	public static void listarContas() {
		if(contasBancarias.size() > 0) {
			for(Conta conta: contasBancarias) {
				System.out.println(conta);
			}
		}else {
			System.out.println("Não há contas cadastradas!");
		}
		Operacoes();
	}
}
