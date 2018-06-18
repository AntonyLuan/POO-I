package logica;

import java.util.ArrayList;
import modelo.*;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		Pessoa p = new Pessoa("Antony", 19);
		Comida c = new Comida("Purê", 500);
		Carro car = new Carro("Pegeout 206", 2006);
		
		list.add(p);
		list.add(car);
		list.add(c);
		
		for(Object o : list){
			System.out.println(o);
		}

	}

}
