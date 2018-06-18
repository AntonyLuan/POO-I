package modelo;

public class Lutador implements Comparable<Lutador>{
	private float altura;
	private int forca;
	private String nome;
	
	public Lutador(String nome, int forca, float altura) {
		setNome(nome);
		setForca(forca);
		setAltura(altura);
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int compareTo(Lutador l) {
		return this.nome.compareTo(l.getNome());
	}
	
	public String toString() {
		return getNome() + " " + getForca() + " " + getAltura();
	}
}
