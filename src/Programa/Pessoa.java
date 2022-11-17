package Programa;

public class Pessoa {
	//Contador para definir um ID para cada conta//
	private static int cont = 1;
	
	//Atributos da classe pessoa//
	private String Nome;
	private String cpf;
	private String email;
	
	//Método construtor da classe//
	public Pessoa(String nome, String cpf, String email) {
		super();
		Nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	//Getters e Setter dos atributos da classe pessoa//
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
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
	
	
}
