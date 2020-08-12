package lolChampionshipSimulator.entities;

import java.util.List;

public class Tabela {

	private List<Equipe> equipes;
	private List<Resultado> resultadoDosJogos;
	
	public Tabela (List<Equipe> equipes, List<Resultado> resultadoDosJogos) {
		this.equipes = equipes;
		this.resultadoDosJogos = resultadoDosJogos;
	}
	
	public List<Equipe> getEquipes(){
		return this.equipes;
	}
	
	public List<Resultado> getResultadoDosJogos(){
		return this.resultadoDosJogos;
	}
}
