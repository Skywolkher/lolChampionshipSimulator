package lolChampionshipSimulator.entities;

public class Resultado {

	private Equipe equipeVencedora;
	private Equipe equipeA;
	private Equipe equipeB;
	
	public Resultado (Equipe equipeA, Equipe equipeB, Equipe equipeVencedora) {
		this.equipeA = equipeA;
		this.equipeB = equipeB;
		this.equipeVencedora = equipeVencedora;
	}
	
	public Resultado (Equipe equipeA, Equipe equipeB) {
		this.equipeA = equipeA;
		this.equipeB = equipeB;
	}

	public Equipe getEquipeVencedora() {
		return this.equipeVencedora;
	}
	
	public void setEquipeVencedora(Equipe equipeVencedora) {
		this.equipeVencedora = equipeVencedora;
	}

	public Equipe getEquipeA() {
		return equipeA;
	}

	public void setEquipeA(Equipe equipeA) {
		this.equipeA = equipeA;
	}

	public Equipe getEquipeB() {
		return equipeB;
	}

	public void setEquipeB(Equipe equipeB) {
		this.equipeB = equipeB;
	}
	
	
}
