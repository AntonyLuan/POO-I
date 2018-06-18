package modelo;

import java.util.ArrayList;

public class Cargo {
	private ArrayList<Conhecimento> req_desejado = new ArrayList<>();
	private ArrayList<Conhecimento> req_minimo = new ArrayList<>();
	private float remuneração = 0.0f;
	private Pessoa aspirante = new Pessoa();
	
	public Cargo() {
		
	}
	
	public Cargo(ArrayList<Conhecimento> req_d, ArrayList<Conhecimento> req_m, float salario) {
		setReq_desejado(req_d);
		setReq_minimo(req_m);
		setRemuneração(salario);
	}
	
	public ArrayList<Conhecimento> getReq_desejado() {
		return req_desejado;
	}
	
	public void setReq_desejado(ArrayList<Conhecimento> req_desejado) {
		if(req_desejado.size() < 1) {
			return ;
		}
		this.req_desejado = req_desejado;
	}
	
	public ArrayList<Conhecimento> getReq_minimo() {
		return req_minimo;
	}
	
	public void setReq_minimo(ArrayList<Conhecimento> req_minimo) {
		if(req_minimo.size() < 1) {
			return ;
		}
		this.req_minimo = req_minimo;
	}
	
	public float getRemuneração() {
		return remuneração;
	}
	
	public void setRemuneração(float remuneração) {
		if(remuneração < 0f) {
			return ;
		}
		this.remuneração = remuneração;
	}
	
}
