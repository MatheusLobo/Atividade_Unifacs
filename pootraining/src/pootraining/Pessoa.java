package pootraining;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private Carro carro;
	
	public Pessoa (String nome, String cpf, int idade, Carro carro) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.carro = carro;
		
	}

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	public Carro getCarro() {
		return carro;
		
	}
}

	