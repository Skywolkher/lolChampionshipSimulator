package lolChampionshipSimulator.entities;

public class Resultado {

	private double resultadoDaPartida;
	private Equipe equipeA;
	private Equipe equipeB;
	
	public Resultado (Equipe equipeA, Equipe equipeB) {
		this.equipeA = equipeA;
		this.equipeB = equipeB;
	}

	public double getResultadoDaPartida() {
		return resultadoDaPartida;
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
