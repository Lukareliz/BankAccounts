package Programa;

public class Pessoa {
	//Contador para definir um ID para cada conta//
	private static int cont = 1;
	
	//Atributos da classe pessoa//
	private String nome;
	private String cpf;
	private String email;
	
	//Método construtor da classe//
	public Pessoa(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		cont += 1;
	}
	
	//Getters e Setter dos atributos da classe pessoa//
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		return "\nNome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nEmail: " + this.getEmail();
	}
	
}
