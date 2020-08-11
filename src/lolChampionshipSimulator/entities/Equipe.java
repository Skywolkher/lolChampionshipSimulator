package lolChampionshipSimulator.entities;

import lolChampionshipSimulator.entities.Nivel;
import lolChampionshipSimulator.entities.Regiao;
import lolChampionshipSimulator.entities.Jogador;
import java.util.List;


public class Equipe {
	
	private String nomeDaEquipe;
	private short anoDeFormacao;
	private Nivel nivelTotalDaEquipe;
	private Regiao regiaoDaEquipe;
	private List<Jogador> jogadoresDaEquipe;
	
	public Equipe (String nomeDaEquipe, short anoDeFormacao, Nivel nivelTotalDaEquipe, Regiao regiaoDaEquipe, List<Jogador> jogadoresDaEquipe) {
		this.nomeDaEquipe = nomeDaEquipe;
		this.anoDeFormacao = anoDeFormacao;
		this.nivelTotalDaEquipe = nivelTotalDaEquipe;
		this.regiaoDaEquipe = regiaoDaEquipe;
		this.jogadoresDaEquipe = jogadoresDaEquipe;
	}
	
	public void setNome(String nome) {
		this.nomeDaEquipe = nome;
	}
	
	public void setAnoDeFormacao(short ano) {
		this.anoDeFormacao = ano;
	}
	
	public void setRegiaoDaEquipe(Regiao regiao) {
		this.regiaoDaEquipe = regiao;
	}
	
	public void setJogadoresDaEquipe(Jogador jogador) {
		jogadoresDaEquipe.add(jogador);
	}

	public String getNomeDaEquipe() {
		return nomeDaEquipe;
	}

	public short getAnoDeFormacao() {
		return anoDeFormacao;
	}

	public Nivel getNivelTotalDaEquipe() {
		return nivelTotalDaEquipe;
	}

	public Regiao getRegiaoDaEquipe() {
		return regiaoDaEquipe;
	}

	public List<Jogador> getJogadoresDaEquipe() {
		return jogadoresDaEquipe;
	}
	

}
