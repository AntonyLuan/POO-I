package modelo;

import java.util.ArrayList;

public class Empresa {
	private String nome = "";
	private ArrayList<Cargo> cargos = new ArrayList<>();
	
	public Empresa() {
		
	}
	
	public Empresa(String nome) {
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.compareTo("") == 0) {
			return ;
		}
		this.nome = nome;
	}
	
	public void addCargo(Cargo c) {
		this.cargos.add(c);
	}
}
