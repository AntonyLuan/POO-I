package modelo;

import java.util.ArrayList;

public class Pessoa {
	private String nome = "";
	private ArrayList<Conhecimento> curriculo = new ArrayList<>();
	private float sal_desejado = 0f;
	private Cargo recomendado = new Cargo();
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, ArrayList<Conhecimento> curriculo, float sal_desejado) {
		setNome(nome);
		setCurriculo(curriculo);
		setSal_desejado(sal_desejado);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.equals("")) {
			return ;
		}
		this.nome = nome;
	}
	
	public ArrayList<Conhecimento> getCurriculo() {
		return curriculo;
	}
	
	public void setCurriculo(ArrayList<Conhecimento> curriculo) {
		if(curriculo.isEmpty()) {
			return ;
		}
		this.curriculo = curriculo;
	}
	
	public float getSal_desejado() {
		return sal_desejado;
	}
	
	public void setSal_desejado(float sal_desejado) {
		if(sal_desejado < 0f) {
			return ;
		}
		this.sal_desejado = sal_desejado;
	}
	
	public Cargo getRecomendado() {
		return recomendado;
	}
	
	public void setRecomendado(Cargo recomendado) {
		if(recomendado.getReq_minimo().isEmpty()) {
			return ;
		}
		this.recomendado = recomendado;
	}
	
}
