package modelo;

public class Lance {
	private float valor = -1.0f;
	private Pessoa pessoa;
	private Leilao leilao;
	
	public Lance(float valor, Pessoa pessoa) {
		setPessoa(pessoa);
		setValor(valor);
	}

	public float getValor() {
		if(this.valor < 0) {
			System.out.println("O valor ainda não foi definido. (-1 retornado)");
		}
		return valor;
	}

	public void setValor(float valor) {
		if(valor < 0) {
			System.out.println("O valor do lance não pode ser menor que zero.");
			return ;
		}
		this.valor = valor;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}
}
