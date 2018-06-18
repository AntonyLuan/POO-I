package modelo;

public class Comida {
	private String nome;
	private int caloria;
	
	public Comida(String comida, int caloria) {
		setCaloria(caloria);
		setNome(comida);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCaloria() {
		return caloria;
	}

	public void setCaloria(int caloria) {
		this.caloria = caloria;
	}
	
	public String toString() {
		return "Comida: " + getNome() + " Calorias: " + getCaloria();
	}
}
