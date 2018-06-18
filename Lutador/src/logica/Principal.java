package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import modelo.Lutador;

public class Principal {

	public static void main(String[] args) {
		Lutador l1 = new Lutador("Ariel", 1, 1.60f);
		Lutador l2 = new Lutador("Silva", 3, 1.80f);
		Lutador l3 = new Lutador("Vanderlay", 5, 1.70f);
		ArrayList<Lutador> list = new ArrayList<>();
		
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		Comparator<Lutador> c1 = new Comparator<Lutador>() {

			@Override
			public int compare(Lutador o1, Lutador o2) {
				return o2.getForca() - o1.getForca();
			}
			
		};
		
		Comparator<Lutador> c2 = new Comparator<Lutador>() {

			@Override
			public int compare(Lutador o1, Lutador o2) {
				return Float.compare(o2.getAltura(), o1.getAltura());
			}
		};
		
		Collections.sort(list);
		
		for(Lutador l : list) {
			System.out.println(l);
		}
		
		Collections.sort(list, c1);
		
		for(Lutador l : list) {
			System.out.println(l);
		}
		
		Collections.sort(list, c2);
		
		for(Lutador l : list) {
			System.out.println(l);
		}
	}

}
