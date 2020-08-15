package lolChampionshipSimulator.services;

import lolChampionshipSimulator.entities.*;
import lolChampionshipSimulator.exceptions.EquipeInvalidaException;

public class CalculoResultado {

	public Equipe calcularResultado(Equipe equipeA, Equipe equipeB) throws EquipeInvalidaException {

		try {
			double total = (equipeA.getNivelTotalDaEquipe()) + (equipeB.getNivelTotalDaEquipe());
			double porcentagemA = (equipeA.getNivelTotalDaEquipe() / total) * 100;
			double porcentagemB = (equipeB.getNivelTotalDaEquipe() / total) * 100;
			if (porcentagemA == porcentagemB) {
				double resultadoMesmoNivel = Math.random() * 100;
				return (resultadoMesmoNivel > porcentagemA) ? equipeB : equipeA;
			} else {
				double vantagem = Math.max(porcentagemA, porcentagemB);
				double desvantagem = Math.min(porcentagemA, porcentagemB);
				double resultado = Math.random() * 100;
				if (resultado > vantagem && ((vantagem - desvantagem) >= 10.0)) {
					resultado = Math.random() * 100;
					if (resultado > vantagem && ((vantagem - desvantagem) >= 20.0)) {
						resultado = Math.random() * 100;
						if (resultado > vantagem && ((vantagem - desvantagem) >= 30.0)) {
							resultado = Math.random() * 100;
						}
					}
				}
				if (resultado <= vantagem) {
					if (vantagem == porcentagemA) {
						return equipeA;
					} else if (vantagem == porcentagemB) {
						return equipeB;
					}
				} else if (resultado > vantagem) {
					if (vantagem == porcentagemA) {
						return equipeB;
					} else if (vantagem == porcentagemB) {
						return equipeA;
					}
				}
				return null;
			} // TODO adicionar resultado instanciado a lista de resultados da tabela
		} catch (EquipeInvalidaException e) {
			throw new EquipeInvalidaException(e.getMessage());
		}
	}
	
}
