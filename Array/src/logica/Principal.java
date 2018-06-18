package logica;

import java.util.ArrayList;

import modelo.Pessoa;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> list = new ArrayList<>();
		Pessoa p1 = new Pessoa("Joao");
		Pessoa p2 = new Pessoa("Silva");
		Pessoa p3 = new Pessoa("Carlos");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i).printNome();
		}
		
		for(Pessoa p : list) {
			p.printNome();
		}
		
		list.forEach(item->item.printNome());

	}

}
