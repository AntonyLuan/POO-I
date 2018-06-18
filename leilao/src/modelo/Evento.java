package modelo;

import java.util.ArrayList;

public class Evento {
	private String nome = "";
	private ArrayList<Leilao> leiloes = new ArrayList<Leilao>();
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public int cadastrarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		return pessoas.indexOf(pessoa);
	}
	
	public int cadastrarLeilao(Leilao leilao) {
		leiloes.add(leilao);
		return leiloes.indexOf(leilao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.equals("")) {
			System.out.println("O nome do Evento não pode ser uma String vazia.\nNada aconteceu.");
			return ;
		}
		this.nome = nome;
	}
	
	public Pessoa maisLances() {
		int maior = 0;
		Pessoa p = null;
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getLancesQtd() > maior) {
				maior = pessoa.getLancesQtd();
				p = pessoa;
			}
		}
		return p;
	}
	
	public Pessoa maisProdutos() {
		int maior = 0;
		Pessoa p = null;
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getProdutosQtd() > maior) {
				maior = pessoa.getProdutosQtd();
				p = pessoa;
			}
		}
		return p;
	}
	
	public Pessoa maiorQuantia() {
		float maior = 0.0f;
		Pessoa p = null;
		for(Pessoa pessoa : pessoas) {
			if(pessoa.valorGasto() > maior) {
				maior = pessoa.valorGasto();
				p = pessoa;
			}
		}
		return p;
	}
	
	public Pessoa menorQuantia() {
		float menor = pessoas.get(0).valorGasto();
		Pessoa p = null;
		for(Pessoa pessoa : pessoas) {
			if(pessoa.valorGasto() < menor) {
				menor = pessoa.valorGasto();
				p = pessoa;
			}
		}
		return p;
	}
	
	public ArrayList<Pessoa> getPessoas(){
		return this.pessoas;
	}
	
	public ArrayList<Leilao> getLeilao(){
		return leiloes;
	}
}
