package modelo;

import java.util.ArrayList;
import modelo.Produto;


public class Leilao {
	private Produto produto;
	private Lance lanceAtual = null;;
	private ArrayList<Lance> lances = new ArrayList<Lance>();
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private int rodada = 0;
	
	
	public Leilao(Produto produto) {
		setProduto(produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public int darLance(Lance lance) {
		this.lances.add(lance);
		setLanceAtual(lance);
		return this.lances.indexOf(lance);
	}

	public Lance getLanceAtual() {
		return lanceAtual;
	}

	public void setLanceAtual(Lance lanceAtual) {
		this.lanceAtual = lanceAtual;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public int cadastrarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		return pessoas.indexOf(pessoa);
	}
	
	public Pessoa vender() {
		produto.setComprador(lanceAtual.getPessoa());
		produto.setValor(lanceAtual.getValor());
		lanceAtual.getPessoa().descontar(lanceAtual.getValor());
		lanceAtual.getPessoa().pushProduto(produto);
		System.out.println("Produto Vendido para: ");
		lanceAtual.getPessoa().printPessoa();
		return lanceAtual.getPessoa();
	}

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}
}
