package modelo;

import java.util.ArrayList;

public class Familia {
	private ArrayList<Pessoa> pessoas = new ArrayList<>();

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void  exibirTudo(){
		System.out.println("Exibindo Familia:");
		for(Pessoa p : this.pessoas) {
			System.out.println(p.getNome());
			for(Objeto o : p.getItens()) {
				System.out.println("\t"+p.getItens().indexOf(o)+" - "+o.getNome());
			}
		}
	}
}
