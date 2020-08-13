package lolChampionshipSimulator.entities;

public class Jogador {

	private String nomeDoJogador;
	private String nickName;
	private Posicao posicaoDoJogador;
	private double nivelIndividual;
	private Regiao regiao;
	private double taxaDeEvolucao;
	
	public Jogador (String nomeDoJogador, String nickName, Posicao posicaoDoJogador, double nivelIndividual, Regiao regiao, double taxaDeEvolucao) {
		this.nomeDoJogador = nomeDoJogador;
		this.nickName = nickName;
		this.posicaoDoJogador = posicaoDoJogador;
		this.nivelIndividual = nivelIndividual;
		this.regiao = regiao;
		this.taxaDeEvolucao = taxaDeEvolucao;
	}

	public String getNomeDoJogador() {
		return nomeDoJogador;
	}

	public void setNomeDoJogador(String nomeDoJogador) {
		this.nomeDoJogador = nomeDoJogador;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Posicao getPosicaoDoJogador() {
		return posicaoDoJogador;
	}

	public void setPosicaoDoJogador(Posicao posicaoDoJogador) {
		this.posicaoDoJogador = posicaoDoJogador;
	}

	public double getNivelIndividual() {
		return nivelIndividual;
	}

	public void setNivelIndividual(double nivelIndividual) {
		this.nivelIndividual = nivelIndividual;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	public double getTaxaDeEvolucao() {
		return taxaDeEvolucao;
	}

	public void setTaxaDeEvolucao(double taxaDeEvolucao) {
		this.taxaDeEvolucao = taxaDeEvolucao;
	}
	
	
}
