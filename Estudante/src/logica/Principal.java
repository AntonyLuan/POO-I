package logica;

import java.util.ArrayList;
import modelo.Estudante;
import modelo.Trabalhador;
import modelo.Universitario;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Estudante> lista = new ArrayList<>();
		Trabalhador trab = new Trabalhador();
		Universitario uni = new Universitario();
		
		lista.add(uni);
		lista.add(trab);
		
		for(Estudante e : lista) {
			e.estudar();
		}

	}

}
