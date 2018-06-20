package modelo;

import java.util.ArrayList;

public class Cargo {
	private String nome = "";
	private ArrayList<Conhecimento> requisitos = new ArrayList<>();
	private ArrayList<Candidato> candidatos = new ArrayList<>();
	private float remuneracao = 0.0f;
	private Pessoa contratado = null;
	
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public Cargo() {
		
	}
	
	public Cargo(String nome, float salario) {
		setNome(nome);
		setRemuneracao(salario);
	}
	
	
	public ArrayList<Conhecimento> getRequisitos() {
		return requisitos;
	}
	
	public void setRequisitos(ArrayList<Conhecimento> requisitos) {
		if(requisitos.size() < 1) {
			return ;
		}
		this.requisitos = requisitos;
	}
	
	public float getRemuneracao() {
		return remuneracao;
	}
	
	public void setRemuneracao(float remuneracao) {
		if(Float.compare(remuneracao, 0f) < 0) {
			return ;
		}
		this.remuneracao = remuneracao;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.compareTo("") == 0) {
			return ;
		}
		this.nome = nome;
	}
	
	public void  addRequisito(Conhecimento c) {
		getRequisitos().add(c);
	}

	public Pessoa getContratado() {
		return contratado;
	}

	public void setContratado(Pessoa contratado) {
		this.contratado = contratado;
	}
	
	public void analisarChance(Pessoa pessoa) {
		Candidato candidato = new Candidato(pessoa);
		float chance = (100.0f/(float)getRequisitos().size())/2;
		for(Conhecimento r : getRequisitos()) {
			for(Conhecimento c : candidato.getCurriculo()) {
				if(r.getNome().compareToIgnoreCase(c.getNome()) == 0) {
					candidato.setChance(candidato.getChance()+ (chance));
					if(r.getExperiencia() <= c.getExperiencia()) {
						candidato.setChance(candidato.getChance()+ (chance));
					}
				}
			}
		}
		candidatos.add(candidato);
		
	}
	
}
