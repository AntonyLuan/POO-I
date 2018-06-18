package modelo;

public class Pessoa {
	private String nome;

	public String getNome() {
		return nome;
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void printNome() {
		System.out.println("Eu sou " + getNome());
	}
}
