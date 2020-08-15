package lolChampionshipSimulator.entities;

import lolChampionshipSimulator.entities.Regiao;
import lolChampionshipSimulator.entities.Jogador;
import java.util.List;


public class Equipe {
	
	private String nomeDaEquipe;
	private short anoDeFormacao;
	private double nivelTotalDaEquipe;
	private Regiao regiaoDaEquipe;
	private List<Jogador> jogadoresDaEquipe;
	
	public Equipe (String nomeDaEquipe, short anoDeFormacao, double nivelTotalDaEquipe, Regiao regiaoDaEquipe, List<Jogador> jogadoresDaEquipe) {
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

	public double getNivelTotalDaEquipe() {
		return nivelTotalDaEquipe;
	}

	public Regiao getRegiaoDaEquipe() {
		return regiaoDaEquipe;
	}

	public List<Jogador> getJogadoresDaEquipe() {
		return jogadoresDaEquipe;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipe other = (Equipe) obj;
		if (nomeDaEquipe == null) {
			if (other.nomeDaEquipe != null)
				return false;
		} else if (!nomeDaEquipe.equals(other.nomeDaEquipe))
			return false;
		if (regiaoDaEquipe != other.regiaoDaEquipe)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return (this.nomeDaEquipe);
	}
}
