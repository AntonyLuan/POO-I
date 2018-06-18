package logica;

import modelo.Familia;
import modelo.Pessoa;
import modelo.Objeto;

public class Principal {

	public static void main(String[] args) {
		Familia f = new Familia();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Objeto o1 = new Objeto();
		Objeto o2 = new Objeto();
		p1.setNome("Joao");
		p2.setNome("Silva");
		
		o1.setNome("carro");
		o2.setNome("moto");
		p1.getItens().add(o1);
		p1.getItens().add(o2);
		
		f.getPessoas().add(p1);
		f.getPessoas().add(p2);
		f.exibirTudo();
		p1.tranferirObj(1, p2);
		f.exibirTudo();
		
	}

}
