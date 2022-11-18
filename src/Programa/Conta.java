package Programa;

import Utilitarios.Utils;

public class Conta {
	//Atributos da classe conta//
	private static int contadorDeContas = 1;
	
	private int numeroConta;
	private Pessoa pessoa;
	private Double saldo = 0.00;
	
	//Método construtor da classe//
	public Conta(Pessoa pessoa) {
		this.numeroConta = contadorDeContas;
		this.pessoa = pessoa;
		contadorDeContas += 1;
	}

	//Getters e Setters dos atributos da classe//
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	//Método ToString//
	public String toString() {
		return "\nNúmero da conta: " + this.getNumeroConta() + 
				"\nNome: " + this.pessoa.getNome() + 
				"\nCPF: " + this.pessoa.getCpf() +
				"\nEmail: " + this.pessoa.getEmail() +
				"\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
				"\n";
	}
	
	//Método Depositar//
	public void Depositar(Double valor) {
		//Se valor a depositar é maior que zero, ele irá fazer a somatória entre o valor e o saldo//
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Seu depósito foi realizado com sucesso!");
		} else {
			System.out.println("Não foi possível realizar o depósito!");
		}
	}
	
	//Método Sacar//
	public void Sacar(Double valor){
		//Se o valor a sacar for maior que zero e saldo for maior ou igual ao valor então ele irá subitrair valor de saldo// 
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	//Método Transferir//
	public void Transferir(Conta contaParaDeposito, Double valor){
		//Se o valor for maior que zero e saldo for maior ou igual valor, então saldo da conta subtrai valor e saldo da contaParaDeposito soma o valor//
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
			System.out.println("Transferência realizada com sucesso!");
		}else {
			System.out.println("Não foi possível realizar a transferência!");
		}
	}
	
	
}
