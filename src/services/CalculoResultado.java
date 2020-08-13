package services;

import lolChampionshipSimulator.entities.*;

public class CalculoResultado {

	public void calcularResultado(Equipe equipeA, Equipe equipeB) {
		
		Resultado resultadoFinal = new Resultado(equipeA, equipeB);
		
		double total = (equipeA.getNivelTotalDaEquipe()) + (equipeB.getNivelTotalDaEquipe());
		double porcentagemA = (equipeA.getNivelTotalDaEquipe()/total) * 100;
		double porcentagemB = (equipeB.getNivelTotalDaEquipe()/total) * 100;
		double vantagem = Math.max(porcentagemA, porcentagemB);
		double desvantagem = Math.min(porcentagemA, porcentagemB);
		double resultado = Math.random() * (vantagem - desvantagem +1) + desvantagem;
		if (resultado > vantagem && ((vantagem-desvantagem) >= 10.0)) {
			resultado = Math.random() * (vantagem - desvantagem +1) + desvantagem;
			if (resultado > vantagem && ((vantagem-desvantagem) >= 20.0)) {
				resultado = Math.random() * (vantagem - desvantagem +1) + desvantagem;
				if (resultado > vantagem && ((vantagem-desvantagem) >= 30.0)) {
					resultado = Math.random() * (vantagem - desvantagem +1) + desvantagem;
				}
			}
		}
		if (resultado <= vantagem) {
			if (vantagem == porcentagemA) {
				resultadoFinal.setEquipeVencedora(equipeA);
			} else if(vantagem == porcentagemB) {
				resultadoFinal.setEquipeVencedora(equipeB);
			}
		} else if (resultado > vantagem) {
			if (vantagem == porcentagemA) {
				resultadoFinal.setEquipeVencedora(equipeB);
			} else if (vantagem == porcentagemB) {
				resultadoFinal.setEquipeVencedora(equipeA);
			}
		}
		//TODO adicionar resultado instanciado a lista de resultados da tabela
	}
	
}
