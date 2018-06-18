package modelo;

import java.util.ArrayList;


public class Pessoa {

	private String nome = "";
	private ArrayList<Lance> lances = new ArrayList<Lance>();
	private float cash = 0.0f;
	private ArrayList<Produto> produtosArrematados = new ArrayList<Produto>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int pushLance(Lance lance) {
		if(lance.getValor() == -1.0f) {
			System.out.println("O valor do lance ainda não foi definido.\nNada ocorreu.");
			return -1;
		}
		lances.add(lance);
		return lances.indexOf(lance);
	}
	
	public int pushProduto(Produto produto) {
		produtosArrematados.add(produto);
		return produtosArrematados.indexOf(produto);
	}
	
	public float getCash() {
		return cash;
	}
	public void setCash(float cash) {
		if(cash < 0) {
			System.out.println("O valor inicial disponível não pode ser menor que zero.");
		}
		this.cash = cash;
	}
	
	public float descontar(float valor) {
		float newSaldo = getCash() - valor;
		if(newSaldo < 0) {
			System.out.println("Saldo insuficiente.");
			return -1.0f;
		}
		setCash(newSaldo);
		return newSaldo;
	}
	
	public void printPessoa() {
		System.out.println("Nome: " + nome + " Valor disponível: " + cash);
		return ;
	}
	
	public int getLancesQtd(){
		return lances.size();
	}
	
	public int getProdutosQtd(){
		return produtosArrematados.size();
	}
	
	public float valorGasto() {
		float valor = 0.0f;
		for(Produto produto : produtosArrematados) {
			valor += produto.getValor();
		}
		return valor;
	}
	
}
