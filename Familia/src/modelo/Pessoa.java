package modelo;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private ArrayList<Objeto> itens = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Objeto> getItens() {
		return itens;
	}
	
	//Recebe a posi��o do objeto no array e pessoa para quem o objeto ser� tranferido.
	public void tranferirObj(int index, Pessoa destino) {
		//Pessoa destino recebe o objeto.
		destino.getItens().add(getItens().get(index));
		//O objeto � apagado da pessoa de origem.
		getItens().remove(index);
	}
}
