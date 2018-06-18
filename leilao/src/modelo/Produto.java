package modelo;

public class Produto {
	private String nome;
	private float valorM = -1.0f;
	private Pessoa comprador = new Pessoa();
	private float valor = 0;
	

	public Produto(){
		
	}
	
	public Produto(String nome, float valorM) {
		setValorM(valorM);
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.equals("")) {
			System.out.println("O nome não deve ser uma string vazia.");
			return ;
		}
		this.nome = nome;
	}
	
	public float getValorM() {
		return valorM;
	}
	
	public void setValorM(float valorM) {
		if(valorM < 0) {
			System.out.println("O Valor minimo deve ser maior que zero.");
			return ;
		}
		this.valorM = valorM;
	}

	public Pessoa getComprador() {
		return comprador;
	}

	public void setComprador(Pessoa comprador) {
		this.comprador = comprador;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
