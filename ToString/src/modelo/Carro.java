package modelo;

public class Carro {
	private String modelo;
	private int ano;
	
	public Carro(String modelo, int ano) {
		setModelo(modelo);
		setAno(ano);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "Modelo: " + getModelo() + " Ano: " + getAno();
	}
	
}
