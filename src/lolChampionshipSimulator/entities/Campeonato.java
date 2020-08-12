package lolChampionshipSimulator.entities;

import java.util.List;

public class Campeonato {

	private String nomeDoCampeonato;
	private List<Equipe> equipesParticipantes;
	private Tabela tabelaDoCampeonato;
	private Regiao regiaoDoCampeonato;
	private Formato formatoDoCampeonato;
	
	public Campeonato (String nomeDoCampeonato, List<Equipe> equipesParticipantes, Tabela tabelaDoCampeonato, 
			Regiao regiaoDoCampeonato, Formato formatoDoCampeonato) {
		this.nomeDoCampeonato = nomeDoCampeonato;
		this.equipesParticipantes = equipesParticipantes;
		this.tabelaDoCampeonato = tabelaDoCampeonato;
		this.regiaoDoCampeonato = regiaoDoCampeonato;
		this.formatoDoCampeonato = formatoDoCampeonato;
	}

	public String getNomeDoCampeonato() {
		return nomeDoCampeonato;
	}

	public void setNomeDoCampeonato(String nomeDoCampeonato) {
		this.nomeDoCampeonato = nomeDoCampeonato;
	}

	public List<Equipe> getEquipesParticipantes() {
		return equipesParticipantes;
	}

	public void setEquipesParticipantes(List<Equipe> equipesParticipantes) {
		this.equipesParticipantes = equipesParticipantes;
	}

	public Tabela getTabelaDoCampeonato() {
		return tabelaDoCampeonato;
	}

	public Regiao getRegiaoDoCampeonato() {
		return regiaoDoCampeonato;
	}

	public void setRegiaoDoCampeonato(Regiao regiaoDoCampeonato) {
		this.regiaoDoCampeonato = regiaoDoCampeonato;
	}

	public Formato getFormatoDoCampeonato() {
		return formatoDoCampeonato;
	}

	public void setFormatoDoCampeonato(Formato formatoDoCampeonato) {
		this.formatoDoCampeonato = formatoDoCampeonato;
	}
	
	
}
